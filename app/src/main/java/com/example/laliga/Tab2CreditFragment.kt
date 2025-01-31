package com.example.laliga

import android.os.Bundle
import android.text.Layout
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.laliga.databinding.FragmentTab2CreditBinding


class Tab2CreditFragment : Fragment() {

    private var _bindind : FragmentTab2CreditBinding? = null
    private val binding get() = _bindind!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _bindind = FragmentTab2CreditBinding.inflate(inflater, container, false)
       // return inflater.inflate(R.layout.fragment_tab2_credit, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

binding.btn1.setOnClickListener{

    findNavController().navigate(CreditFragmentDirections.actionCreditFragmentToMenuFragment())
}
    }
}
