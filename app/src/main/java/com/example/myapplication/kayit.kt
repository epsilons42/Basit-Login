package com.example.myapplication

import android.content.Intent
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_kayit.*
import com.example.myapplication.R.drawable.kayit_error_shape as kayit_error_shape1

class kayit : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kayit)


        onay.setOnClickListener {

            val sifre = se.text.toString()
            val sifreTekrari = ste.text.toString()

            if(sifre == sifreTekrari){
                val intent = Intent(this@kayit,alisveris::class.java)
                startActivity(intent)
            }else{
                Toast.makeText(applicationContext,"Şifre ve Tekrarı Aynı Değil",Toast.LENGTH_SHORT).show()
            }


        }



    }
}