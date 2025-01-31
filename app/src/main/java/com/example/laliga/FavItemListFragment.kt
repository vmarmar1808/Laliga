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

    private var _binding: FragmentFavItemListBinding? = null
    private val binding get() = _binding!!

    private lateinit var equipoViewModel: EquipoViewModel
    private lateinit var adapter: EquipoAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentFavItemListBinding.inflate(inflater, container, false)
        equipoViewModel = ViewModelProvider(requireActivity()).get(EquipoViewModel::class.java)

        initRecyclerView()

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Observamos los favoritos
        equipoViewModel.favoritos.observe(viewLifecycleOwner, Observer { favoritos ->
            if (favoritos != null) {
                adapter.actualizarLista(favoritos) // 🔥 ACTUALIZAMOS LA LISTA
            }
        })
    }

    private fun initRecyclerView() {
        val manager = LinearLayoutManager(requireContext())
        binding.recyclerLaLiga2.layoutManager = manager

        // Inicializar adapter con lista vacía
        adapter = EquipoAdapter(emptyList())
        binding.recyclerLaLiga2.adapter = adapter
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null // Evitar memory leaks
    }
}

