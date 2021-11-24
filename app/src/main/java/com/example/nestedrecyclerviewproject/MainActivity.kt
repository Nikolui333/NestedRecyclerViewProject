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
    private var programmingBook:ArrayList<CardBook>? = null
    private var developingBook:ArrayList<CardBook>? = null
    private var fictionBook:ArrayList<CardBook>? = null
    private var philosophyBook:ArrayList<CardBook>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        genresMovie = ArrayList<GenresBook>()
        programmingBook = ArrayList<CardBook>()
        developingBook = ArrayList<CardBook>()
        fictionBook = ArrayList<CardBook>()
        philosophyBook = ArrayList<CardBook>()


        genresMovie?.add(
            GenresBook(getString(R.string.programming), programmingBook!!)
        )

        genresMovie?.add(
            GenresBook(getString(R.string.developing_literature), developingBook!!)
        )

        genresMovie?.add(
            GenresBook(getString(R.string.fiction), fictionBook!!)
        )

        genresMovie?.add(
            GenresBook(getString(R.string.philosophy), philosophyBook!!)
        )


        programmingBook?.add(CardBook(R.drawable.android_professional, getString(R.string.android_professional), getString(R.string.android_professionalLong),
            getString(R.string.android_professionalAuthor), getString(R.string.android_professionalRating)))
        fictionBook?.add(CardBook(R.drawable.noise, getString(R.string.noise), getString(R.string.noiseLong),
            getString(R.string.noiseAuthor), getString(R.string.noiseRating)))
        programmingBook?.add(CardBook(R.drawable.learning_java, getString(R.string.learning_java), getString(R.string.learning_javaLong),
            getString(R.string.learning_javaAuthor), getString(R.string.learning_javaRating)))
        fictionBook?.add(CardBook(R.drawable.onegin, getString(R.string.onegin), getString(R.string.oneginLong),
            getString(R.string.oneginAuthor), getString(R.string.oneginRating)))
        programmingBook?.add(CardBook(R.drawable.head_first, getString(R.string.head_first), getString(R.string.head_firstLong),
            getString(R.string.head_firstAuthor), getString(R.string.head_firstRating)))
        fictionBook?.add(CardBook(R.drawable.pride_and_prejudice, getString(R.string.pride_and_prejudice), getString(R.string.pride_and_prejudiceLong),
            getString(R.string.pride_and_prejudiceAuthor), getString(R.string.pride_and_prejudiceRating)))


        developingBook?.add(CardBook(R.drawable.instruction_for_the_brain, getString(R.string.instruction_for_the_brain), getString(R.string.instruction_for_the_brainLong),
            getString(R.string.instruction_for_the_brainAuthor), getString(R.string.instruction_for_the_brainRating)))
        developingBook?.add(CardBook(R.drawable.jedi_techniques, getString(R.string.jedi_techniques), getString(R.string.jedi_techniquesLong),
            getString(R.string.jedi_techniquesAuthor), getString(R.string.jedi_techniquesRating)))
        developingBook?.add(CardBook(R.drawable.speed_reading, getString(R.string.speed_reading), getString(R.string.speed_readingLong),
            getString(R.string.speed_readingAuthor), getString(R.string.speed_readingRating)))
        developingBook?.add(CardBook(R.drawable.strength_of_will, getString(R.string.strength_of_will), getString(R.string.strength_of_willLong),
            getString(R.string.strength_of_willAuthor), getString(R.string.strength_of_willRating)))

        fictionBook?.add(CardBook(R.drawable.welcome_to_class, getString(R.string.welcome_to_class), getString(R.string.welcome_to_classLong),
            getString(R.string.welcome_to_classAuthor), getString(R.string.welcome_to_classRating)))
        fictionBook?.add(CardBook(R.drawable.instruction_for_the_brain, getString(R.string.instruction_for_the_brain), getString(R.string.instruction_for_the_brainLong),
            getString(R.string.instruction_for_the_brainAuthor), getString(R.string.instruction_for_the_brainRating)))

        philosophyBook?.add(CardBook(R.drawable.man_in_search, getString(R.string.man_in_search), getString(R.string.man_in_searchLong),
            getString(R.string.man_in_searchAuthor), getString(R.string.man_in_searchRating)))

        binding?.categoriesMovies?.layoutManager = LinearLayoutManager(this)
        genresAdapter = GenresAdapter(this, genresMovie!!)
        binding?.categoriesMovies?.adapter = genresAdapter

    }
}