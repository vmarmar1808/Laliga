package com.example.laliga

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class EquipoViewModel : ViewModel() {

    private val _favoritos = MutableLiveData<MutableList<Equipo>>(mutableListOf())
    val favoritos: LiveData<MutableList<Equipo>> get() = _favoritos

    private val _comentarios = MutableLiveData<MutableMap<Int, MutableList<String>>>(mutableMapOf())
    val comentarios: LiveData<MutableMap<Int, MutableList<String>>> get() = _comentarios

    // Función para agregar un comentario
    fun agregarComentario(equipoId: Int, comentario: String) {
        val currentComentarios = _comentarios.value ?: mutableMapOf()
        val comentariosDelEquipo = currentComentarios[equipoId] ?: mutableListOf()

        comentariosDelEquipo.add(comentario)
        currentComentarios[equipoId] = comentariosDelEquipo
        _comentarios.value = currentComentarios
    }

    // Obtener los comentarios de un equipo
    fun getComentarios(equipoId: Int): List<String> {
        return _comentarios.value?.get(equipoId) ?: emptyList()
    }

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

    fun obtenerEquipoPorId(equipoId: Int, listaEquipos: List<Equipo>): Equipo? {
        return listaEquipos.find { it.id == equipoId }
    }

}




