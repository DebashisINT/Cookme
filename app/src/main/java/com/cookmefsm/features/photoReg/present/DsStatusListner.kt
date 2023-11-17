package com.cookmefsm.features.photoReg.present

import com.cookmefsm.app.domain.ProspectEntity
import com.cookmefsm.features.photoReg.model.UserListResponseModel

interface DsStatusListner {
    fun getDSInfoOnLick(obj: ProspectEntity)
}