package com.example.laliga.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.laliga.Equipo
import com.example.laliga.R

class EquipoAdapter(
    private var equipoLista: List<Equipo>,
    private val origen: String // Añadir el parámetro de origen
) : RecyclerView.Adapter<EquipoViewHold>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EquipoViewHold {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.item_equipos, parent, false)
        return EquipoViewHold(view, origen) // Pasamos el origen aquí
    }

    override fun onBindViewHolder(holder: EquipoViewHold, position: Int) {
        val itemEquipo = equipoLista[position]
        holder.render(itemEquipo)
    }

    override fun getItemCount(): Int = equipoLista.size

    fun actualizarLista(nuevaLista: List<Equipo>) {
        equipoLista = nuevaLista.toMutableList()
        notifyDataSetChanged()
    }
}



