package com.example.android.house_list.data.network

import com.example.android.house_list.data.response.CurrentList
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
            operator fun invoke(
                connectivityInterceptor: ConnectivityInterceptor
            ): HousePull {

                val okHttpClient = OkHttpClient.Builder()
                    .addInterceptor (connectivityInterceptor)
                    .build()

                return Retrofit.Builder()
                    .client(okHttpClient)
                    .baseUrl("https://homehapp-api.jsteam.gaussx.com")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
                    .create(HousePull::class.java)
            }
        }
}