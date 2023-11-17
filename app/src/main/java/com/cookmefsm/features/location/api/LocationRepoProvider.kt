package com.cookmefsm.features.location.api

import com.cookmefsm.features.location.shopdurationapi.ShopDurationApi
import com.cookmefsm.features.location.shopdurationapi.ShopDurationRepository


object LocationRepoProvider {
    fun provideLocationRepository(): LocationRepo {
        return LocationRepo(LocationApi.create())
    }
}