package com.example.nestedrecyclerviewproject

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.nestedrecyclerviewproject.databinding.GenresItemBinding

class GenresAdapter (val context: Context, var genresMovie: ArrayList<GenresBook>):
    RecyclerView.Adapter<GenresHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GenresHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding : GenresItemBinding =
            DataBindingUtil.inflate(layoutInflater, R.layout.genres_item,parent,false)
        return GenresHolder(binding)
    }

    override fun getItemCount(): Int {
        return genresMovie.size
    }

    override fun onBindViewHolder(holder: GenresHolder, position: Int) {
        holder.binding.nameGenres.text = genresMovie[position].nameGenres
        loadMovies(holder.binding.catalogWithMovies, genresMovie[position].catalogWithMovies)

    }

    private fun loadMovies(recyclerView: RecyclerView, cardMovies: ArrayList<CardBook>) {

        val movieAdapter = BookAdapter(cardMovies)
        recyclerView.layoutManager = LinearLayoutManager(context, RecyclerView.HORIZONTAL, false)
        recyclerView.adapter = movieAdapter

    }

}

class GenresHolder(val binding: GenresItemBinding): RecyclerView.ViewHolder(binding.root){

}