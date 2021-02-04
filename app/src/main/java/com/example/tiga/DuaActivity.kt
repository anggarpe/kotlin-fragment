package com.example.tiga

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_dua.*

class DuaActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var counterFragment: CounterFragment
    private lateinit var showCounterFragment: ShowCounterFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dua)

        btnShowCounter.setOnClickListener(this)
        btnShowAll.setOnClickListener(this)

        counterFragment = CounterFragment()
        showCounterFragment = ShowCounterFragment()
        supportFragmentManager.beginTransaction().add(R.id.fragmentContainerFrame, counterFragment).commit()
    }

    override fun onClick(v: View?) {
        when(v){
            btnShowAll -> {
                val intent = Intent(this, CobaActivity::class.java)
                startActivity(intent)
            }
            btnShowCounter -> {
                if (btnShowCounter.text.toString()=="Show Result"){
                    switchFragment(showCounterFragment, "Show Counter")
                }else {
                    switchFragment(counterFragment, "Show Result")
                }
            }
        }
    }

    private fun switchFragment(fragment: Fragment, button:String) {
        supportFragmentManager.beginTransaction().replace(R.id.fragmentContainerFrame, fragment).commit()
        btnShowCounter.text= button
    }


}