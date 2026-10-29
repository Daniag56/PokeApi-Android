package com.alanturing.pokeapp2627.features.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.alanturing.pokeapp2627.features.pokemon.data.model.Pokemon
import com.alanturing.pokeapp2627.features.pokemon.data.repository.PokemonRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ScreenViewModel @Inject constructor(
    private val _repository: PokemonRepository
) : ViewModel() {

    private val _pokelist = MutableStateFlow<List<Pokemon>>(emptyList())
    val pokelist: StateFlow<List<Pokemon>> = _pokelist

    init {
        viewModelScope.launch {
            _pokelist.value = _repository.readAllPokemon() ?: emptyList()
        }
    }
}
