package com.cookmefsm.features.dashboard.presentation.api.dayStartEnd

import com.cookmefsm.app.Pref
import com.cookmefsm.base.BaseResponse
import com.cookmefsm.features.dashboard.presentation.model.DaystartDayendRequest
import com.cookmefsm.features.dashboard.presentation.model.StatusDayStartEnd
import com.cookmefsm.features.stockCompetetorStock.ShopAddCompetetorStockRequest
import com.cookmefsm.features.stockCompetetorStock.api.AddCompStockApi
import io.reactivex.Observable

class DayStartEndRepository (val apiService: DayStartEndApi){
    fun dayStart(daystartDayendRequest: DaystartDayendRequest): Observable<BaseResponse> {
        return apiService.submitDayStartEnd(daystartDayendRequest)
    }

    fun dayStartEndStatus(date:String): Observable<StatusDayStartEnd> {
        return apiService.statusDayStartEnd(Pref.session_token!!, Pref.user_id!!,date)
    }


}