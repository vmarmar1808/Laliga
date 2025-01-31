package com.example.laliga

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.laliga.adapter.EquipoAdapter
import com.example.laliga.databinding.FragmentFavItemListBinding


class FavItemListFragment : Fragment() {

    private lateinit var binding: FragmentFavItemListBinding
    private lateinit var equipoViewModel: EquipoViewModel
    private lateinit var adapter: EquipoAdapter // Asegurar que se inicialice correctamente

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFavItemListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        equipoViewModel = ViewModelProvider(requireActivity()).get(EquipoViewModel::class.java)

        // 1️⃣ Configurar RecyclerView antes de observar los datos
        initRecyclerView()

        // 2️⃣ Observar cambios en favoritos y actualizar el adaptador
        equipoViewModel.favoritos.observe(viewLifecycleOwner) { favoritos ->
            adapter.actualizarLista(favoritos) // Actualiza los datos del RecyclerView
        }
    }

    private fun initRecyclerView() {
        val manager = LinearLayoutManager(requireContext())
        binding.recyclerLaLiga2.layoutManager = manager
        adapter = EquipoAdapter(emptyList(), "favItemList") // Inicializar el adaptador vacío
        binding.recyclerLaLiga2.adapter = adapter
    }
}


