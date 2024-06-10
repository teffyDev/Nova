package com.example.nova

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.nova.databinding.ActivityInicioeBinding

class InicioeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityInicioeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityInicioeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(binding.main) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding.btnEntrare.setOnClickListener {
            val intent = Intent(this, MenueActivity::class.java)
            startActivity(intent)
            finish()
        }

        binding.btnrecuperarcontra.setOnClickListener {
            val intent = Intent(this, RestablecerActivity::class.java)
            startActivity(intent)
        }

        binding.btnregistrare.setOnClickListener {
            val intent = Intent(this, RegistroeActivity::class.java)
            startActivity(intent)
        }
    }
}
