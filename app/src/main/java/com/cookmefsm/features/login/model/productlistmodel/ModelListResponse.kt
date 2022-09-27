package com.cookmefsm.features.login.model.productlistmodel

import com.cookmefsm.app.domain.ModelEntity
import com.cookmefsm.app.domain.ProductListEntity
import com.cookmefsm.base.BaseResponse

class ModelListResponse: BaseResponse() {
    var model_list: ArrayList<ModelEntity>? = null
}