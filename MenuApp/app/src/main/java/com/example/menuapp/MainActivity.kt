package com.example.menuapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu , menu)

        return true

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if (item !=null){
            when (item.itemId){

                R.id.muHome -> {
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                }
                R.id.muAbout ->{
                    val intent = Intent(this, MainActivity2::class.java)
                    startActivity(intent)
                }
                R.id.muHelp ->{
                    val intent = Intent(this, MainActivity3::class.java)
                    startActivity(intent)
                }

            }
        }
        return super.onOptionsItemSelected(item)
    }
}
