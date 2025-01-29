package com.example.laliga.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.laliga.Equipo
import com.example.laliga.EquipoOptionsBottomSheetFragment
import com.example.laliga.R

class EquipoAdapter(
    private var equipoLista: List<Equipo>,
    private val listener: EquipoOptionsBottomSheetFragment.OnEquipoOptionSelected
) : RecyclerView.Adapter<EquipoViewHold>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EquipoViewHold {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.item_equipos, parent, false)
        return EquipoViewHold(view)
    }

    override fun onBindViewHolder(holder: EquipoViewHold, position: Int) {
        val itemEquipo = equipoLista[position]
        holder.render(itemEquipo)

        // Mostrar el BottomSheet al hacer clic
        holder.itemView.setOnClickListener {
            val bottomSheet = EquipoOptionsBottomSheetFragment(itemEquipo, listener)
            bottomSheet.show((it.context as AppCompatActivity).supportFragmentManager, "EquipoOptionsBottomSheet")
        }
    }

    override fun getItemCount(): Int = equipoLista.size

    // Nuevo método para actualizar la lista de favoritos dinámicamente
    fun actualizarLista(nuevaLista: List<Equipo>) {
        equipoLista = nuevaLista.toMutableList()
        notifyDataSetChanged()
    }
}



