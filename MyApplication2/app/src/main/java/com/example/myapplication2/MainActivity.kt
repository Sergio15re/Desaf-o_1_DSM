package com.example.myapplication2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlin.math.*

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var txta=findViewById<EditText>(R.id.et_a)
        var txtb=findViewById<EditText>(R.id.et_b)
        var txtc=findViewById<EditText>(R.id.et_c)
        val calc=findViewById<Button>(R.id.btn_calcular)

        calc.setOnClickListener{
            var a=txta.text.toString().toFloat()
            var b=txtb.text.toString().toFloat()
            var c=txtc.text.toString().toFloat()
            var z:Float = 0.00f
            var y:Float = 0.00f
            var x:Float = b.pow(2)-(4*a*c)

            if(x<0){
                Toast.makeText(this,"No se puede resolver en los Números Reales", Toast.LENGTH_LONG).show()
            }
            else {
                 z = (-b + sqrt(b.pow(2) - (4 * a * c))) / (2 * a)
                 y = (-b - sqrt(b.pow(2) - (4 * a * c))) / (2 * a)
                 Toast.makeText(this, "x= $z   y   x=$y ", Toast.LENGTH_LONG).show()
                 }

    }   }
}