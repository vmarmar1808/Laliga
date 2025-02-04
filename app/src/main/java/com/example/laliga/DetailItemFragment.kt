package com.example.laliga

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class DetailItemFragment : Fragment() {


    /**
     * Hasta que no tenga base de datos, la info (que he añadido un apartado en la lista de EquipoProvider)
     * que aparece está en un Toast al hacer click en el botón de info.
     * */

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail_item, container, false)
    }

}