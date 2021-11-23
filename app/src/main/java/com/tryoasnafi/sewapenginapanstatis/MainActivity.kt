package com.tryoasnafi.sewapenginapanstatis

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnWisma: Button = findViewById(R.id.btn_wisma);
        val btnHotel: Button = findViewById(R.id.btn_hotel);

        btnWisma.setOnClickListener(this);
        btnHotel.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id) {
            R.id.btn_wisma -> {
                val moveIntent = Intent(this@MainActivity, DetailWismaActivity::class.java)
                startActivity(moveIntent)
            }

            R.id.btn_hotel -> {
                val moveIntent = Intent(this@MainActivity, DetailHotelActivity::class.java)
                startActivity(moveIntent)
            }
        }
    }
}