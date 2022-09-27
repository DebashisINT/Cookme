package com.cookmefsm.features.nearbyuserlist.api

import com.cookmefsm.app.Pref
import com.cookmefsm.features.nearbyuserlist.model.NearbyUserResponseModel
import com.cookmefsm.features.newcollection.model.NewCollectionListResponseModel
import com.cookmefsm.features.newcollection.newcollectionlistapi.NewCollectionListApi
import io.reactivex.Observable

class NearbyUserRepo(val apiService: NearbyUserApi) {
    fun nearbyUserList(): Observable<NearbyUserResponseModel> {
        return apiService.getNearbyUserList(Pref.session_token!!, Pref.user_id!!)
    }
}