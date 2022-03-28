package com.example.weather

import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.weather.databinding.RecyclerviewItemBinding
import com.example.weather.model.CurrentWeather

class ForecastAdapter : RecyclerView.Adapter<ForecastAdapter.ForecastViewHolder>() {

    var forecast : List<CurrentWeather> = emptyList()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ForecastViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = RecyclerviewItemBinding.inflate(inflater, parent, false)
        return ForecastViewHolder(binding)
    }



    override fun onBindViewHolder(holder: ForecastViewHolder, position: Int) {
        val currentWeather = forecast[position]
        with(holder.binding){
            temp.text = currentWeather.temperature
            description.text = currentWeather.description
            time.text = currentWeather.time
            // weatherIcon.setImageDrawable(getWeatherIcon(currentWeather.description))
        }
    }

    override fun getItemCount(): Int = 40 // нужен размер списка от API запроса

//    private fun getWeatherIcon (description : String) : Drawable? {
//        return null
//    }

    class ForecastViewHolder(val binding : RecyclerviewItemBinding) : RecyclerView.ViewHolder(binding.root)
}
