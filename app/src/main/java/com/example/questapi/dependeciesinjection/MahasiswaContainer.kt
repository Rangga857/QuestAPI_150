package com.example.questapi.dependeciesinjection

import com.example.questapi.repository.MahasiswaRepository

interface AppContainer {
    val mahasiswaRepository: MahasiswaRepository
}