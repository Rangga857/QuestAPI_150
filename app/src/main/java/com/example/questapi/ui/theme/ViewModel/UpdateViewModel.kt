package com.example.questapi.ui.theme.ViewModel

data class UpdateUiState(
    val updateUiEvent: UpdateUiEvent = UpdateUiEvent()
)

data class UpdateUiEvent(
    val nim: String = "",
    val nama: String = "",
    val alamat: String = "",
    val jenisKelamin: String = "",
    val kelas: String = "",
    val angkatan: String = ""
)
