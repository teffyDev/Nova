package com.example.nova.ui.perfil

import android.content.Intent
import androidx.fragment.app.viewModels
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.nova.HistorialActivity
import com.example.nova.R

class PerfilFragment : Fragment() {

    companion object {
        fun newInstance() = PerfilFragment()
    }

    private val viewModel: PerfilViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // TODO: Use the ViewModel
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.fragment_perfil, container, false)

        val btnHistorial = view.findViewById<Button>(R.id.btnhistrorial)
        btnHistorial.setOnClickListener {
            val intent = Intent(activity, HistorialActivity::class.java)
            startActivity(intent)
        }

        return inflater.inflate(R.layout.fragment_perfil, container, false)
    }
}

