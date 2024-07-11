package com.khulke.jetpackwithmvvm.api

import com.khulke.jetpackwithmvvm.models.Twitts
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers

interface ApiCalls {

    @GET("/v3/b/668d18c8e41b4d34e40f535e?meta=false")
    suspend fun getTweets(@Header("X-JSON-Path") category: String): Response<List<Twitts>>


    @GET("/v3/b/668d18c8e41b4d34e40f535e?meta=false")
    @Headers("X-JSON-Path: twitts..category")
    suspend fun getCategories():Response<List<String>>
}