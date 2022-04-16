package com.example.cineaste.viewmodel

import com.example.cineaste.data.Movie
import com.example.cineaste.data.MovieRepository

class MovieListViewModel {
    fun getFavoriteMovies() : List<Movie> {
        return MovieRepository.getFavoriteMovies()
    }
    fun getRecentMovies() : List<Movie> {
        return MovieRepository.getRecentMovies()
    }
}