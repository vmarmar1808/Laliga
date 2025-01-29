package com.example.laliga.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.laliga.Equipo
import com.example.laliga.EquipoOptionsBottomSheetFragment
import com.example.laliga.R
import com.google.android.material.animation.AnimatableView.Listener

class EquipoAdapter(
    private val equipoLista: List<Equipo>,
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
}


