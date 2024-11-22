package com.example.laliga

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class CreditActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_credit)

        val userName = intent.getStringExtra("USER_NAME")
        findViewById<TextView>(R.id.tvUserName).text = "$userName, estás usando la versión 1 de 1ºRFEF"

        findViewById<Button>(R.id.btnContact).setOnClickListener {
            val emailIntent = Intent(Intent.ACTION_SEND).apply {
                type = "message/rfc822"
                putExtra(Intent.EXTRA_EMAIL, arrayOf("vmarmar1808@g.educaand.es"))
                putExtra(Intent.EXTRA_SUBJECT, "Consulta de la app 1ºRFEF")
            }
            startActivity(Intent.createChooser(emailIntent, "Enviar correo"))
        }
    }
}
