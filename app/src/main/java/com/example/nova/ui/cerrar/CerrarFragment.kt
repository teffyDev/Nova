package com.example.nova.ui.cerrar

import android.content.Intent
import androidx.fragment.app.viewModels
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.nova.MainActivity
import com.example.nova.R
import com.example.nova.databinding.FragmentCerrarBinding

class CerrarFragment : Fragment() {

    private var _binding: FragmentCerrarBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentCerrarBinding.inflate(inflater, container, false)
        val root: View = binding.root

        // Configurar el OnClickListener para el botón btnVolverEntrada
      binding.btnVolverEntrada.setOnClickListener {
            // Crear un Intent para ir a EntradaActivity
            val intent = Intent(activity, MainActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(intent)
            activity?.finish() // Finalizar la actividad actual (MainActivity)
        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
