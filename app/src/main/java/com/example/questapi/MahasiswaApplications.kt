package com.example.questapi

import android.app.Application
import com.example.questapi.dependeciesinjection.AppContainer
import com.example.questapi.dependeciesinjection.MahasiswaContainer

class MahasiswaApplications: Application() {
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = MahasiswaContainer()
    }
}