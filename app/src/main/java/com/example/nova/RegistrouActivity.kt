package com.example.nova

import android.app.AlertDialog
import android.app.DatePickerDialog
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.Calendar

class RegistrouActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_registrou)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val txtFechaNacimiento = findViewById<EditText>(R.id.txt_fecha)
        txtFechaNacimiento.setOnClickListener {
            mostrarDatePickerDialog(txtFechaNacimiento)
        }

        val txtGenero = findViewById<EditText>(R.id.editTextGenero)
        txtGenero.setOnClickListener {
            mostrarDialogoGenero(txtGenero)
        }

        val btnCuenta = findViewById<Button>(R.id.btncuenta)
        btnCuenta.setOnClickListener {
            // Lógica para ir a la actividad IniciouActivity
            val intent = Intent(this, IniciouActivity::class.java)
            startActivity(intent)
        }
    }

    private fun mostrarDatePickerDialog(editText: EditText) {
        val calendar = Calendar.getInstance()
        val year = calendar.get(Calendar.YEAR)
        val month = calendar.get(Calendar.MONTH)
        val day = calendar.get(Calendar.DAY_OF_MONTH)

        val datePickerDialog = DatePickerDialog(
            this,
            R.style.CustomDatePickerDialogTheme, // Aplica el tema personalizado
            { _, selectedYear, selectedMonth, selectedDay ->
                val selectedDate = "$selectedDay/${selectedMonth + 1}/$selectedYear"
                editText.setText(selectedDate)
            },
            year,
            month,
            day
        )

        datePickerDialog.show()
    }

    private fun mostrarDialogoGenero(editText: EditText) {
        val generos = arrayOf("Masculino", "Femenino", "No binario", "Prefiero no decir")
        val dialogBuilder = AlertDialog.Builder(this)
        dialogBuilder.setTitle("Selecciona tu género")
            .setItems(generos) { _, which ->
                val selectedGenre = generos[which]
                editText.setText(selectedGenre)
            }

        val dialog = dialogBuilder.create()
        dialog.show()
    }
}
