package com.example.admin.mvptest.contract

import com.example.admin.mvptest.services.models.Pokemon

interface ActivityPokemonInterface {


    interface Model {
        fun getDataPokemon():Pokemon
    }
    interface Presenter {
        fun getPokemon():Pokemon
    }
    interface View {
        fun initView()

    }
}

