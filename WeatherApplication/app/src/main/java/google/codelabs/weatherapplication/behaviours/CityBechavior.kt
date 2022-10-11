package google.codelabs.weatherapplication.behaviours

import android.content.Context
import android.util.AttributeSet
import android.view.View
import androidx.coordinatorlayout.widget.CoordinatorLayout
import google.codelabs.weatherapplication.R
import kotlin.math.pow

class CityBechavior (context: Context?, attrs: AttributeSet?) :
    CommonBechavior(context, attrs) {

    init {}


    override fun calculatePosition(avatar: View, progress: Float, parent: CoordinatorLayout) {
        avatar.y = parent.resources.getDimension(R.dimen.city_y)
        avatar.x = parent.resources.getDimension(R.dimen.city_x)
        avatar.alpha = 1 - 3F * progress
    }
}