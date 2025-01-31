package com.example.laliga.adapter

import android.view.View
import android.widget.Toast
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelStoreOwner
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.laliga.Equipo
import com.example.laliga.EquipoProvider
import com.example.laliga.EquipoViewModel
import com.example.laliga.FavItemListFragmentDirections
import com.example.laliga.ItemListFragmentDirections
import com.example.laliga.MenuFragmentDirections
import com.example.laliga.databinding.FragmentFavItemListBinding
import com.example.laliga.databinding.ItemEquiposBinding


class EquipoViewHold(view: View, private val origen: String) : RecyclerView.ViewHolder(view) {

    val binding = ItemEquiposBinding.bind(view)

    fun render(equipoModel: Equipo) {
        val idEquipo = equipoModel.id
        binding.tvEquipoName.text = equipoModel.nombre
        binding.tvEquipoLiga.text = equipoModel.grupo
        binding.tvEquipoEstadio.text = equipoModel.estadio

        Glide.with(binding.ivEquipo.context)
            .load(equipoModel.logo)
            .into(binding.ivEquipo)

        // Navegación al detalle de comentarios
        binding.btnComentario.setOnClickListener {
            val navController = Navigation.findNavController(binding.root)

            val request = if (origen == "favItemList") {
                FavItemListFragmentDirections.actionFavItemListFragmentToDetailFavItemFragment(
                    nombreEquipo = equipoModel.nombre,
                    idEquipo = equipoModel.id
                )
            } else {
                ItemListFragmentDirections.actionItemListFragmentToDetailFavItemFragment(
                    nombreEquipo = equipoModel.nombre,
                    idEquipo = equipoModel.id
                )
            }

            navController.navigate(request)
        }

        // Mostrar información del equipo
        binding.btnInfo.setOnClickListener {
            Toast.makeText(binding.ivEquipo.context, equipoModel.info, Toast.LENGTH_LONG).show()
        }

        // Agregar o quitar de favoritos
        binding.btnFav.setOnClickListener {
            val context = binding.root.context
            if (context is ViewModelStoreOwner) {
                val equipoViewModel = ViewModelProvider(context).get(EquipoViewModel::class.java)
                val favoritos = equipoViewModel.favoritos.value ?: listOf()

                if (favoritos.any { it.id == equipoModel.id }) {
                    equipoViewModel.eliminarDeFavoritos(equipoModel.id)
                    Toast.makeText(context, "${equipoModel.nombre} eliminado de favoritos", Toast.LENGTH_SHORT).show()
                } else {
                    equipoViewModel.agregarAFavoritosPorId(equipoModel.id, EquipoProvider.listaEquipos)
                    Toast.makeText(context, "${equipoModel.nombre} añadido a favoritos", Toast.LENGTH_SHORT).show()
                }
            } else {
                Toast.makeText(binding.root.context, "Error al obtener ViewModel", Toast.LENGTH_SHORT).show()
            }
        }
    }
}


