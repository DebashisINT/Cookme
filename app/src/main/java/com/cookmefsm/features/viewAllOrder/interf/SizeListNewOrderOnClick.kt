package com.cookmefsm.features.viewAllOrder.interf

import com.cookmefsm.app.domain.NewOrderProductEntity
import com.cookmefsm.app.domain.NewOrderSizeEntity

interface SizeListNewOrderOnClick {
    fun sizeListOnClick(size: NewOrderSizeEntity)
}