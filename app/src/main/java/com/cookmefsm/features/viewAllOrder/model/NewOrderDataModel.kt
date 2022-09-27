package com.cookmefsm.features.viewAllOrder.model

import com.cookmefsm.app.domain.NewOrderColorEntity
import com.cookmefsm.app.domain.NewOrderGenderEntity
import com.cookmefsm.app.domain.NewOrderProductEntity
import com.cookmefsm.app.domain.NewOrderSizeEntity
import com.cookmefsm.features.stockCompetetorStock.model.CompetetorStockGetDataDtls

class NewOrderDataModel {
    var status:String ? = null
    var message:String ? = null
    var Gender_list :ArrayList<NewOrderGenderEntity>? = null
    var Product_list :ArrayList<NewOrderProductEntity>? = null
    var Color_list :ArrayList<NewOrderColorEntity>? = null
    var size_list :ArrayList<NewOrderSizeEntity>? = null
}

