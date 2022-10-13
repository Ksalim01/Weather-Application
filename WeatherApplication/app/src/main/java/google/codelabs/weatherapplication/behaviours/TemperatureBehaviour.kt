package google.codelabs.weatherapplication.behaviours

import android.content.Context
import android.util.AttributeSet
import android.view.View
import androidx.coordinatorlayout.widget.CoordinatorLayout
import google.codelabs.weatherapplication.R


class TemperatureBehaviour(context: Context?, attrs: AttributeSet?) :
    CommonBehaviour(context, attrs) {

    override fun calculatePosition(avatar: View, progress: Float, parent: CoordinatorLayout) {
        val startXPosition = parent.resources.getDimension(R.dimen.temperature_start_x)
        val startYPosition = parent.resources.getDimension(R.dimen.temperature_start_y)
        val finalXPosition = parent.resources.getDimension(R.dimen.temperature_final_x)
        val finalYPosition = parent.resources.getDimension(R.dimen.temperature_final_y)

        avatar.y = (finalYPosition - startYPosition) * progress + startYPosition
        avatar.x = (finalXPosition - startXPosition) * progress + startXPosition
//        avatar.alpha = (abs(progress - 0.5F) * 2
//        (avatar as? TextView)?.setTextColor((Color.rgb( progress,  progress, progress)))
//        (avatar as? TextView)?.setTextColor((Color.BLACK * progress).toInt())
    }

}