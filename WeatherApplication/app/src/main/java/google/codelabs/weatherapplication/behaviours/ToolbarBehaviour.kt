package google.codelabs.weatherapplication.behaviours

import android.content.Context
import android.graphics.Color
import android.util.AttributeSet
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.widget.Toolbar
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.core.view.iterator
import androidx.recyclerview.widget.RecyclerView
import google.codelabs.weatherapplication.R
import org.w3c.dom.Text

class ToolbarBehaviour(context: Context?, attrs: AttributeSet?) :
    CommonBehaviour(context, attrs) {


    override fun calculatePosition(avatar: View, progress: Float, parent: CoordinatorLayout) {
        (avatar as? Toolbar)?.findViewById<View>(R.id.tool_city)?.alpha = progress

        parent.background.alpha = ((1 - progress) * 255).toInt()
        val colorLight = Color.WHITE
        val colorDark = Color.BLACK
        if (progress < 0.5) {
            changeColor(parent, R.drawable.background_rectangle, colorLight)
        } else {
           changeColor(parent, R.drawable.background_rectangle_white, colorDark)
        }
    }

    private fun changeColor(parent: CoordinatorLayout, background: Int, color: Int) {
        parent.findViewById<TextView>(R.id.current_temperature).setTextColor(color)
        parent.findViewById<TextView>(R.id.temp_min_max_t).setTextColor(color)
        parent.findViewById<TextView>(R.id.feels_like).setTextColor(color)
        parent.findViewById<TextView>(R.id.current_day).setTextColor(color)
        parent.findViewById<TextView>(R.id.current_time).setTextColor(color)

        parent.findViewById<View>(R.id.day_forecast).setBackgroundResource(background)
        for (elem in parent.findViewById<RecyclerView>(R.id.day_forecast)) {
            elem.findViewById<TextView>(R.id.time).setTextColor(color)
            elem.findViewById<TextView>(R.id.temperature).setTextColor(color)
        }
        parent.findViewById<View>(R.id.week_forecast).setBackgroundResource(background)
        for (elem in parent.findViewById<LinearLayout>(R.id.week_forecast)) {
            elem.findViewById<TextView>(R.id.day).setTextColor(color)
            elem.findViewById<TextView>(R.id.max_min_temp).setTextColor(color)
            elem.findViewById<TextView>(R.id.daily_humidity).setTextColor(color)
        }
        parent.findViewById<View>(R.id.sunset_sunrise).setBackgroundResource(background)
        parent.findViewById<View>(R.id.sunset_sunrise).findViewById<TextView>(R.id.sunrise_title).setTextColor(color)
        parent.findViewById<View>(R.id.sunset_sunrise).findViewById<TextView>(R.id.sunset_title).setTextColor(color)
        parent.findViewById<View>(R.id.sunset_sunrise).findViewById<TextView>(R.id.sunrise_time).setTextColor(color)
        parent.findViewById<View>(R.id.sunset_sunrise).findViewById<TextView>(R.id.sunset_time).setTextColor(color)

        parent.findViewById<View>(R.id.uv_wind_humidity).setBackgroundResource(background)

        parent.findViewById<View>(R.id.uv_wind_humidity).findViewById<TextView>(R.id.uv_text).setTextColor(color)
        parent.findViewById<View>(R.id.uv_wind_humidity).findViewById<TextView>(R.id.uv_index).setTextColor(color)
        parent.findViewById<View>(R.id.uv_wind_humidity).findViewById<TextView>(R.id.wind_text).setTextColor(color)
        parent.findViewById<View>(R.id.uv_wind_humidity).findViewById<TextView>(R.id.wind_rate).setTextColor(color)
        parent.findViewById<View>(R.id.uv_wind_humidity).findViewById<TextView>(R.id.humidity_text).setTextColor(color)
        parent.findViewById<View>(R.id.uv_wind_humidity).findViewById<TextView>(R.id.humidity_value).setTextColor(color)
    }
}