package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_alisveris.*

class alisveris : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alisveris)
        setSupportActionBar(toolbar)


    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
         menuInflater.inflate(R.menu.menum,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
         when(item.itemId){
             R.id.userim ->{
                 val intent = Intent(this@alisveris,face::class.java)
                 startActivity(intent)
                 return true
             }else ->{
                 return super.onOptionsItemSelected(item)
             }
         }
    }
}