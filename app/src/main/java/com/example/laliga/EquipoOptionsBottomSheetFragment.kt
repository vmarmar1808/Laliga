package com.example.laliga

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class EquipoOptionsBottomSheetFragment(
    private val equipo: Equipo,
    private val listener: OnEquipoOptionSelected
) : BottomSheetDialogFragment() {

    interface OnEquipoOptionSelected {
        fun onEquipoOptionSelected(option: String, equipo: Equipo)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_equipo_option, container, false)

        // Configurar los botones
        view.findViewById<Button>(R.id.btnAddToFavorites).setOnClickListener {
            listener.onEquipoOptionSelected("favoritos", equipo)  // Llamar al método de la interfaz con la opción de favoritos
            dismiss()  // Cerrar el BottomSheet
        }

        view.findViewById<Button>(R.id.btnAddComment).setOnClickListener {
            listener.onEquipoOptionSelected("comentario", equipo)  // Llamar al método de la interfaz con la opción de comentario
            dismiss()  // Cerrar el BottomSheet
        }

        return view
    }
}


