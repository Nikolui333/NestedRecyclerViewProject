package com.example.nestedrecyclerviewproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.nestedrecyclerviewproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var binding: ActivityMainBinding? = null

    private var genresAdapter:GenresAdapter? = null

    private var genresMovie:ArrayList<GenresBook>? = null
    private var actionMovies:ArrayList<CardBook>? = null
    private var fantasticMovies:ArrayList<CardBook>? = null
    private var adventureMovies:ArrayList<CardBook>? = null
    private var thrillerMovies:ArrayList<CardBook>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        genresMovie = ArrayList<GenresBook>()
        actionMovies = ArrayList<CardBook>()
        fantasticMovies = ArrayList<CardBook>()
        adventureMovies = ArrayList<CardBook>()
        thrillerMovies = ArrayList<CardBook>()


        genresMovie?.add(
            GenresBook(getString(R.string.actionMovies), actionMovies!!)
        )

        genresMovie?.add(
            GenresBook(getString(R.string.fantasticMovies), fantasticMovies!!)
        )

        genresMovie?.add(
            GenresBook(getString(R.string.adventureMovies), adventureMovies!!)
        )

        genresMovie?.add(
            GenresBook(getString(R.string.thrillerMovies), thrillerMovies!!)
        )


        actionMovies?.add(CardBook(R.drawable.bad_boys, getString(R.string.badBoys), getString(R.string.badBoysLong),
            getString(R.string.badBoysActors), getString(R.string.badBoysRating)))
        adventureMovies?.add(CardBook(R.drawable.avengers, getString(R.string.avengers), getString(R.string.avengersLong),
            getString(R.string.avengersActors), getString(R.string.avengersRating)))
        actionMovies?.add(CardBook(R.drawable.transformers, getString(R.string.transformers), getString(R.string.transformersLong),
            getString(R.string.transformersActors), getString(R.string.transformersRating)))
        adventureMovies?.add(CardBook(R.drawable.fast, getString(R.string.fast), getString(R.string.fastLong),
            getString(R.string.fastActors), getString(R.string.fastRating)))
        actionMovies?.add(CardBook(R.drawable.mk, getString(R.string.mk), getString(R.string.mkLong),
            getString(R.string.mkActors), getString(R.string.mkRating)))
        adventureMovies?.add(CardBook(R.drawable.underworld, getString(R.string.underworld), getString(R.string.underworldLong),
            getString(R.string.underworldActors), getString(R.string.underworldRating)))


        fantasticMovies?.add(CardBook(R.drawable.avengers, getString(R.string.avengers), getString(R.string.avengersLong),
            getString(R.string.avengersActors), getString(R.string.avengersRating)))
        fantasticMovies?.add(CardBook(R.drawable.transformers, getString(R.string.transformers), getString(R.string.transformersLong),
            getString(R.string.transformersActors), getString(R.string.transformersRating)))
        fantasticMovies?.add(CardBook(R.drawable.mk, getString(R.string.mk), getString(R.string.mkLong),
            getString(R.string.mkActors), getString(R.string.mkRating)))
        fantasticMovies?.add(CardBook(R.drawable.underworld, getString(R.string.underworld), getString(R.string.underworldLong),
            getString(R.string.underworldActors), getString(R.string.underworldRating)))

        adventureMovies?.add(CardBook(R.drawable.pirates, getString(R.string.pirates), getString(R.string.piratesLong),
            getString(R.string.piratesActors), getString(R.string.piratesRating)))
        adventureMovies?.add(CardBook(R.drawable.future, getString(R.string.future), getString(R.string.futureLong),
            getString(R.string.futureActors), getString(R.string.futureRating)))

        thrillerMovies?.add(CardBook(R.drawable.underworld, getString(R.string.underworld), getString(R.string.underworldLong),
            getString(R.string.underworldActors), getString(R.string.underworldRating)))

        binding?.categoriesMovies?.layoutManager = LinearLayoutManager(this)
        genresAdapter = GenresAdapter(this, genresMovie!!)
        binding?.categoriesMovies?.adapter = genresAdapter

    }
}