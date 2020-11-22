package com.zhavei.taskudacodingweek2.bmicalculator

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import com.zhavei.taskudacodingweek2.R
import kotlinx.android.synthetic.main.bmi_activity_main.*


class BmimainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.bmi_activity_main)


        supportActionBar!!.hide()
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
        window.addFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS)

        bmi_btn_hitung.setOnClickListener {
            val height = bmi_et_height.text.toString().toFloat() / 100  // dapet nilai tinggi dan convert ke Meter
            val weight = bmi_et_weight.text.toString().toFloat()         // dapet nilai berat dari editext kemudian konvert ke float
            val result : Float = weight/(height*height)  // formula hitung berat badan ideal
            bmi_tv_result.text = "%.2f".format(result) // format hasil hanya menampilkan 2 digit decimal

        }

    }
}