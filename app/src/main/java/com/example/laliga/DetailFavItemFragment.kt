package com.example.laliga

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.laliga.adapter.ComentarioAdapter
import com.example.laliga.databinding.FragmentDetailFavItemBinding


class DetailFavItemFragment : Fragment() {

    private var _binding: FragmentDetailFavItemBinding? = null
    private val binding get() = _binding!!

    private lateinit var equipoViewModel: EquipoViewModel
    private val args: DetailFavItemFragmentArgs by navArgs()

    private lateinit var comentarioAdapter: ComentarioAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflar el layout para este fragmento
        _binding = FragmentDetailFavItemBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        equipoViewModel = ViewModelProvider(requireActivity()).get(EquipoViewModel::class.java)

        // Configuración del nombre del equipo en el fragmento
        binding.titleTextView.text = args.nombreEquipo

        // Configurar el RecyclerView y su LayoutManager
        binding.recyclerLaLiga3.layoutManager = LinearLayoutManager(requireContext())

        // Inicializar el adapter y asignarlo al RecyclerView
        comentarioAdapter = ComentarioAdapter()
        binding.recyclerLaLiga3.adapter = comentarioAdapter

        // Guardar comentario
        binding.btnGuardarComentario.setOnClickListener {
            val comentario = binding.etComentario.text.toString()
            if (comentario.isNotBlank()) {
                equipoViewModel.agregarComentario(args.idEquipo, comentario)
                binding.etComentario.text.clear()

                // Agregar el comentario al Adapter y actualizar el RecyclerView
                comentarioAdapter.addComentario(comentario)

                // Notificar al RecyclerView para que se actualice
                comentarioAdapter.notifyItemInserted(comentarioAdapter.itemCount - 1)

                Toast.makeText(requireContext(), "Comentario guardado", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(requireContext(), "Por favor, escribe un comentario", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null  // Limpiar el binding cuando la vista se destruya
    }
}





