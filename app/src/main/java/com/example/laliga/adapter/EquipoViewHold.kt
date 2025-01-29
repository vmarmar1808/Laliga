package com.example.laliga.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.laliga.Equipo
import com.example.laliga.databinding.ItemEquiposBinding

class EquipoViewHold(view: View): RecyclerView.ViewHolder(view) {

    val binding = ItemEquiposBinding.bind(view)

   fun render (equipoModel:Equipo){

       binding.tvEquipoName.text = equipoModel.nombre
       binding.tvEquipoLiga.text = equipoModel.grupo
       binding.tvEquipoEstadio.text = equipoModel.estadio
       Glide.with(binding.ivEquipo.context)
           .load(equipoModel.logo).into(binding.ivEquipo)
   }


}