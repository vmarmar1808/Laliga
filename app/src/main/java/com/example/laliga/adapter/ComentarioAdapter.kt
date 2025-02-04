package com.example.laliga.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.laliga.R
import com.example.laliga.databinding.ItemComentariosBinding

class ComentarioAdapter(private val comentarios: MutableList<String> = mutableListOf()) : RecyclerView.Adapter<ComentarioAdapter.ComentarioViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ComentarioViewHolder {
        val binding = ItemComentariosBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ComentarioViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ComentarioViewHolder, position: Int) {
        val comentario = comentarios[position]
        holder.bind(comentario)
    }

    override fun getItemCount(): Int = comentarios.size

    fun addComentario(comentario: String) {
        comentarios.add(comentario)
    }

    class ComentarioViewHolder(private val binding: ItemComentariosBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(comentario: String) {
            // Ahora usamos etComentario en lugar de tvEquipoNombre
            binding.etComentario.setText(comentario)
        }
    }
}

