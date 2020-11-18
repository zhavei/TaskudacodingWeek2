package com.zhavei.taskudacodingweek2.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zhavei.taskudacodingweek2.R
import kotlinx.android.synthetic.main.listview_activity_detail_vehicle.*

class listviewDetailVehicle : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.listview_activity_detail_vehicle)

        val bundle = intent.extras

        bundle?.getInt("gambar")?.let { iv_vehicle_detail.setImageResource(it) }
        tv_nama_vehicle.text = bundle?.getString("nama")
        tv_deskripsi_detail.text = bundle?.getString("deskripsi")
    }
}