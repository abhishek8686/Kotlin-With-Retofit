package com.example.myapplication.`api-interface`

import com.example.myapplication.model.RedditModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by Abhishek Dubey on 13,December,2019
 */
interface ApiIntercase {

    @GET("/top.json")
    fun getTop(@Query("after") after:String,@Query("limit") limit:String): Call<RedditModel>
}