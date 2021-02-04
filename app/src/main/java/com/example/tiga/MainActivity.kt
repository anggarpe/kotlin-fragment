package com.example.tiga

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {

    private lateinit var length: EditText
    private lateinit var height: EditText
    private lateinit var width: EditText
    private lateinit var result: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        length = findViewById(R.id.etLength)
        height = findViewById(R.id.etHeight)
        width = findViewById(R.id.etWidth)
        result = findViewById(R.id.tvResult)
    }

    fun onAlertDialog(view: View, title: String, message: String) {
        //Instantiate builder variable
        val builder = AlertDialog.Builder(view.context)
        // set title
        builder.setTitle(title)
        //set content area
        builder.setMessage(message)

        //set positive button
        builder.setPositiveButton(
            "Ok"
        ) { dialog, id ->
            // User clicked Update Now button
//            Toast.makeText(this, "Updating your device",Toast.LENGTH_SHORT).show()
        }

        //set negative button
//        builder.setNegativeButton(
//            "Cancel") { dialog, id ->
//            // User cancelled the dialog
//        }

        //set neutral button
//        builder.setNeutralButton("Reminder me latter") {dialog, id->
//            // User Click on reminder me latter
//        }
        builder.show()
    }

    fun onCalculate(view: View) {
        if (!checkIsEmpty()) {
            val res = (length.text.toString().toInt()) * (width.text.toString()
                .toInt()) * (height.text.toString().toInt())
            result.text = res.toString()
        } else onAlertDialog(view, "Warning", "Value can't be empty")
    }

    private fun checkIsEmpty(): Boolean {
        return length.text.toString().isEmpty() || width.text.toString()
            .isEmpty() || height.text.toString().isEmpty()
    }

}
