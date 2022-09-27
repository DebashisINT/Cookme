package com.cookmefsm.features.orderList.model

import com.cookmefsm.base.BaseResponse


class ReturnListResponseModel: BaseResponse() {
    var return_list: ArrayList<ReturnDataModel>? = null
}