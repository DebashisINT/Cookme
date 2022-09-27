package com.cookmefsm.features.viewAllOrder.interf

import com.cookmefsm.app.domain.NewOrderGenderEntity
import com.cookmefsm.app.domain.NewOrderProductEntity

interface ProductListNewOrderOnClick {
    fun productListOnClick(product: NewOrderProductEntity)
}