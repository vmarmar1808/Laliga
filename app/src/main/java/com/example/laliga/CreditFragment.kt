package com.example.laliga

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.laliga.databinding.FragmentCreditBinding


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

        binding.tvVersion.text = getString(R.string.hello_user, args.user)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnContact.setOnClickListener{
            val emailIntent = Intent(Intent.ACTION_SEND).apply {
                type = "message/rfc822"
                putExtra(Intent.EXTRA_EMAIL, arrayOf("vmarmar1808@g.educaand.es"))
                putExtra(Intent.EXTRA_SUBJECT, "Consulta de la app 1ºRFEF")
            }
            startActivity(Intent.createChooser(emailIntent, "Enviar correo"))
        }
    }


}




