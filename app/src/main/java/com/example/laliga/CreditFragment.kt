package com.example.laliga

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.laliga.databinding.FragmentCreditBinding
import com.example.laliga.databinding.FragmentTab2CreditBinding
import com.google.android.material.tabs.TabLayoutMediator


class CreditFragment : Fragment() {

    private var _binding : FragmentCreditBinding? = null
    private val binding get() = _binding!!


    val args: CreditFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentCreditBinding.inflate(inflater, container, false)
       // return inflater.inflate(R.layout.fragment_credit, container, false)

        binding.tvName.text = getString(R.string.hello_user, args.user)

        return binding.root


    }

    class CreditAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {

        //Este metodo es para el número de fragmentos.
        override fun getItemCount(): Int = 2

        //Cada vez que creo un fragmento me dice en la posicioón en la que estoy.
        override fun createFragment(position: Int): Fragment {
            val fragment = if (position==0)
                Tab1CreditFragment()
            else
                Tab2CreditFragment()
            return fragment
        }
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Encuentra el ImageButton dentro del LinearLayout
        val backButton: ImageButton? = binding.linearLayout?.findViewById(R.id.btnExit)

// Establecer el OnClickListener para el botón de retroceso
        backButton?.setOnClickListener {
            // Cuando el botón de retroceso es presionado, se hace pop del stack
            requireActivity().supportFragmentManager.popBackStack()
        }


        binding.vpNotice.adapter = CreditAdapter (this)
        TabLayoutMediator(binding.TabNotice, binding.vpNotice){

                tab, position -> when(position){

                    0 -> {
                        tab.text = "Inicio"
                        tab.setIcon(R.drawable.ic_home)
                    }
                     1-> {
                        tab.text="Menú"
                        tab.setIcon(R.drawable.ic_menu)
                    }
                }
        }.attach()

    }


}




