package com.example.cineaste.data

object ActorMovieRepository {
    fun getActorMovies() : Map<String,List<String>> {
        return movieActors()
    }
}