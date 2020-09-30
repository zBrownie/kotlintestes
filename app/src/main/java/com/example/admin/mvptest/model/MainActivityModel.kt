package com.example.admin.mvptest.model

import android.os.AsyncTask
import android.support.asynclayoutinflater.R.id.async
import android.util.Log
import android.widget.Toast
import com.example.admin.mvptest.contract.ContractInterface
import com.example.admin.mvptest.services.Endpoint
import com.example.admin.mvptest.services.NetworkUtils
import com.example.admin.mvptest.services.models.Pokemon
import com.example.admin.mvptest.services.models.ResponsePokemons
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.net.URL


class MainActivityModel(private val presenter: ContractInterface.Presenter) : ContractInterface.Model {


    private var mCounter = 0
    private var pokemons = listOf<Pokemon>()

    override fun getCounter() = mCounter

    override fun getListPokemons() = pokemons

    override fun incrementCounter() {
        mCounter++
    }


    override fun getData() {
        Log.d("TAG_INITAPI", "INICIANDO METODO GET DATA")


        val retrofitClient = NetworkUtils
                .getRetrofitInstance("https://pokeapi.co/api/v2/")


        val endpoint = retrofitClient.create(Endpoint::class.java)
        val callback = endpoint.getPokemons()


        callback.enqueue(object : Callback<ResponsePokemons> {

            override fun onFailure(call: Call<ResponsePokemons>, t: Throwable) {
                Log.d("TAG_ERROAPI", t.message)
            }

            override fun onResponse(call: Call<ResponsePokemons>, response: Response<ResponsePokemons>) {
                response.body()?.pokemons?.let {
                    pokemons = it
                }
                presenter.callBackData()
            }
        })

    }
}
