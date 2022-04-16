package com.example.cineaste.viewmodel

import com.example.cineaste.data.ActorMovieRepository
import com.example.cineaste.data.Movie
import com.example.cineaste.data.MovieRepository

class MovieDetailViewModel {
    fun getMovieByTitle(name: String) : Movie {
        var movies: ArrayList<Movie> = arrayListOf()
        movies.addAll(MovieRepository.getRecentMovies())
        movies.addAll(MovieRepository.getFavoriteMovies())
        val movie = movies.find { movie -> name.equals(movie.title) }

        return movie?:Movie(0,"Test","Test","Test","Test","Test")
    }
    fun getActorsByTitle(name: String) : List<String> {
        return ActorMovieRepository.getActorMovies()?.get(name)?: emptyList()
    }
    fun getSimilarByTitle(name: String):List<String>{
        return MovieRepository.getSimilarMovies()?.get(name)?: emptyList()
    }
}