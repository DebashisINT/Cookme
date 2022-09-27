package com.cookmefsm.features.location.shopRevisitStatus

import com.cookmefsm.features.location.shopdurationapi.ShopDurationApi
import com.cookmefsm.features.location.shopdurationapi.ShopDurationRepository

object ShopRevisitStatusRepositoryProvider {
    fun provideShopRevisitStatusRepository(): ShopRevisitStatusRepository {
        return ShopRevisitStatusRepository(ShopRevisitStatusApi.create())
    }
}