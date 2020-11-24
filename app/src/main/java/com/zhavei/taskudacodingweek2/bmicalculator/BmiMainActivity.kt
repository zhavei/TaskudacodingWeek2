package com.zhavei.taskudacodingweek2.bmicalculator

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.zhavei.taskudacodingweek2.R


class BmimainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.bmi_activity_main)

        supportActionBar!!.hide()
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
        window.addFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS)

        val editextBerat: EditText = findViewById<View>(R.id.bmi_et_berat) as EditText
        val editextTinggi: EditText = findViewById<View>(R.id.bmi_et_tinggi) as EditText
        val tvdetailBerat: TextView = findViewById<View>(R.id.bmi_tv_result_info) as TextView
        val tvHasilCalculate: TextView = findViewById<View>(R.id.bmi_tv_yourindex) as TextView
        val btnCalculate: Button = findViewById<View>(R.id.bmi_bt_calculate) as Button
        val btnReset: Button = findViewById<View>(R.id.bmi_bt_reset) as Button
        btnCalculate.setOnClickListener(View.OnClickListener {
            val berat = editextBerat.text.toString()
            val tinggi = editextTinggi.text.toString()
            if (berat == "") {
                editextBerat.error = "Berat Badan Anda "
                editextBerat.requestFocus()
                return@OnClickListener
            }
            if (tinggi == "") {
                editextTinggi.error = "Tinggi Badan Anda"
                editextTinggi.requestFocus()
                return@OnClickListener
            }
            val beratToFloat = berat.toFloat()
            val tinggiTofloat = tinggi.toFloat() / 100
            val bmiValue = BMICalculate(beratToFloat, tinggiTofloat)
            tvdetailBerat.text = interpreteBMI(bmiValue)
            tvHasilCalculate.text = "BMI= $bmiValue"
        })
        btnReset.setOnClickListener {
            editextTinggi.setText("")
            editextBerat.setText("")
            tvdetailBerat.text = ""
            tvHasilCalculate.text = ""
        }
    }

    fun BMICalculate(weight: Float, height: Float): Float {
        return weight / (height * height)
    }

    fun interpreteBMI(bmiValue: Float): String {
        return when {
            bmiValue < 16 -> {
                "Kamu Kurang Berat Badan Bgt!"
            }
            bmiValue < 18.5 -> {
                "Berat Badan Kamu Kurang"
            }
            bmiValue < 25 -> {
                "Normal, Cakep"
            }
            bmiValue < 30 -> {
                "Kamu Kelebihan Berat Badan"
            }
            else -> "Kamu Obsesi Gendut apa Obesitas"
        }
    }
}