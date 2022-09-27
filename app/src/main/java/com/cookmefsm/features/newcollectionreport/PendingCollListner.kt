package com.cookmefsm.features.newcollectionreport

import com.cookmefsm.features.photoReg.model.UserListResponseModel

interface PendingCollListner {
    fun getUserInfoOnLick(obj: PendingCollData)
}