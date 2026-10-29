package com.alanturing.pokeapp2627.features.pokemon.data.repository

import com.alanturing.pokeapp2627.features.pokemon.data.model.Pokemon
import com.alanturing.pokeapp2627.features.pokemon.data.remote.PokemonDataSource
import javax.inject.Inject

class PokemonRepositoryImpl @Inject constructor(
    private val _remoteDataSource: PokemonDataSource
): PokemonRepository {
    override suspend fun readAllPokemon(): List<Pokemon>? {
       return _remoteDataSource.readAllPokemon()
    }

    override suspend fun readPokemonById(Id : Int): Pokemon? {
        return _remoteDataSource.readPokemonById(Id)
    }

    override suspend fun readPokemonByName(name : String): Pokemon?{
        return _remoteDataSource.readPokemonByName(name)
    }
}