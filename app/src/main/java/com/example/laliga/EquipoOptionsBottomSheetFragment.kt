package com.example.laliga

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.example.laliga.databinding.FragmentEquipoOptionBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class EquipoOptionsBottomSheetFragment(
    private val equipo: Equipo,
    private val listener: OnEquipoOptionSelected
) : BottomSheetDialogFragment() {

    interface OnEquipoOptionSelected {
        fun onEquipoOptionSelected(option: String, equipo: Equipo)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentEquipoOptionBinding.inflate(inflater, container, false)

        // Verificar si el equipo ya está en favoritos
        val equipoViewModel = ViewModelProvider(requireActivity()).get(EquipoViewModel::class.java)
        val favoritos = equipoViewModel.favoritos.value ?: listOf()

        // Cambiar el texto del botón según si el equipo está en favoritos o no
        if (favoritos.any { it.id == equipo.id }) {
            binding.btnAddToFavorites.text = "Quitar de favoritos"
        } else {
            binding.btnAddToFavorites.text = "Añadir a favoritos"
        }

        // Manejar el clic en el botón de favoritos
        binding.btnAddToFavorites.setOnClickListener {
            if (favoritos.any { it.id == equipo.id }) {
                // Si el equipo ya está en favoritos, quitarlo
                equipoViewModel.eliminarDeFavoritos(equipo.id)
                Toast.makeText(requireContext(), "${equipo.nombre} eliminado de favoritos", Toast.LENGTH_SHORT).show()
            } else {
                // Si no está en favoritos, agregarlo
                equipoViewModel.agregarAFavoritosPorId(equipo.id, EquipoProvider.listaEquipos)
                Toast.makeText(requireContext(), "${equipo.nombre} añadido a favoritos", Toast.LENGTH_SHORT).show()
            }
            dismiss()  // Cerrar el BottomSheet
        }

        // Manejar el clic en el botón de comentario
        binding.btnAddComment.setOnClickListener {
            listener.onEquipoOptionSelected("comentario", equipo)
            dismiss()
        }

        return binding.root
    }
}



