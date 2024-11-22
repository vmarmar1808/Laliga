package com.example.laliga



import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnGoToCredits = findViewById<Button>(R.id.btn)

        btnGoToCredits.setOnClickListener {

            val userName = findViewById<EditText>(R.id.edUsuario).text.toString()


            val intent = Intent(this, CreditActivity::class.java).apply {
                putExtra("USER_NAME", userName)
                startActivity(intent)
            }

            // Iniciar la actividad
            startActivity(intent)
        }
    }
}

