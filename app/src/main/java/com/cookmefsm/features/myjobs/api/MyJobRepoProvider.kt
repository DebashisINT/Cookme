package com.cookmefsm.features.myjobs.api

import android.content.Context
import android.net.Uri
import android.util.Log
import com.cookmefsm.app.FileUtils
import com.cookmefsm.base.BaseResponse
import com.cookmefsm.features.activities.model.ActivityImage
import com.cookmefsm.features.activities.model.AddActivityInputModel
import com.cookmefsm.features.myjobs.model.WIPSubmit
import com.fasterxml.jackson.databind.ObjectMapper
import io.reactivex.Observable
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File

object MyJobRepoProvider {
    fun jobRepoProvider(): MyJobRepo {
        return MyJobRepo(MyJobApi.create())
    }

    fun jobMultipartRepoProvider(): MyJobRepo {
        return MyJobRepo(MyJobApi.createMultiPart())
    }

}