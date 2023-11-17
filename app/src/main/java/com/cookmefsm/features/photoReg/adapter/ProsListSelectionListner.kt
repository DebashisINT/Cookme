package com.cookmefsm.features.photoReg.adapter

import com.cookmefsm.features.photoReg.model.ProsCustom
import com.cookmefsm.features.photoReg.model.UserListResponseModel

interface ProsListSelectionListner {
    fun getInfo(obj: ProsCustom)
}