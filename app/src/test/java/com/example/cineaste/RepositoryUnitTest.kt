package com.example.cineaste

import com.example.cineaste.data.Movie
import com.example.cineaste.data.MovieRepository
import org.hamcrest.CoreMatchers.hasItem
import org.hamcrest.CoreMatchers.not
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.hasProperty
import org.hamcrest.CoreMatchers.`is` as Is
import org.junit.Assert.assertEquals
import org.junit.Test

class RepositoryUnitTest {
    @Test
    fun testGetFavoriteMovies(){
        val movies = MovieRepository.getFavoriteMovies()
        assertEquals(movies.size,5)
        assertThat(movies, hasItem<Movie>(hasProperty("title", Is("John Wick"))))
        assertThat(movies, not(hasItem<Movie>(hasProperty("title", Is("Black Widow")))))
    }
}