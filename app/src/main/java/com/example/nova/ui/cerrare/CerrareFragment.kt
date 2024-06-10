package com.example.nova.ui.cerrare

import android.content.Intent
import androidx.fragment.app.viewModels
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import com.example.nova.MainActivity
import com.example.nova.R

class CerrareFragment : Fragment() {

    companion object {
        fun newInstance() = CerrareFragment()
    }

    private val viewModel: CerrareViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_cerrare, container, false)

        // Find the button by id
        val btnVolverEntradae = view.findViewById<ImageButton>(R.id.btnVolverEntradae)

        // Set OnClickListener to the button
        btnVolverEntradae.setOnClickListener {
            // Start the MainActivity
            startActivity(Intent(requireContext(), MainActivity::class.java))

            // Optionally, you can finish the current activity
            requireActivity().finish()
        }

        return view
    }
}
