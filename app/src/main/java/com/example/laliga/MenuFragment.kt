package com.example.laliga

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.laliga.databinding.FragmentMenuBinding
import com.google.android.material.bottomnavigation.BottomNavigationView


class MenuFragment : Fragment() {

    private var _binding : FragmentMenuBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentMenuBinding.inflate(inflater, container, false)
        //return inflater.inflate(R.layout.fragment_menu, container, false)
return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnBack.setOnClickListener{
            requireActivity().supportFragmentManager.popBackStack()
        }

        binding.logoutButton.setOnClickListener{

            findNavController().navigate(MenuFragmentDirections.actionMenuFragmentToLoginFragment())
        }

        // Recojo el contenedor de fragmentos y su controlador
        val navHostFragment = childFragmentManager.findFragmentById(R.id.navHostFragment)
                as NavHostFragment

        val navController = navHostFragment.navController

        // Le pasamos esto a nuestro menú de navegación
        binding.bottomNav.setupWithNavController(navController)
    }
}

