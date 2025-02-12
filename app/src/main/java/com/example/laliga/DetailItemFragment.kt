package com.example.laliga

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.example.laliga.databinding.FragmentDetailItemBinding


class DetailItemFragment : Fragment() {


    /**
     * Hasta que no tenga base de datos, la info (que he añadido un apartado en la lista de EquipoProvider)
     * que aparece está en un Toast al hacer click en el botón de info.
     * */

    private lateinit var binding: FragmentDetailItemBinding
    private lateinit var equipoViewModel: EquipoViewModel
    private var idEquipo: Int = -1
    private val args: DetailFavItemFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDetailItemBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        equipoViewModel = ViewModelProvider(this).get(EquipoViewModel::class.java)

        // Obtener el ID del equipo desde los argumentos
        arguments?.let {
            idEquipo = DetailItemFragmentArgs.fromBundle(it).idEquipo
        }

        // Buscar y mostrar la información del equipo
        cargarInformacionEquipo()
    }

    private fun cargarInformacionEquipo() {
        val equipo = equipoViewModel.obtenerEquipoPorId(idEquipo, EquipoProvider.listaEquipos)

        equipo?.let {
            binding.nombreEquipo.text = it.nombre
            binding.grupoEquipo.text = it.grupo
            binding.estadioEquipo.text = it.estadio
            binding.infoEquipo.text = it.info

            Glide.with(this)
                .load(it.logo)
                .into(binding.logoEquipo)
        } ?: run {
            Toast.makeText(requireContext(), "Equipo no encontrado", Toast.LENGTH_SHORT).show()
        }
    }
}