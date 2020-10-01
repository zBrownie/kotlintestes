package com.example.admin.mvptest.model

import android.util.Log
import com.example.admin.mvptest.contract.ActivityPokemonInterface
import com.example.admin.mvptest.services.Endpoint
import com.example.admin.mvptest.services.NetworkUtils
import com.example.admin.mvptest.services.models.Pokemon
import com.example.admin.mvptest.services.models.ResponsePokemon
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ActivityPokemonModel(private val presenter: ActivityPokemonInterface.Presenter) : ActivityPokemonInterface.Model {


    override fun getDataPokemon() {
        val retrofitClient = NetworkUtils
                .getRetrofitInstance("https://pokeapi.co/api/v2/")


        val endpoint = retrofitClient.create(Endpoint::class.java)
        val callback = endpoint.getPokemon(name = "ditto")


        callback.enqueue(object : Callback<ResponsePokemon> {

            override fun onFailure(call: Call<ResponsePokemon>, t: Throwable) {
                Log.d("TAG_ERROAPI", t.message)
            }

            override fun onResponse(call: Call<ResponsePokemon>, response: Response<ResponsePokemon>) {
                Log.d("TAG_APIPOKEMON", "SUCCESS BUSCA 1 POKEMON")
                response.body()?.let {
                    pokemon = it
                }
            }
        })

    }


    private var pokemon = ResponsePokemon()


}