package com.cookmefsm.features.damageProduct.api

import android.content.Context
import android.net.Uri
import android.text.TextUtils
import android.util.Log
import com.cookmefsm.app.FileUtils
import com.cookmefsm.base.BaseResponse
import com.cookmefsm.features.NewQuotation.model.*
import com.cookmefsm.features.addshop.model.AddShopRequestData
import com.cookmefsm.features.addshop.model.AddShopResponse
import com.cookmefsm.features.damageProduct.model.DamageProductResponseModel
import com.cookmefsm.features.damageProduct.model.delBreakageReq
import com.cookmefsm.features.damageProduct.model.viewAllBreakageReq
import com.cookmefsm.features.login.model.userconfig.UserConfigResponseModel
import com.cookmefsm.features.myjobs.model.WIPImageSubmit
import com.cookmefsm.features.photoReg.model.*
import com.fasterxml.jackson.databind.ObjectMapper
import com.google.gson.Gson
import io.reactivex.Observable
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File

class GetDamageProductListRegRepository(val apiService : GetDamageProductListApi) {

    fun viewBreakage(req: viewAllBreakageReq): Observable<DamageProductResponseModel> {
        return apiService.viewBreakage(req)
    }

    fun delBreakage(req: delBreakageReq): Observable<BaseResponse>{
        return apiService.BreakageDel(req.user_id!!,req.breakage_number!!,req.session_token!!)
    }

}