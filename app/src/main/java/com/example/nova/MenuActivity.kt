package com.example.nova

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.nova.databinding.ActivityMenuBinding

class MenuActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMenuBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(findViewById(R.id.toolbar));
        // Cambiar el color de la barra de estado


        val navView = binding.navView
        val navController = findNavController(R.id.nav_host_fragment_activity_menu)
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.botonFragment, R.id.perfilFragment, R.id.acosoFragment, R.id.cerrarFragment
            )
        )



        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
    }
}
