package com.example.moviedetailpage.state

import com.example.moviedetailpage.data.Actor

sealed class MovieActorState {
    object Idle : MovieActorState()
    object Loading : MovieActorState()
    class Result(val actors: List<Actor>) : MovieActorState()
    class Error(val throwable: Throwable) : MovieActorState()
}
