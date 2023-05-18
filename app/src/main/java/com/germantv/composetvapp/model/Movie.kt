package com.germantv.composetvapp.model

data class Movie(
    val id: String,
    val title: String,
    val year: String,
    val genre: String,
    val director: String,
    val actors: String,
    val plot: String,
    val poster: String,
    val images: List<String>,
    val rating: String
)

fun getMovies(): List<Movie> {
    return listOf(
        Movie(
            id = "tt0499549",
            title = "Avatar",
            year = "2009",
            genre = "Action, Adventure, Fantasy",
            director = "James Cameron",
            actors = "Sam Worthington, Zoe Saldana, Sigourney Weaver, Stephen Lang",
            plot = "A paraplegic marine dispatched to the moon Pandora on a unique mission becomes torn between following his orders and protecting the world he feels is his home.",
            poster = "http://ia.media-imdb.com/images/M/MV5BMTYwOTEwNjAzMl5BMl5BanBnXkFtZTcwODc5MTUwMw@@._V1_SX300.jpg",
            images = listOf(
                "https://epg.nagacdn.com/tv1/5b7ec5e98189652d08e64939_780.jpg",
                "https://epg.nagacdn.com/tv1/5b7ec5e98189652d08e64939_780.jpg",
                "https://epg.nagacdn.com/tv1/5b7ec5e98189652d08e64939_780.jpg",
                "https://epg.nagacdn.com/tv1/5b7ec5e98189652d08e64939_780.jpg",
                "https://epg.nagacdn.com/tv1/5b7ec5e98189652d08e64939_780.jpg"
            ),
            rating = "7.9"
        ),

        Movie(
            id = "tt0416449",
            title = "300",
            year = "2006",
            genre = "Action, Drama, Fantasy",
            director = "Zack Snyder",
            actors = "Gerard Butler, Lena Headey, Dominic West, David Wenham",
            plot = "King Leonidas of Sparta and a force of 300 men fight the Persians at Thermopylae in 480 B.C.",
            poster = "http://ia.media-imdb.com/images/M/MV5BMjAzNTkzNjcxNl5BMl5BanBnXkFtZTYwNDA4NjE3._V1_SX300.jpg",
            images = listOf(
                "https://epg.nagacdn.com/tv1/5b7ec5e98189652d08e64939_780.jpg",
                "https://epg.nagacdn.com/tv1/5b7ec5e98189652d08e64939_780.jpg",
                "https://epg.nagacdn.com/tv1/5b7ec5e98189652d08e64939_780.jpg",
                "https://epg.nagacdn.com/tv1/5b7ec5e98189652d08e64939_780.jpg",
                "https://epg.nagacdn.com/tv1/5b7ec5e98189652d08e64939_780.jpg"
            ),
            rating = "7.7"
        ),

        Movie(
            id = "tt0848228",
            title = "The Avengers",
            year = "2012",
            genre = "Action, Sci-Fi, Thriller",
            director = "Joss Whedon",
            actors = "Robert Downey Jr., Chris Evans, Mark Ruffalo, Chris Hemsworth",
            plot = "Earth's mightiest heroes must come together and learn to fight as a team if they are to stop the mischievous Loki and his alien army from enslaving humanity.",
            poster = "http://ia.media-imdb.com/images/M/MV5BMTk2NTI1MTU4N15BMl5BanBnXkFtZTcwODg0OTY0Nw@@._V1_SX300.jpg",
            images = listOf(
                "https://epg.nagacdn.com/tv1/5b7ec5e98189652d08e64939_780.jpg",
                "https://epg.nagacdn.com/tv1/5b7ec5e98189652d08e64939_780.jpg",
                "https://epg.nagacdn.com/tv1/5b7ec5e98189652d08e64939_780.jpg",
                "https://epg.nagacdn.com/tv1/5b7ec5e98189652d08e64939_780.jpg",
                "https://epg.nagacdn.com/tv1/5b7ec5e98189652d08e64939_780.jpg"
            ),
            rating = "8.1"
        ),

        Movie(
            id = "tt0993846",
            title = "The Wolf of Wall Street",
            year = "2013",
            genre = "Biography, Comedy, Crime",
            director = "Martin Scorsese",
            actors = "Leonardo DiCaprio, Jonah Hill, Margot Robbie, Matthew McConaughey",
            plot = "Based on the true story of Jordan Belfort, from his rise to a wealthy stock-broker living the high life to his fall involving crime, corruption and the federal government.",
            poster = "http://ia.media-imdb.com/images/M/MV5BMjIxMjgxNTk0MF5BMl5BanBnXkFtZTgwNjIyOTg2MDE@._V1_SX300.jpg",
            images = listOf(
                "https://epg.nagacdn.com/tv1/5b7ec5e98189652d08e64939_780.jpg",
                "https://epg.nagacdn.com/tv1/5b7ec5e98189652d08e64939_780.jpg",
                "https://epg.nagacdn.com/tv1/5b7ec5e98189652d08e64939_780.jpg",
                "https://epg.nagacdn.com/tv1/5b7ec5e98189652d08e64939_780.jpg",
                "https://epg.nagacdn.com/tv1/5b7ec5e98189652d08e64939_780.jpg"
            ),
            rating = "8.2"
        ),

        Movie(
            id = "tt0816692",
            title = "Interstellar",
            year = "2014",
            genre = "Adventure, Drama, Sci-Fi",
            director = "Christopher Nolan",
            actors = "Ellen Burstyn, Matthew McConaughey, Mackenzie Foy, John Lithgow",
            plot = "A team of explorers travel through a wormhole in space in an attempt to ensure humanity's survival.",
            poster = "http://ia.media-imdb.com/images/M/MV5BMjIxNTU4MzY4MF5BMl5BanBnXkFtZTgwMzM4ODI3MjE@._V1_SX300.jpg",
            images = listOf(
                "https://epg.nagacdn.com/tv1/5b7ec5e98189652d08e64939_780.jpg",
                "https://epg.nagacdn.com/tv1/5b7ec5e98189652d08e64939_780.jpg",
                "https://epg.nagacdn.com/tv1/5b7ec5e98189652d08e64939_780.jpg",
                "https://epg.nagacdn.com/tv1/5b7ec5e98189652d08e64939_780.jpg",
                "https://epg.nagacdn.com/tv1/5b7ec5e98189652d08e64939_780.jpg"
            ),
            rating = "8.6"
        ),
        Movie(
            id = "tt0944947",
            title = "Game of Thrones",
            year = "2011 - 2018",
            genre = "Adventure, Drama, Fantasy",
            director = "N/A",
            actors = "Peter Dinklage, Lena Headey, Emilia Clarke, Kit Harington",
            plot = "While a civil war brews between several noble families in Westeros, the children of the former rulers of the land attempt to rise up to power. Meanwhile a forgotten race, bent on destruction, plans to return after thousands of years in the North.",
            poster = "http://ia.media-imdb.com/images/M/MV5BMjM5OTQ1MTY5Nl5BMl5BanBnXkFtZTgwMjM3NzMxODE@._V1_SX300.jpg",
            images = listOf(
                "https://epg.nagacdn.com/tv1/5b7ec5e98189652d08e64939_780.jpg",
                "https://epg.nagacdn.com/tv1/5b7ec5e98189652d08e64939_780.jpg",
                "https://epg.nagacdn.com/tv1/5b7ec5e98189652d08e64939_780.jpg",
                "https://epg.nagacdn.com/tv1/5b7ec5e98189652d08e64939_780.jpg",
                "https://epg.nagacdn.com/tv1/5b7ec5e98189652d08e64939_780.jpg"
            ),
            rating = "9.5"
        ),


        Movie(
            id = "tt2306299",
            title = "Vikings",
            year = "2013–2020",
            genre = "Action, Drama, History",
            director = "N/A",
            actors = "Travis Fimmel, Clive Standen, Gustaf Skarsgård, Katheryn Winnick",
            plot = "The world of the Vikings is brought to life through the journey of Ragnar Lothbrok, the first Viking to emerge from Norse legend and onto the pages of history - a man on the edge of myth.",
            poster = "http://ia.media-imdb.com/images/M/MV5BOTEzNzI3MDc0N15BMl5BanBnXkFtZTgwMzk1MzA5NzE@._V1_SX300.jpg",
            images = listOf(
                "https://epg.nagacdn.com/tv1/5b7ec5e98189652d08e64939_780.jpg",
                "https://epg.nagacdn.com/tv1/5b7ec5e98189652d08e64939_780.jpg",
                "https://epg.nagacdn.com/tv1/5b7ec5e98189652d08e64939_780.jpg",
                "https://epg.nagacdn.com/tv1/5b7ec5e98189652d08e64939_780.jpg",
                "https://epg.nagacdn.com/tv1/5b7ec5e98189652d08e64939_780.jpg"
            ),
            rating = "9.5"
        ),

        Movie(
            id = "tt0903747",
            title = "Breaking Bad",
            year = "2008–2013",
            genre = "Crime, Drama, Thriller",
            director = "N/A",
            actors = "Bryan Cranston, Anna Gunn, Aaron Paul, Dean Norris",
            plot = "A high school chemistry teacher diagnosed with inoperable lung cancer turns to manufacturing and selling methamphetamine in order to secure his family's financial future.",
            poster = "http://ia.media-imdb.com/images/M/MV5BMTQ0ODYzODc0OV5BMl5BanBnXkFtZTgwMDk3OTcyMDE@._V1_SX300.jpg",
            images = listOf(
                "https://epg.nagacdn.com/tv1/5b7ec5e98189652d08e64939_780.jpg",
                "https://epg.nagacdn.com/tv1/5b7ec5e98189652d08e64939_780.jpg",
                "https://epg.nagacdn.com/tv1/5b7ec5e98189652d08e64939_780.jpg",
                "https://epg.nagacdn.com/tv1/5b7ec5e98189652d08e64939_780.jpg",
                "https://epg.nagacdn.com/tv1/5b7ec5e98189652d08e64939_780.jpg"
            ),
            rating = "9.5"
        ),

        Movie(
            id = "tt2707408",
            title = "Narcos",
            year = "2015-",
            genre = "Biography, Crime, Drama",
            director = "N/A",
            actors = "Wagner Moura, Boyd Holbrook, Pedro Pascal, Joanna Christie",
            plot = "A chronicled look at the criminal exploits of Colombian drug lord Pablo Escobar.",
            poster = "http://ia.media-imdb.com/images/M/MV5BMTU0ODQ4NDg2OF5BMl5BanBnXkFtZTgwNzczNTE4OTE@._V1_SX300.jpg",
            images = listOf(
                "https://epg.nagacdn.com/tv1/5b7ec5e98189652d08e64939_780.jpg",
                "https://epg.nagacdn.com/tv1/5b7ec5e98189652d08e64939_780.jpg",
                "https://epg.nagacdn.com/tv1/5b7ec5e98189652d08e64939_780.jpg",
                "https://epg.nagacdn.com/tv1/5b7ec5e98189652d08e64939_780.jpg",
                "https://epg.nagacdn.com/tv1/5b7ec5e98189652d08e64939_780.jpg"
            ),
            rating = "9.5"
        ),

        )
}
