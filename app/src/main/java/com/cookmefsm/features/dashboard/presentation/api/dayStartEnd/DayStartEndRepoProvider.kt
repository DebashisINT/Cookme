package com.cookmefsm.features.dashboard.presentation.api.dayStartEnd

import com.cookmefsm.features.stockCompetetorStock.api.AddCompStockApi
import com.cookmefsm.features.stockCompetetorStock.api.AddCompStockRepository

object DayStartEndRepoProvider {
    fun dayStartRepositiry(): DayStartEndRepository {
        return DayStartEndRepository(DayStartEndApi.create())
    }

}