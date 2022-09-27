package com.cookmefsm.features.viewAllOrder.interf

import com.cookmefsm.app.domain.NewOrderColorEntity
import com.cookmefsm.app.domain.NewOrderProductEntity

interface ColorListNewOrderOnClick {
    fun productListOnClick(color: NewOrderColorEntity)
}