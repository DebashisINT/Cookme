package com.cookmefsm.features.stockAddCurrentStock.api

import com.cookmefsm.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.cookmefsm.features.location.shopRevisitStatus.ShopRevisitStatusRepository

object ShopAddStockProvider {
    fun provideShopAddStockRepository(): ShopAddStockRepository {
        return ShopAddStockRepository(ShopAddStockApi.create())
    }
}