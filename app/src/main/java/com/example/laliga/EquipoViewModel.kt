package com.example.laliga

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class EquipoViewModel : ViewModel() {

    private val _favoritos = MutableLiveData<MutableList<Equipo>>(mutableListOf())
    val favoritos: LiveData<MutableList<Equipo>> get() = _favoritos

    // Función para agregar un equipo a favoritos usando su id
    fun agregarAFavoritosPorId(equipoId: Int, listaEquipos: List<Equipo>) {
        val equipo = listaEquipos.find { it.id == equipoId }
        equipo?.let {
            val currentFavoritos = _favoritos.value ?: mutableListOf()
            if (!currentFavoritos.contains(it)) {
                currentFavoritos.add(it)
                _favoritos.value = currentFavoritos
            }
        }
    }

    // Función para eliminar un equipo de favoritos por su id
    fun eliminarDeFavoritos(equipoId: Int) {
        val currentFavoritos = _favoritos.value ?: mutableListOf()
        val equipo = currentFavoritos.find { it.id == equipoId }
        equipo?.let {
            currentFavoritos.remove(it)
            _favoritos.value = currentFavoritos
        }
    }
}




