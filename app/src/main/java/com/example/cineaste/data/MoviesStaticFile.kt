package com.example.cineaste.data

fun favoriteMovies(): List<Movie> {
    return listOf(
        Movie(1,"Pride and prejudice",
            "Sparks fly when spirited Elizabeth Bennet meets single, rich, and proud Mr. Darcy. But Mr. Darcy reluctantly finds himself falling in love with a woman beneath his class. Can each overcome their own pride and prejudice?",
            "16.02.2005.","https://www.imdb.com/title/tt0414387/",
            "drama"),
        Movie(2, "John Wick",
        "An ex-hit-man comes out of retirement to track down the gangsters that killed his dog and took everything from him.",
        "24.10.2014.", "https://www.imdb.com/title/tt2911666/",
        "action"),
        Movie(3, "Baby Driver",
        "After being coerced into working for a crime boss, a young getaway driver finds himself taking part in a heist doomed to fail.",
        "28.06.2017.", "https://www.imdb.com/title/tt3890160/?ref_=tt_sims_tt_i_4",
        "action"),
        Movie(4, "Deadpool",
        "A wisecracking mercenary gets experimented on and becomes immortal but ugly, and sets out to track down the man who ruined his looks.",
        "12.02.2016.", "https://www.imdb.com/title/tt1431045/?ref_=tt_sims_tt_i_4",
        "comedy"),
        Movie(5, "Creed",
        "The former World Heavyweight Champion Rocky Balboa serves as a trainer and mentor to Adonis Johnson, the son of his late friend and former rival Apollo Creed.",
        "25.11.2015.", "https://www.imdb.com/title/tt3076658/",
        "drama")
    )
}
fun recentMovies() : List<Movie> {
    return listOf(
        Movie(1,"The Contractor",
            "A discharged U.S. Special Forces sergeant, James Harper, risks everything for his family when he joins a private contracting organization.",
            "01.04.2022.","https://www.imdb.com/title/tt10323676/",
            "thriller"),
        Movie(2, "Man of God",
        "Exiled unjustly, convicted without trial, slandered without cause. Man of God depicts the trials and tribulations of Saint Nektarios of Aegina, as he bears the unjust hatred of his enemies while preaching the Word of God.",
        "21.03.2022.", "https://www.imdb.com/title/tt6060964/?ref_=rlm",
        "drama"),
        Movie(3, "Deep Water",
        "A well-to-do husband who allows his wife to have affairs in order to avoid a divorce becomes a prime suspect in the disappearance of her lovers.",
        "18.03.2022.", "https://www.imdb.com/title/tt2180339/?ref_=nv_sr_srsg_0",
        "thriller"),
        Movie(4, "The Adam Project",
        "After accidentally crash-landing in 2022, time-traveling fighter pilot Adam Reed teams up with his 12-year-old self for a mission to save the future.",
        "11.03.2022.", "https://www.imdb.com/title/tt2463208/?ref_=tt_sims_tt_i_2",
        "comedy"),
        Movie(5, "Dog",
        "Two former Army Rangers are paired against their will on the road trip of a lifetime. Briggs (Channing Tatum) and Lulu (a Belgian Malinois) race down the Pacific Coast to get to a fellow soldier's funeral on time.",
        "18.02.2022.", "https://www.imdb.com/title/tt11252248/?ref_=tt_sims_tt_i_1",
        "comedy"),
        Movie(6, "Scream 5",
        "25 years after a streak of brutal murders shocked the quiet town of Woodsboro, Calif., a new killer dons the Ghostface mask and begins targeting a group of teenagers to resurrect secrets from the town's deadly past.",
        "14.01.2022.", "https://www.imdb.com/title/tt11245972/",
        "horror")
    )
}
fun movieActors():Map<String,List<String>>{
    return mapOf<String,List<String>>("Pride and prejudice" to listOf("Keira Knightley","Talulah Riley","Rosamund Pike"),
        "Man of God" to listOf("Mickey Rourke", "Tonia Sotiropoulou", "Aris Servetalis", "Alexander Petrov"))
}

fun similarMovies():Map<String,List<String>>{
    return mapOf<String,List<String>>("Pride and prejudice" to listOf("Jane Eyre","The Notebook","Atonement"),
        "Man of God" to listOf("Eftihia", "Bisping", "Echoes of the Past", "Smyrni mou agapimeni", "The Outfit"))
}