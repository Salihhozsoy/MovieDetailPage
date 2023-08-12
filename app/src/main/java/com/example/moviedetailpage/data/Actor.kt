package com.example.moviedetailpage.data

data class Actor(val id:Int, val name:String, val surname:String, val movieIds:List<ActorMovie>, val image:String)
