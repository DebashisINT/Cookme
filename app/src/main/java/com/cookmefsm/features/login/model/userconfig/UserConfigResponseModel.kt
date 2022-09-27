package com.cookmefsm.features.login.model.userconfig

import com.cookmefsm.base.BaseResponse

/**
 * Created by Saikat on 14-01-2019.
 */
class UserConfigResponseModel : BaseResponse() {
    var getconfigure: ArrayList<UserConfigDataModel>? = null
}