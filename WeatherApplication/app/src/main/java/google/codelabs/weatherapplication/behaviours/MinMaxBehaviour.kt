package google.codelabs.weatherapplication.behaviours

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.TextView
import androidx.coordinatorlayout.widget.CoordinatorLayout
import google.codelabs.weatherapplication.R


class MinMaxBehaviour(context: Context?, attrs: AttributeSet?) :
    CommonBehaviour(context, attrs) {

    override fun calculatePosition(avatar: View, progress: Float, parent: CoordinatorLayout) {
        val startXPosition = parent.resources.getDimension(R.dimen.min_max_start_x)
        val startYPosition = parent.resources.getDimension(R.dimen.min_max_start_y)
        val finalYPosition = parent.resources.getDimension(R.dimen.min_max_final_y)

        val finalXPosition = parent.resources.getDimension(R.dimen.temperature_final_x) +
                (parent.findViewById<TextView>(R.id.current_temperature).length() + 1) * parent.resources.getDimension(R.dimen.min_max_final_x)


        avatar.y = (finalYPosition - startYPosition) * progress + startYPosition
        avatar.x = (finalXPosition - startXPosition) * progress + startXPosition
//        avatar.alpha = abs(progress - 0.5F)
//        (avatar as? TextView)?.setTextColor((Color.rgb( progress,  progress, progress)))
//        (avatar as? TextView)?.setTextColor((Color.BLACK * progress).toInt())
    }

}