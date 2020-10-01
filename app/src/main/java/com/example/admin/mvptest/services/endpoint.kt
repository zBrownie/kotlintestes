package com.example.admin.mvptest.services

import com.example.admin.mvptest.services.models.Pokemon
import com.example.admin.mvptest.services.models.ResponsePokemon
import com.example.admin.mvptest.services.models.ResponsePokemons
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface Endpoint {

    @GET("pokemon/")
    fun getPokemons(): Call<ResponsePokemons>

    @GET("pokemon/{name}/")
    fun getPokemon(@Query("name") name: String): Call<ResponsePokemon>
}