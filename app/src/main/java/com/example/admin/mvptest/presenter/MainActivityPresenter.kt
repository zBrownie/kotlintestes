package com.example.admin.mvptest.presenter;


import com.example.admin.mvptest.contract.ContractInterface
import com.example.admin.mvptest.model.MainActivityModel
import com.example.admin.mvptest.services.models.Pokemon

class MainActivityPresenter(_view: ContractInterface.View) : ContractInterface.Presenter {
    private var view: ContractInterface.View = _view
    private var model: ContractInterface.Model = MainActivityModel(this)


    init {
        view.initView()
        model.getData()
    }

    override fun incrementValue() {
        model.incrementCounter()
        view.updateViewData()
    }



    override fun callBackData() {
        view.updateViewData()
    }

    override fun getCounter(): String = model.getCounter().toString()

    override fun getPokemonList(): List<Pokemon> = model.getListPokemons()
}
