package com.example.laliga

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.laliga.adapter.EquipoAdapter
import com.example.laliga.databinding.FragmentFavItemListBinding


class FavItemListFragment : Fragment() {

    private lateinit var binding: FragmentFavItemListBinding
    private lateinit var equipoViewModel: EquipoViewModel
    private lateinit var adapter: EquipoAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFavItemListBinding.inflate(inflater, container, false)
        equipoViewModel = ViewModelProvider(requireActivity()).get(EquipoViewModel::class.java)

        initRecyclerView()

        // Observar cambios en la lista de favoritos
        equipoViewModel.favoritos.observe(viewLifecycleOwner) { listaFavoritos ->
            adapter.actualizarLista(listaFavoritos)
        }

        return binding.root
    }

    private fun initRecyclerView() {
        val manager = LinearLayoutManager(requireContext())
        adapter = EquipoAdapter(mutableListOf(), object : EquipoOptionsBottomSheetFragment.OnEquipoOptionSelected {
            override fun onEquipoOptionSelected(option: String, equipo: Equipo) {
                // No necesitas implementar lógica aquí
            }
        })

        binding.recyclerLaLiga2.layoutManager = manager
        binding.recyclerLaLiga2.adapter = adapter
    }
}
