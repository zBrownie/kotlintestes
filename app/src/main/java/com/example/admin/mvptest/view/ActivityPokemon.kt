package com.example.admin.mvptest.view

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.admin.mvptest.R
import com.example.admin.mvptest.contract.ActivityPokemonInterface

class ActivityPokemon : AppCompatActivity(),ActivityPokemonInterface.View {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pokemon)


    }


    override fun initView() {
    }

    override fun getDataPokemon() {
    }
}
