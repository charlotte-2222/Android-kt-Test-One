/*Charlotte Childers
* CPT-188 Test One
* 6-14-22*/
package com.example.charlotte_childers_cpt_188_test_1

import android.annotation.SuppressLint
import android.content.ContentValues.TAG
import android.util.Log
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.core.view.isVisible
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    lateinit var firstNum: EditText
    lateinit var secondNum: EditText
    lateinit var clear: Button
    lateinit var res: TextView
    lateinit var add: Button
    lateinit var sub: Button
    lateinit var multi: Button
    lateinit var divide: Button
    lateinit var power: Button




    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG,"onCreate(Bundle?) called")
        setContentView(R.layout.activity_main)


        firstNum = findViewById(R.id.etNum1)
        secondNum = findViewById(R.id.etNum2)
        clear = findViewById(R.id.btnCalculate)
        res = findViewById(R.id.result)
        add = findViewById(R.id.add)
        sub = findViewById(R.id.subtract)
        multi = findViewById(R.id.multiply)
        divide = findViewById(R.id.divide)
        power = findViewById(R.id.power)

        val text = "There was an error in your computations!"
        val duration = Toast.LENGTH_LONG
        val toast = Toast.makeText(applicationContext, text, duration)



            add.setOnClickListener { view: View ->
                try {
                    val numInputOne = firstNum.text.toString().toInt()
                    val numInputTwo = secondNum.text.toString().toInt()
                    val finalResult = numInputOne + numInputTwo
                    res.isVisible = true
                    res.setText("Result: $finalResult")
                }catch (e:Exception){
                    Toast.makeText(applicationContext, text, duration).show()
                }finally {
                    closeKeyBoard()
                }

            }

            sub.setOnClickListener { view: View ->
                try {
                    val numInputOne = firstNum.text.toString().toInt()
                    val numInputTwo = secondNum.text.toString().toInt()
                    val finalResult = numInputOne - numInputTwo
                    res.isVisible = true
                    res.setText("Result: $finalResult")
                }catch (e:Exception){
                    Toast.makeText(applicationContext, text, duration).show()
                }finally {
                    closeKeyBoard()
                }


            }

            multi.setOnClickListener { view: View ->
                try {
                    val numInputOne = firstNum.text.toString().toInt()
                    val numInputTwo = secondNum.text.toString().toInt()
                    val finalResult = numInputOne * numInputTwo
                    res.isVisible = true
                    res.setText("Result: $finalResult")
                    }catch (e:Exception){
                    Toast.makeText(applicationContext, text, duration).show()
                    }finally {
                        closeKeyBoard()
                    }

            }

            divide.setOnClickListener { view: View ->
                try {
                    val numInputOne = firstNum.text.toString().toInt()
                    val numInputTwo = secondNum.text.toString().toInt()
                    val finalResult = numInputOne / numInputTwo
                    res.isVisible = true
                    res.setText("Result: $finalResult")
                }catch (e:Exception){
                    Toast.makeText(applicationContext, text, duration).show()
                }finally {
                    closeKeyBoard()
                }

            }

            power.setOnClickListener { view: View ->
                try {
                    val base = firstNum.text.toString().toInt()
                    val exponent = secondNum.text.toString().toInt()
                    val finalResult = Math.pow(base.toDouble(), exponent.toDouble())
                    res.isVisible = true
                    res.setText("Result: $finalResult")
                }catch (e:Exception){
                    Toast.makeText(applicationContext, text, duration).show()
                }finally {
                    closeKeyBoard()
                }

            }

            clear.setOnClickListener{view:View->
                firstNum.text.clear()
                secondNum.text.clear()
                res.isVisible=false
                closeKeyBoard()
            }



    }

    private fun closeKeyBoard() {
        val view = this.currentFocus
        if (view != null) {
            val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(view.windowToken, 0)
        }

    }


    override fun onStart() {
        super.onStart()
        Log.d(TAG,"onStart() called")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume() called")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause() called")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop() called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy() called")
    }

}


