package com.example.cineaste.view

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.cineaste.R
import com.example.cineaste.data.Movie

class MovieListAdapter (
    private var movies: List<Movie>,
    private val onItemClicked: (movie: Movie, view1: View, view2: View) -> Unit
) : RecyclerView.Adapter<MovieListAdapter.MovieViewHolder> (){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) : MovieViewHolder {
        val view = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.item_movie, parent, false)
        return MovieViewHolder(view)
    }
    override fun getItemCount(): Int = movies.size
    override fun onBindViewHolder(holder: MovieViewHolder, position: Int){
        holder.movieTitle.text = movies[position].title
        val genreMatch: String = movies[position].genre
        val context : Context = holder.movieImage.getContext()
        var id: Int = context.getResources()
            .getIdentifier(genreMatch, "drawable", context.getPackageName())
        if(id === 0) id = context.getResources()
            .getIdentifier("default_picture", "drawable", context.getPackageName())
        holder.movieImage.setImageResource(id)
        holder.itemView.setOnClickListener { onItemClicked(movies[position], holder.movieImage, holder.movieTitle) }
    }
    fun updateMovies(movies: List<Movie>) {
        this.movies = movies
        notifyDataSetChanged()
    }
    inner class MovieViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val movieImage: ImageView = itemView.findViewById(R.id.movieImage)
        val movieTitle: TextView = itemView.findViewById(R.id.movieTitle)
    }
}