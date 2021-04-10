package hn.edu.ujcv.pdm_2021_i_p3_investigacion.androidApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import hn.edu.ujcv.pdm_2021_i_p3_investigacion.shared.Greeting
import android.widget.TextView
import android.widget.Toast

fun greet(): String {
    return Greeting().greeting()
}
class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btncalcular = findViewById<View>(R.id.buttonc) as Button


        btncalcular.setOnClickListener {
            if (validar().equals(true)) {
                calcular()
            }

        }

    }


    fun calcular() {


        var txvpresion = findViewById<View>(R.id.txvp) as TextView
        var txvarea = findViewById<View>(R.id.txtarea) as EditText
        var txvfuerza = findViewById<View>(R.id.txtfuer) as EditText

        var fuerza: String = txvfuerza.text.toString()
        var area: String = txvarea.text.toString()
        var a: Double = fuerza.toDouble()
        var b: Double = area.toDouble()
        var presion: Double = a / b
        txvpresion.text = "LA PRESION ES: " + presion.toString() + " Pa"
    }

    fun validar(): Boolean {


        var txvarea = findViewById<View>(R.id.txtarea) as EditText
        var txvfuerza = findViewById<View>(R.id.txtfuer) as EditText

        var a = true
        if (txvfuerza.text.isBlank()) {
            Toast.makeText(this, "Ingrese el valor de la fuerza", Toast.LENGTH_SHORT).show()
            a = false
        } else {
            if (txvarea.text.isBlank()) {
                Toast.makeText(this, "Ingrese el valor del area", Toast.LENGTH_SHORT).show()
                a = false
            }

        }
        return a
    }
}

