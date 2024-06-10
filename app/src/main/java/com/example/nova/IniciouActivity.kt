package com.example.nova

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.nova.databinding.ActivityIniciouBinding // Asegúrate de importar la clase de enlace generada

class IniciouActivity : AppCompatActivity() {

    private lateinit var binding: ActivityIniciouBinding // Declara una variable para almacenar el objeto de enlace

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityIniciouBinding.inflate(layoutInflater) // Inicializa el objeto de enlace
        setContentView(binding.root) // Establece el contenido de la actividad usando el objeto de enlace


        binding.btnEntrar.setOnClickListener {
            // Crear un Intent para ir a MenuUsuarioActivity
            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
            finish() // Esto cierra la actividad actual
        }

        // Configura el listener para el botón btnRecuperarContra
        binding.btnrecuperarcontra.setOnClickListener {
            val intent = Intent(this, RestablecerActivity::class.java)
            startActivity(intent)
        }

        // Configura el listener para el botón btnRegistrar
        binding.btnregistrar.setOnClickListener {
            val intent = Intent(this, RegistrouActivity::class.java)
            startActivity(intent)
        }
    }
}
