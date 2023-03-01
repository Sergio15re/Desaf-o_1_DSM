package com.example.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var txtNom=findViewById<EditText>(R.id.et_Nombre)
        var txtcod=findViewById<EditText>(R.id.et_Codigo)
        var txtmes=findViewById<EditText>(R.id.et_Mes)
        var txtvent=findViewById<EditText>(R.id.et_Ventas)
        val calc=findViewById<Button>(R.id.btn_Calcular)
        var a=txtNom.text.toString()
        var b=txtcod.text.toString()
        var c=txtmes.text.toString()
        var d=txtvent.text.toString()



        calc.setOnClickListener{
            var a=txtNom.text.toString()
            var b=txtcod.text.toString()
            var c=txtmes.text.toString()
            var d=txtvent.text.toString()



            var ventas=txtvent.text.toString().toFloat()
            if(ventas<500){Toast.makeText(this,"La comisión de $a  en el mes de $c es: 0",Toast.LENGTH_LONG).show() }

            else if(ventas>=500 && ventas<1000){
                var z:Float= 0.00F
                z= ((ventas*0.05).toFloat())
                Toast.makeText(this,"La comisión de $a  en el mes de $c es: $z",Toast.LENGTH_LONG).show() }

            else if(ventas>=1000 && ventas<2000){
                var z:Float= 0.00F
                z= ((ventas*0.10).toFloat())
                Toast.makeText(this,"La comisión de $a  en el mes de $c es: $z",Toast.LENGTH_LONG).show() }

            else if(ventas>=2000 && ventas<3000){
                var z:Float= 0.00F
                z= ((ventas*0.15).toFloat())
                Toast.makeText(this,"La comisión de $a  en el mes de $c es: $z",Toast.LENGTH_LONG).show() }

            else if(ventas>=3000 && ventas<4000){
                var z:Float= 0.00F
                z= ((ventas*0.20).toFloat())
                Toast.makeText(this,"La comisión de $a  en el mes de $c es: $z",Toast.LENGTH_LONG).show() }

            else if(ventas>=4000){
                var z:Float= 0.00F
                z= ((ventas*0.30).toFloat())
                Toast.makeText(this,"La comisión de $a  en el mes de $c es: $z",Toast.LENGTH_LONG).show() }




        }


    }


}

