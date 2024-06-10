package com.example.nova.ui.perfile

import android.content.Intent
import androidx.fragment.app.viewModels
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.nova.HistorialeActivity
import com.example.nova.R

class PerfileFragment : Fragment() {

    companion object {
        fun newInstance() = PerfileFragment()
    }

    private val viewModel: PerfileViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_perfile, container, false)

        // Find the button by id
        val btnHistoriale = view.findViewById<Button>(R.id.btnhistroriale)

        // Set OnClickListener to the button
        btnHistoriale.setOnClickListener {
            // Start the activity activity_historiale
            startActivity(Intent(requireContext(), HistorialeActivity::class.java))
        }

        return view
    }
}