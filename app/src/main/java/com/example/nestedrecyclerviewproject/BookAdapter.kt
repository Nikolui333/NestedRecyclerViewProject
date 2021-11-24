package com.example.nestedrecyclerviewproject

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.nestedrecyclerviewproject.databinding.BookItemBinding

class BookAdapter (var cardMovie: ArrayList<CardBook>):
    RecyclerView.Adapter<MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding : BookItemBinding =
            DataBindingUtil.inflate(layoutInflater, R.layout.book_item,parent,false)
        return MyViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return cardMovie.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(cardMovie[position])
    }

}

class MyViewHolder(val binding: BookItemBinding): RecyclerView.ViewHolder(binding.root){

    fun bind(cardMovie: CardBook){

        binding.contentCardMovie.setBackgroundResource(cardMovie.banerMovie)
        binding.nameMovie.text = cardMovie.nameMovie
        binding.longMovie.text = cardMovie.longMovie
        binding.actorsMovie.text = cardMovie.actorsMovie
        binding.ratingMovie.text = cardMovie.ratingMovie

    }

}