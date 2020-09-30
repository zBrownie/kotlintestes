package com.example.admin.mvptest.contract

import com.example.admin.mvptest.services.models.Pokemon

interface ContractInterface {
    interface View {
        fun initView()
        fun updateViewData()
        fun initRecycle()
    }

    interface Presenter {
        fun incrementValue()

        fun callBackData()
        fun getCounter(): String
        fun getPokemonList(): List<Pokemon>
    }

    interface Model {
        fun getCounter(): Int
        fun incrementCounter()
        fun getData()
        fun getListPokemons(): List<Pokemon>
    }
}