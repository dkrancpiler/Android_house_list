package com.example.android.house_list.data

import com.example.android.house_list.data.response.CurrentList
import kotlinx.coroutines.Deferred
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

//http://homehapp-api.jsteam.gaussx.com/api/home
interface HousePull {
        @GET ("/api/home")
        suspend fun gethouselist (
        ): CurrentList

        companion object {
            operator fun invoke(): HousePull{

                val okHttpClient = OkHttpClient.Builder()
                    .build()

                return Retrofit.Builder()
                    .client(okHttpClient)
                    .baseUrl("http://homehapp-api.jsteam.gaussx.com")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
                    .create(HousePull::class.java)
            }
        }
}