package com.example.laliga

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.laliga.adapter.EquipoAdapter
import com.example.laliga.databinding.FragmentItemListBinding


class ItemListFragment : Fragment(), EquipoOptionsBottomSheetFragment.OnEquipoOptionSelected {

    private lateinit var binding: FragmentItemListBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentItemListBinding.inflate(inflater, container, false)

        // Inicializar RecyclerView
        initRecyclerView()

        return binding.root
    }

    private fun initRecyclerView() {
        val manager = LinearLayoutManager(requireContext())
        binding.recyclerLaLiga.layoutManager = manager
        binding.recyclerLaLiga.adapter = EquipoAdapter(EquipoProvider.listaEquipos, this)
    }

    // Este método es llamado cuando seleccionas una opción en el BottomSheet
    override fun onEquipoOptionSelected(option: String, equipo: Equipo) {
        when (option) {
            "favoritos" -> {
                Toast.makeText(requireContext(), "${equipo.nombre} añadido a favoritos", Toast.LENGTH_SHORT).show()
            }
            "comentario" -> {
                Toast.makeText(requireContext(), "Comentario añadido para ${equipo.nombre}", Toast.LENGTH_SHORT).show()
            }
        }
    }

    // Métodos de la interfaz OnEquipoOptionSelected que implementas en el BottomSheet
    fun onAddToFavorites(equipo: Equipo) {
        Toast.makeText(requireContext(), "${equipo.nombre} añadido a favoritos", Toast.LENGTH_SHORT).show()
    }

    fun onAddComment(equipo: Equipo) {
        Toast.makeText(requireContext(), "Comentario añadido para ${equipo.nombre}", Toast.LENGTH_SHORT).show()
    }
}


