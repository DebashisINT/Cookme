package com.cookmefsm.features.weather.api

import com.cookmefsm.features.task.api.TaskApi
import com.cookmefsm.features.task.api.TaskRepo

object WeatherRepoProvider {
    fun weatherRepoProvider(): WeatherRepo {
        return WeatherRepo(WeatherApi.create())
    }
}