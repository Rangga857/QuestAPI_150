package com.example.questapi.ui.theme.ViewModel

import com.example.questapi.model.Mahasiswa

fun UpdateUiEvent.toMahasiswa(): Mahasiswa = Mahasiswa(
    nim = nim,
    nama = nama,
    alamat = alamat,
    jenisKelamin = jenisKelamin,
    kelas = kelas,
    angkatan = angkatan
)

fun Mahasiswa.toUpdateUiEvent(): UpdateUiEvent = UpdateUiEvent(
    nim = nim,
    nama = nama,
    alamat = alamat,
    jenisKelamin = jenisKelamin,
    kelas = kelas,
    angkatan = angkatan
)

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
