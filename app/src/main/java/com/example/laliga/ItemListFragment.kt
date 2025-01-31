package com.example.laliga

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.laliga.adapter.EquipoAdapter
import com.example.laliga.databinding.FragmentItemListBinding


class ItemListFragment : Fragment() {

    private lateinit var binding: FragmentItemListBinding
    private lateinit var equipoViewModel: EquipoViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentItemListBinding.inflate(inflater, container, false)
        equipoViewModel = ViewModelProvider(requireActivity()).get(EquipoViewModel::class.java)

        // Inicializar RecyclerView
        initRecyclerView()

        // Observar cambios en la lista de favoritos
        equipoViewModel.favoritos.observe(viewLifecycleOwner, Observer { favoritos ->
            // Actualizar el adaptador con la lista de equipos favoritos
            // Aquí puedes agregar lógica si necesitas actualizar la UI o los favoritos visualmente
        })

        return binding.root
    }

    private fun initRecyclerView() {
        val manager = LinearLayoutManager(requireContext())
        binding.recyclerLaLiga.layoutManager = manager
        binding.recyclerLaLiga.adapter = EquipoAdapter(EquipoProvider.listaEquipos, "itemList")
    }

}










