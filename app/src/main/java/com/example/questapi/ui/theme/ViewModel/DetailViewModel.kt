package com.example.questapi.ui.theme.ViewModel

import com.example.questapi.model.Mahasiswa

sealed class DetailUiState {
    object Loading : DetailUiState()
    data class Success(val mahasiswa: Mahasiswa) : DetailUiState()
    object Error : DetailUiState()
}