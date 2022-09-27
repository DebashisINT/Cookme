package com.cookmefsm.features.viewAllOrder.interf

import com.cookmefsm.app.domain.NewOrderGenderEntity
import com.cookmefsm.features.viewAllOrder.model.ProductOrder
import java.text.FieldPosition

interface NewOrderSizeQtyDelOnClick {
    fun sizeQtySelListOnClick(product_size_qty: ArrayList<ProductOrder>)
    fun sizeQtyListOnClick(product_size_qty: ProductOrder,position: Int)
}