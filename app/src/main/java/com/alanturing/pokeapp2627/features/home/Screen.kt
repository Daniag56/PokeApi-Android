package com.alanturing.pokeapp2627.features.home

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.hilt.lifecycle.viewmodel.compose.hiltViewModel

@Composable
fun Screen(viewModel: ScreenViewModel = hiltViewModel()){
    val pokelist by viewModel.pokelist.collectAsState()

    LazyColumn{
        items(pokelist){ pokemon ->
            Text(text = pokemon.name)
        }
    }
}