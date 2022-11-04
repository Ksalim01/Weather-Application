package google.codelabs.weatherapplication.screen.citysearch

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.inputmethod.EditorInfo
import android.view.inputmethod.InputMethodManager
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import google.codelabs.weatherapplication.R
import google.codelabs.weatherapplication.databinding.FragmentCitySearchBinding
import google.codelabs.weatherapplication.repository.forecast.entities.CityAddress
import google.codelabs.weatherapplication.repository.forecast.entities.UpdateResult
import google.codelabs.weatherapplication.screen.MainActivity
import google.codelabs.weatherapplication.screen.citysearch.utils.correctCityName
import google.codelabs.weatherapplication.screen.cityweather.fragment.CityWeatherFragment.Companion.CITY_KEY
import google.codelabs.weatherapplication.screen.sendResultToPreviousFragment
import javax.inject.Inject

class CitySearchFragment : Fragment(R.layout.fragment_city_search) {
    private lateinit var binding: FragmentCitySearchBinding

    private lateinit var citySearchListAdapter: CitySearchListAdapter

    @Inject
    lateinit var citySearchViewModel: CitySearchViewModel

    override fun onAttach(context: Context) {
        super.onAttach(context)
        (activity as MainActivity).mainActivityComponent.inject(this)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentCitySearchBinding.bind(view)

        initAll()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        citySearchViewModel.response.removeObservers(viewLifecycleOwner)
    }

    private fun initAll() {
        hideAll()
        initCityListSearch()
        initSearchBar()
        initToolbar()
    }

    private fun initCityListSearch() {
        citySearchListAdapter = CitySearchListAdapter {
            citySearchViewModel.addCity(it)
            findNavController().navigateUp()
        }

        with(binding.citySuggestions) {
            layoutManager =
                LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
            adapter = citySearchListAdapter
        }

        subscribeToUpdates()
    }

    private fun initToolbar() {
        binding.toolbar.inflateMenu(R.menu.menu_city_search)
        binding.toolbar.setOnMenuItemClickListener {
            when (it.itemId) {
                R.id.clearText -> {
                    clearSearchResult()
                    showSoftKeyboard(binding.searchBar)
                    binding.searchBar.text.clear()
                    true
                }
                else -> false
            }
        }

        binding.toolbar.setNavigationOnClickListener {
            findNavController().navigateUp()
        }

        showSoftKeyboard(binding.searchBar)
    }

    private fun showSoftKeyboard(view: View) {
        if (view.requestFocus()) {
            val inputMethodManager: InputMethodManager =
                requireContext().getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            inputMethodManager.showSoftInput(view, InputMethodManager.SHOW_IMPLICIT)
        }
    }

    private fun initSearchBar() {
        binding.searchBar.setOnEditorActionListener { v, actionId, event ->
            when (actionId) {
                EditorInfo.IME_ACTION_DONE -> {
                    handleSearchRequest(v.text.toString())
                    true
                }
                else -> false
            }
        }
    }

    private fun handleSearchRequest(text: String?) {
        if (text == null || text.isEmpty()) return
        hideAll()
        binding.progressBar.visibility = View.VISIBLE
        citySearchViewModel.checkCityExistence(correctCityName(text))
    }

    private fun showSearchResult(cityAddress: CityAddress) {
        citySearchListAdapter.data = listOf(cityAddress)
        binding.citySuggestions.visibility = View.VISIBLE
    }

    private fun clearSearchResult() {
        hideAll()
        citySearchListAdapter.data = emptyList()
    }

    private fun showResponseText(text: String) {
        binding.responseResult.text = text
        binding.responseResult.visibility = View.VISIBLE
    }

    private fun subscribeToUpdates() {
        citySearchViewModel.response.observe(viewLifecycleOwner) {
            Log.d(TAG, "${it.cityAddress?.city}")
            hideAll()
            when (it.result) {
                UpdateResult.NO_INTERNET_CONNECTION -> showResponseText(getString(R.string.lost_connection))
                UpdateResult.NO_RESPONSE -> showResponseText(getString(R.string.no_response))
                UpdateResult.SUCCESSFUL -> showSearchResult(it.cityAddress!!)
            }
        }
    }

    private fun hideAll() {
        with(binding) {
            citySuggestions.visibility = View.GONE
            progressBar.visibility = View.GONE
            responseResult.visibility = View.GONE
        }
    }

    private companion object {
        const val TAG = "CitySearchFragment"
    }
}