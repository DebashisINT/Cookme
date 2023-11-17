package com.cookmefsm.features.viewAllOrder.orderOptimized

import com.cookmefsm.app.domain.ProductOnlineRateTempEntity
import com.cookmefsm.base.BaseResponse
import com.cookmefsm.features.login.model.productlistmodel.ProductRateDataModel
import java.io.Serializable

class ProductRateOnlineListResponseModel: BaseResponse(), Serializable {
    var product_rate_list: ArrayList<ProductOnlineRateTempEntity>? = null
}