package google.codelabs.weatherapplication.behaviours

import android.content.Context
import android.util.AttributeSet
import android.view.View
import androidx.coordinatorlayout.widget.CoordinatorLayout
import google.codelabs.weatherapplication.R

class FeelsLikeBehaviour(context: Context?, attrs: AttributeSet?) :
    CommonBehaviour(context, attrs) {

    override fun calculatePosition(avatar: View, progress: Float, parent: CoordinatorLayout) {

        val finalXPosition = parent.resources.getDimension(R.dimen.feels_like_final_x)
        val finalYPosition = parent.resources.getDimension(R.dimen.feels_like_final_y)

        val startXPosition = (parent.resources.getDimension(R.dimen.min_max_start_x) +
                parent.findViewById<View>(R.id.temp_min_max_t).width * 1.2).toInt()
        val startYPosition =  parent.resources.getDimension(R.dimen.min_max_start_y)

        avatar.y = (finalYPosition - startYPosition) * progress + startYPosition
        avatar.x = (finalXPosition - startXPosition) * progress + startXPosition
        avatar.alpha = 1 - 3F * progress
    }

}