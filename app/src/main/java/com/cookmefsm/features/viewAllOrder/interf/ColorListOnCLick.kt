package com.cookmefsm.features.viewAllOrder.interf

import com.cookmefsm.app.domain.NewOrderGenderEntity
import com.cookmefsm.features.viewAllOrder.model.ProductOrder

interface ColorListOnCLick {
    fun colorListOnCLick(size_qty_list: ArrayList<ProductOrder>, adpPosition:Int)
}