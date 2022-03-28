package com.example.weather.model

// Как то заполнять элемент списка данными типа String из API и вставлять соотв. иконку

class ForecastService {

    private var currentWeather = mutableListOf<CurrentWeather>()

    init {

    }

    fun getForecast () : List<CurrentWeather> {
        return currentWeather
    }
}