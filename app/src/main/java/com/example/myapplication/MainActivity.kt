package com.example.myapplication

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sp = getSharedPreferences("userHatirlama",Context.MODE_PRIVATE)
        val editör = sp.edit()
        val ogKullanici = sp.getString("kullaniciAdi","Kullanici adi yok")
        val ogsifre = sp.getString("sifre","şifre yok")

        if(ogKullanici == "alibu" && ogsifre == "123456789"){
            val intent = Intent(this@MainActivity,alisveris::class.java)
            startActivity(intent)
            finish()
        }

        giris.setOnClickListener {

            val kullanici = "alibu"
            val sifre = 123456789
            val alinanUser = username.text.toString()
            val alinanKey = key.text.toString()


            editör.putString("ad",alinanUser)
            editör.commit()
            val userNameSP = sp.getString("ad","")

           if(kullanici==alinanUser && sifre.toString() == alinanKey){

               editör.putString("kullaniciAdi",kullanici)
               editör.putString("sifre",sifre.toString())
               editör.commit()

               val intent = Intent(this@MainActivity,alisveris::class.java)
               startActivity(intent)
               finish()

        } else{
            Toast.makeText(applicationContext,"kullanıcı adı şifre doğru girin",Toast.LENGTH_SHORT).show()
               username.setText(userNameSP)
               key.setText("")
           }


        }

        kayitol.setOnClickListener {
            val intent = Intent(this@MainActivity,kayit::class.java)
            startActivity(intent)
        }

        devam.setOnClickListener {
            val intent = Intent(this@MainActivity,alisveris::class.java)
            startActivity(intent)
        }


    }
}