package com.example.myapplication

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_face.*

class face : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_face)
        val sp = getSharedPreferences("userHatirlama", Context.MODE_PRIVATE)
        val editör = sp.edit()
        faceButton.setOnClickListener {

            editör.remove("kullaniciAdi")
            editör.remove("sifre")
            editör.commit()

            val intent = Intent(this@face,MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}