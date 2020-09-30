package com.example.admin.mvptest.view

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager

import android.support.v7.widget.RecyclerView
import android.util.Log
import android.widget.LinearLayout

import android.widget.Toast
import com.example.admin.mvptest.R
import com.example.admin.mvptest.contract.ContractInterface
import com.example.admin.mvptest.presenter.MainActivityPresenter
import com.example.admin.mvptest.services.Endpoint
import com.example.admin.mvptest.services.NetworkUtils
import com.example.admin.mvptest.services.models.Pokemon
import com.example.admin.mvptest.utils.MyAdapter
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.item_list_pokemons.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MainActivity : AppCompatActivity(), ContractInterface.View {
    // https://pokeapi.co/api/v2/pokemon?limit=100&offset=200
    private var presenter: MainActivityPresenter? = null
    private lateinit var recycleView: RecyclerView
    private lateinit var viewAdapter: RecyclerView.Adapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter = MainActivityPresenter(this)


    }


    override fun initView() {

        txt_counter.text = presenter?.getCounter()
        btn_count.setOnClickListener { presenter?.incrementValue() }
    }

    override fun updateViewData() {

        txt_counter.text = presenter?.getCounter()
        initRecycle()
    }

    override fun initRecycle() {
        viewManager = LinearLayoutManager(this,LinearLayout.VERTICAL,false)
//        viewManager = GridLayoutManager(this,3)
        val lista = presenter?.getPokemonList()
        viewAdapter = MyAdapter(lista ?: arrayListOf())
        recycleView = findViewById(R.id.rc_pokemons)

        recycleView.apply {
            setHasFixedSize(true)
            layoutManager = viewManager
            adapter = viewAdapter
        }
    }


}
