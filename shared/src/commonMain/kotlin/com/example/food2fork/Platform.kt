package com.example.food2fork

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform