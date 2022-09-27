package com.cookmefsm.features.stockCompetetorStock.api

import com.cookmefsm.base.BaseResponse
import com.cookmefsm.features.orderList.model.NewOrderListResponseModel
import com.cookmefsm.features.stockCompetetorStock.ShopAddCompetetorStockRequest
import com.cookmefsm.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class AddCompStockRepository(val apiService:AddCompStockApi){

    fun addCompStock(shopAddCompetetorStockRequest: ShopAddCompetetorStockRequest): Observable<BaseResponse> {
        return apiService.submShopCompStock(shopAddCompetetorStockRequest)
    }

    fun getCompStockList(sessiontoken: String, user_id: String, date: String): Observable<CompetetorStockGetData> {
        return apiService.getCompStockList(sessiontoken, user_id, date)
    }
}