package com.cookmefsm.features.newcollection.model

import com.cookmefsm.app.domain.CollectionDetailsEntity
import com.cookmefsm.base.BaseResponse
import com.cookmefsm.features.shopdetail.presentation.model.collectionlist.CollectionListDataModel

/**
 * Created by Saikat on 15-02-2019.
 */
class NewCollectionListResponseModel : BaseResponse() {
    //var collection_list: ArrayList<CollectionListDataModel>? = null
    var collection_list: ArrayList<CollectionDetailsEntity>? = null
}