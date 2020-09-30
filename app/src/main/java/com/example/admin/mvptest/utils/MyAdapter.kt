package com.example.admin.mvptest.utils


import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import com.example.admin.mvptest.R
import com.example.admin.mvptest.services.models.Pokemon
import kotlinx.android.synthetic.main.item_list_pokemons.view.*


class MyAdapter(private val myDataSet: List<Pokemon>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAdapter.MyViewHolder {

        val textView = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_list_pokemons, parent, false)


        return MyViewHolder(textView)
    }


    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.itemView.txt_item_pokemon.text = myDataSet[position].name
    }

    override fun getItemCount() = myDataSet.size


    inner class MyViewHolder(val view: View) : RecyclerView.ViewHolder(view), View.OnClickListener{

        init {
            view.txt_item_pokemon?.setOnClickListener(this)
        }

        override fun onClick(v: View?) {
            myDataSet[adapterPosition]
            Toast.makeText(v?.context,"ITEM CLICADO: $adapterPosition",Toast.LENGTH_SHORT).show()
        }
    }
}