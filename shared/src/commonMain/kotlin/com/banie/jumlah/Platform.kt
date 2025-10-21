package com.banie.jumlah

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform