package com.example.moviedetailpage.model

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.core.view.isVisible
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import coil.load
import com.example.moviedetailpage.R
import com.example.moviedetailpage.adapter.MovieActorAdapter
import com.example.moviedetailpage.data.Actor
import com.example.moviedetailpage.data.Categorie
import com.example.moviedetailpage.data.Database
import com.example.moviedetailpage.data.Movie
import com.example.moviedetailpage.databinding.MoviedetailBinding
import com.example.moviedetailpage.state.MovieActorState
import kotlinx.coroutines.launch

class MovieDetailActivity : AppCompatActivity() {

    private lateinit var binding: MoviedetailBinding
    private val viewModel: MovieActorViewModel by viewModels()
    private lateinit var actors: List<Actor>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MoviedetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        observeMovieActorState()
        listeners()

        val movie = Movie(
            1,
            R.string.spider_man_across_the_spider_verse_name,
            "140",
            "https://www.hdfilmcehennemi.life/uploads/poster/spider-man-across-the-spider-verse.jpg",
            "Marvel",
            "Joaquim Dos Santos",
            "Phil Lord",
            96,
            listOf(
                Categorie.Animasyon, Categorie.Aksiyon, Categorie.Macera
            ),
            R.string.spider_man_across_the_spider_verse_content,
            10,
            isViolence = true,
            isNegativeExample = true,
            1
        )


        movie?.let {
            binding.ivMovie.load(it.image)
            binding.tvMovieName.text = getString(it.name)
            binding.tvPercentage.text = it.rateOfLike.toString()
            binding.tvDirector.text = it.director
            binding.tvWriter.text = it.scriptwriter
            binding.tvProducer.text = it.producer
            binding.tvContent.text = getString(it.content)
            if (it.isNegativeExample) binding.ivNegativeExample.isVisible = true
            if (it.isViolence) binding.ivViolence.isVisible = true
            binding.tvAgeLimit.text = "+ ${it.ageLimit}"
            actors = Database.actors.filter {
                it.movieIds.filter { it.movieId == movie.id }.isNotEmpty()
            }
            println(actors)
        }
    }

    private fun listeners() {
        binding.ivReturnBack.setOnClickListener {
            finish()
        }
        binding.ivPlay.setOnClickListener {
            //oynatma sayfası
        }
        binding.ivShare.setOnClickListener {
            try {
                val shareIntent = Intent(Intent.ACTION_SEND)
                shareIntent.type = "text/plain"
                val message = "Message"
                shareIntent.putExtra(Intent.EXTRA_TEXT, message)
                startActivity(shareIntent)

            } catch (e: ActivityNotFoundException) {
                Toast.makeText(this, "application was not found in this device", Toast.LENGTH_SHORT)
                    .show()
                startActivity(
                    Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://play.google.com/store/apps/details?id=com.findwordgame.app")
                    )

                )
            }
        }
    }

    private fun observeMovieActorState() {
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.CREATED) {
                viewModel.movieActorState.collect {
                    when (it) {
                        MovieActorState.Idle -> {}
                        MovieActorState.Loading -> {}
                        is MovieActorState.Result -> {
                            binding.rvActor.adapter =
                                MovieActorAdapter(this@MovieDetailActivity, actors)
                        }

                        is MovieActorState.Error -> {}
                    }
                }
            }
        }
    }
}