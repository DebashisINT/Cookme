package com.cookmefsm.features.lead.api

import com.cookmefsm.features.NewQuotation.api.GetQuotListRegRepository
import com.cookmefsm.features.NewQuotation.api.GetQutoListApi


object GetLeadRegProvider {
    fun provideList(): GetLeadListRegRepository {
        return GetLeadListRegRepository(GetLeadListApi.create())
    }
}