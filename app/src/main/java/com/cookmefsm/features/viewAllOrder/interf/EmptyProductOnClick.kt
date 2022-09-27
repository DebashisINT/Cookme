package com.cookmefsm.features.viewAllOrder.interf

import com.cookmefsm.features.viewAllOrder.model.ProductOrder

interface EmptyProductOnClick {
    fun emptyProductOnCLick(emptyFound:Boolean)
    fun delProductOnCLick(isDel:Boolean)
}