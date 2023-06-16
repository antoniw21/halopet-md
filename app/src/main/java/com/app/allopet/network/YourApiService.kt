package com.app.allopet.network

import com.app.allopet.model.YourResponseClass
import retrofit2.Call
import retrofit2.http.GET

interface YourApiService {
    @GET("image/CWa4caNynZQOCmwrtFwyiy5Oe1I3/WbHLdu5.jpeg")
    fun getImageData(): Call<YourResponseClass>
}
