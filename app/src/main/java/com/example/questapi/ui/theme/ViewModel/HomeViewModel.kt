package com.example.questapi.ui.theme.ViewModel

import com.example.questapi.model.Mahasiswa

sealed class HomeUiState {
    data class Success(val mahasiswa: List<Mahasiswa>) : HomeUiState()
    object Error : HomeUiState()
    object Loading : HomeUiState()
}