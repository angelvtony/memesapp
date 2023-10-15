package com.example.memeapp.data

import com.example.memeapp.model.MemeList
import retrofit2.Response
import retrofit2.http.GET

interface ApiInterface {
    @GET("get_memes")
    suspend fun getMemes():Response<MemeList>
}