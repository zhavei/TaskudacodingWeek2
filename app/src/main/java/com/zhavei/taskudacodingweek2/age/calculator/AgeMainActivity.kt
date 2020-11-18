package com.zhavei.taskudacodingweek2.age.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zhavei.taskudacodingweek2.R
import android.view.View
import android.view.WindowManager
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_age_main.*
import java.util.*

class AgeMainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_age_main)

        supportActionBar!!.hide()
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
        window.addFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS)

        age_bt_main.setOnClickListener {
            // ambil age dr editext
            val userDOB = age_et_main.text.toString().trim() //remove space from start and end
            // get cureent year
            val year: Int = Calendar.getInstance().get(Calendar.YEAR)
            //validasi
            if (userDOB == "") { // tidak masukan value
                Toast.makeText(this, "Masukan Umur Anda", Toast.LENGTH_SHORT).show()
            }
            else if ( userDOB > year.toString()) { // tahun > dari tahun sekarang
                Toast.makeText(this, "Tahun Harus Kurang dari Tahun Saat Ini", Toast.LENGTH_SHORT).show()
            }
            else {
                // tahun saat ini - tahun dimasukan
                val myAge = year - userDOB.toInt() //year is INT value, but userDOB was string value we must have to convert it to iNT
                // set the value my age to TextView
                age_tv_calculate.text = "Umur Anda " + myAge + " Tahun"
            }
        }
    }
}