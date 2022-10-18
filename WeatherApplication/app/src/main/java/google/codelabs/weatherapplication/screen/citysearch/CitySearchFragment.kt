package google.codelabs.weatherapplication.screen.citysearch

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.inputmethod.EditorInfo
import android.view.inputmethod.InputMethodManager
import android.widget.Toast
import androidx.appcompat.widget.SearchView
import androidx.core.content.ContextCompat.getSystemService
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import google.codelabs.weatherapplication.App
import google.codelabs.weatherapplication.R
import google.codelabs.weatherapplication.databinding.FragmentCitySearchBinding
import google.codelabs.weatherapplication.repository.forecast.UpdateResult
import javax.inject.Inject

class CitySearchFragment : Fragment(R.layout.fragment_city_search) {
    private lateinit var binding: FragmentCitySearchBinding

    @Inject
    lateinit var citySearchViewModel: CitySearchViewModel

    override fun onAttach(context: Context) {
        super.onAttach(context)
        (context.applicationContext as App).appComponent.inject(this)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentCitySearchBinding.bind(view)

        initAll()
    }

    private fun initAll() {
        initCityListSearch()
        initSearchBar()
        initToolbar()
    }

    private fun initCityListSearch() {
        binding.citySuggestions.visibility = View.GONE
        with(binding.citySuggestions) {
            layoutManager =
                LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
            adapter = CitySearchListAdapter()
        }
    }

    private fun initToolbar() {
        binding.toolbar.inflateMenu(R.menu.menu_city_search)
        binding.toolbar.setOnMenuItemClickListener {
            when (it.itemId) {
                R.id.clearText -> {
                    clearSearchResult()
                    showSoftKeyboard(binding.searchBar)
                    binding.searchBar.text.clear()
                    false
                }
                else -> false
            }
        }
        binding.toolbar.setNavigationOnClickListener {
            findNavController().navigateUp()
        }
    }

    fun showSoftKeyboard(view: View) {
        if (view.requestFocus()) {
            val imm: InputMethodManager = requireContext().
                getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.showSoftInput(view, InputMethodManager.SHOW_IMPLICIT)
        }
    }
    private fun initSearchBar() {
        binding.searchBar.setOnEditorActionListener { v, actionId, event ->
            if (actionId == EditorInfo.IME_ACTION_DONE) {
                handleSearchRequest(v.text.toString())
                true
            }
            false
        }

    }

    private fun handleSearchRequest(text: String?) {
        Log.d(TAG, "handleSearchRequest with text = $text")
        if (text == null) return
        citySearchViewModel.addCity(text.lowercase())
        citySearchViewModel.response.observe(viewLifecycleOwner) {
            when (it) {
                UpdateResult.NO_INTERNET_CONNECTION -> Toast.makeText(
                    requireContext(),
                    resources.getString(R.string.lost_connection),
                    Toast.LENGTH_SHORT
                ).show()
                UpdateResult.SUCCESSFUL -> showSearchResult(text)
                else -> {
                    Log.d(TAG, "No response")
                }
            }
        }
    }

    private fun showSearchResult(city: String) {
        binding.citySuggestions.visibility = View.VISIBLE
        (binding.citySuggestions.adapter as CitySearchListAdapter).data =
            listOf(CityAddress(city, ""))
    }

    private fun clearSearchResult() {
        (binding.citySuggestions.adapter as CitySearchListAdapter).data = listOf()
        binding.citySuggestions.visibility = View.GONE
    }

    private companion object {
        const val TAG = "CitySearchFragment"
    }
}