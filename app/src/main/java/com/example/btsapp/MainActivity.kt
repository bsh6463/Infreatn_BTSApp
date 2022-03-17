package com.example.btsapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //1. 화면이 클릭된것을 알아야 함
        val image1 = findViewById<ImageView>(R.id.bts_image_1)
        val image2 = findViewById<ImageView>(R.id.bts_image_2)
        val image3 = findViewById<ImageView>(R.id.bts_image_3)
        val image4 = findViewById<ImageView>(R.id.bts_image_4)
        val image5 = findViewById<ImageView>(R.id.bts_image_5)
        val image6 = findViewById<ImageView>(R.id.bts_image_6)
        val image7 = findViewById<ImageView>(R.id.bts_image_7)

        image1.setOnClickListener {
            Toast.makeText(this, "1번 선택", Toast.LENGTH_LONG).show()

            //2. 화면이 클릭되면, 다음 화면으로 넘어가서 사진을 크게 보여줌!
            val intent1 = Intent(this, BTS1Activity::class.java)
            startActivity(intent1)
        }

        image2.setOnClickListener {
            Toast.makeText(this, "2번 선택", Toast.LENGTH_LONG).show()

            //2. 화면이 클릭되면, 다음 화면으로 넘어가서 사진을 크게 보여줌!
            val intent2 = Intent(this, BTS2Activity::class.java)
            startActivity(intent2)
        }

        image3.setOnClickListener {
            Toast.makeText(this, "3번 선택", Toast.LENGTH_LONG).show()

            //2. 화면이 클릭되면, 다음 화면으로 넘어가서 사진을 크게 보여줌!
            val intent3 = Intent(this, BTS3Activity::class.java)
            startActivity(intent3)
        }

        image4.setOnClickListener {
            Toast.makeText(this, "4번 선택", Toast.LENGTH_LONG).show()

            //2. 화면이 클릭되면, 다음 화면으로 넘어가서 사진을 크게 보여줌!
            val intent4 = Intent(this, BTS4Activity::class.java)
            startActivity(intent4)
        }

        image5.setOnClickListener {
            Toast.makeText(this, "5번 선택", Toast.LENGTH_LONG).show()

            //2. 화면이 클릭되면, 다음 화면으로 넘어가서 사진을 크게 보여줌!
            val intent5 = Intent(this, BTS5Activity::class.java)
            startActivity(intent5)
        }

        image6.setOnClickListener {
            Toast.makeText(this, "6번 선택", Toast.LENGTH_LONG).show()

            //2. 화면이 클릭되면, 다음 화면으로 넘어가서 사진을 크게 보여줌!
            val intent6 = Intent(this, BTS6Activity::class.java)
            startActivity(intent6)
        }

        image7.setOnClickListener {
            Toast.makeText(this, "7번 선택", Toast.LENGTH_LONG).show()

            //2. 화면이 클릭되면, 다음 화면으로 넘어가서 사진을 크게 보여줌!
            val intent7 = Intent(this, BTS7Activity::class.java)
            startActivity(intent7)
        }

    }
}