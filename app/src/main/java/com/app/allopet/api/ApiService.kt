package com.app.allopet.api

import com.app.allopet.data.AddNewStory
import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.http.Multipart
import retrofit2.http.POST
import retrofit2.http.Part
import retrofit2.Call

interface ApiService {
    @Multipart
    @POST("image/fgPIPMQ4QvPAXpwoHg7ZJlNd4XH3")
    fun uploadStories(
        @Part foto: MultipartBody.Part,
    ): Call<AddNewStory>
}
