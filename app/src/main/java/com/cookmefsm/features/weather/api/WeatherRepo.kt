package com.cookmefsm.features.weather.api

import com.cookmefsm.base.BaseResponse
import com.cookmefsm.features.task.api.TaskApi
import com.cookmefsm.features.task.model.AddTaskInputModel
import com.cookmefsm.features.weather.model.ForeCastAPIResponse
import com.cookmefsm.features.weather.model.WeatherAPIResponse
import io.reactivex.Observable

class WeatherRepo(val apiService: WeatherApi) {
    fun getCurrentWeather(zipCode: String): Observable<WeatherAPIResponse> {
        return apiService.getTodayWeather(zipCode)
    }

    fun getWeatherForecast(zipCode: String): Observable<ForeCastAPIResponse> {
        return apiService.getForecast(zipCode)
    }
}