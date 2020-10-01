package com.example.admin.mvptest.view

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.admin.mvptest.R
import com.example.admin.mvptest.contract.ActivityPokemonInterface
import com.example.admin.mvptest.presenter.ActivityPokemonPresenter
import com.example.admin.mvptest.services.models.Pokemon
import kotlinx.android.synthetic.main.activity_pokemon.*

class ActivityPokemon : AppCompatActivity(), ActivityPokemonInterface.View {

    private var presenter: ActivityPokemonPresenter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pokemon)

        presenter = ActivityPokemonPresenter(this)
    }


    override fun initView() {
        val selectedPokemon: Pokemon? = presenter?.getPokemon()




    }


}
