package com.example.a20102173_cardview_sqlite

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {
    lateinit var userDBHelper: DBHelper
    lateinit var lltampil: LinearLayout
    lateinit var tampil: TextView
    @SuppressLint("MissingInflatedId", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        userDBHelper = DBHelper(this)
        tampil = findViewById(R.id.tampil_semua)
        lltampil = findViewById(R.id.ll_tampil)
        var tampilkan = userDBHelper.fullData()
//        lltampil.removeAllViews()
        tampilkan.forEach {
            tampil.text = tampil.text.toString() + " " + it.email.toString() + " - "  +
                    it.pass.toString() + " - "  + it.username.toString() + " - "  +
                    it.fullname.toString() + "\n"
//            lltampil.addView(tampil)
        }
    }
}