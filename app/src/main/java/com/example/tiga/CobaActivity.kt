package com.example.tiga

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_coba_fragmen.*
import kotlinx.android.synthetic.main.fragment_show_counter.*

class CobaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coba_fragmen)

        btnGoTo.setOnClickListener {
            val intent = Intent(this, DuaActivity::class.java)
            startActivity(intent)
        }
    }

    //without view model
    fun controlledData(value:Int){
        tvCounterResult.text = value.toString()
    }

}