package com.example.admin.mvptest.services

import com.example.admin.mvptest.services.models.Pokemon
import com.example.admin.mvptest.services.models.ResponsePokemon
import com.example.admin.mvptest.services.models.ResponsePokemons
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET

interface Endpoint {

    @GET("pokemon/")
    fun getPokemons(): Call<ResponsePokemons>

    @GET("pokemon/{id}/")
    fun getPokemon(): Call<ResponsePokemon>
}