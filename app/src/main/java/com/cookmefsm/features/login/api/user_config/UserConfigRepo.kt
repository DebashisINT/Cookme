package com.cookmefsm.features.login.api.user_config

import com.cookmefsm.features.login.model.userconfig.UserConfigResponseModel
import io.reactivex.Observable

/**
 * Created by Saikat on 14-01-2019.
 */
class UserConfigRepo(val apiService: UserConfigApi) {
    fun userConfig(userId: String): Observable<UserConfigResponseModel> {
        return apiService.getUserConfigResponse(userId)
    }
}