package com.cookmefsm.features.stockAddCurrentStock.api

import com.cookmefsm.base.BaseResponse
import com.cookmefsm.features.location.model.ShopRevisitStatusRequest
import com.cookmefsm.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.cookmefsm.features.stockAddCurrentStock.ShopAddCurrentStockRequest
import com.cookmefsm.features.stockAddCurrentStock.model.CurrentStockGetData
import com.cookmefsm.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class ShopAddStockRepository (val apiService : ShopAddStockApi){
    fun shopAddStock(shopAddCurrentStockRequest: ShopAddCurrentStockRequest?): Observable<BaseResponse> {
        return apiService.submShopAddStock(shopAddCurrentStockRequest)
    }

    fun getCurrStockList(sessiontoken: String, user_id: String, date: String): Observable<CurrentStockGetData> {
        return apiService.getCurrStockListApi(sessiontoken, user_id, date)
    }

}