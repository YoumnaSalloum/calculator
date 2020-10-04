package com.myfirstapp.youmna.calc2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun buNumberEvent(view: View) {
        if (isnew) {
            editshow.setText("")
        }
        isnew = false
        val buselected = view as Button
        var buCleckNumber: String = editshow.text.toString()

        when (buselected.id) {

            bu0.id -> {
                buCleckNumber += "0"
            }
            bu1.id -> {
                buCleckNumber += "1"
            }
            bu2.id -> {
                buCleckNumber += "2"
            }
            bu3.id -> {
                buCleckNumber += "3"
            }
            bu4.id -> {
                buCleckNumber += "4"
            }
            bu5.id -> {
                buCleckNumber += "5"
            }
            bu6.id -> {
                buCleckNumber += "6"
            }
            bu7.id -> {
                buCleckNumber += "7"
            }
            bu8.id -> {
                buCleckNumber += "8"
            }
            bu9.id -> {
                buCleckNumber += "9"
            }
            buDot.id -> {
                buCleckNumber += "."
            }
            buplusminise.id -> {
                buCleckNumber = "-" + buCleckNumber

            }
        }
        editshow.setText(buCleckNumber)
    }

    var op = "*"
    var oldnum = ""
    var isnew = true
    fun buOpEvent(view: View) {
        val buselected = view as Button
        when (buselected.id) {
            budiv.id -> {
                op = "/"
            }
            buMin.id -> {
                op = "-"
            }
            buMult.id -> {
                op = "*"
            }
            bupluse.id -> {
                op = "+"
            }


        }
        oldnum = editshow.text.toString()
        isnew = true
    }

    fun buequalEvent(view: View) {
        var newNum = editshow.text.toString()
        var finalNum: Double? = null
        when (op) {
            "*" -> {
                finalNum = oldnum.toDouble() * newNum.toDouble()
            }
            "/" -> {
                finalNum = oldnum.toDouble() / newNum.toDouble()
            }
            "-" -> {
                finalNum = oldnum.toDouble() - newNum.toDouble()
            }
            "+" -> {
                finalNum = oldnum.toDouble() + newNum.toDouble()
            }
        }
        editshow.setText(finalNum.toString())
        isnew = true


    }

    fun buPercent(view: View) {
        var num = editshow.text.toString().toDouble() / 100
        editshow.setText(num.toString())
        isnew = true


    }

    fun buAc(view: View) {
        editshow.setText("0")
        isnew = true
    }
}
