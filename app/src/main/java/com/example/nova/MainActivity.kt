package com.example.nova

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        // Encuentra el botón y establece el listener
        val btnUsuario = findViewById<Button>(R.id.btn_usuario)
        btnUsuario .setOnClickListener {
            val intent = Intent(this, IniciouActivity::class.java)
            startActivity(intent)
    }

        // Encuentra el botón y establece el listener
        val btnEntidad  = findViewById<Button>(R.id.btn_entidad)
        btnEntidad .setOnClickListener {
            val intent = Intent(this, InicioeActivity::class.java)
            startActivity(intent)


}
}
    }