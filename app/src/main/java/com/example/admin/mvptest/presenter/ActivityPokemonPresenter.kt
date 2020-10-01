package com.example.admin.mvptest.presenter

import com.example.admin.mvptest.contract.ActivityPokemonInterface
import com.example.admin.mvptest.model.ActivityPokemonModel
import com.example.admin.mvptest.services.models.Pokemon
import com.example.admin.mvptest.view.ActivityPokemon


class ActivityPokemonPresenter(_view: ActivityPokemonInterface.View) : ActivityPokemonInterface.Presenter {


    private var view: ActivityPokemonInterface.View = _view
    private var model: ActivityPokemonInterface.Model = ActivityPokemonModel(this)


    init {
        view.initView()
    }

    override fun getPokemon():Pokemon = model.getDataPokemon()


}