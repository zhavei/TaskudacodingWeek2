package com.zhavei.taskudacodingweek2.recyceview

import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.zhavei.taskudacodingweek2.R

class DetailGunungActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar!!.hide()
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
        window.addFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS)
        setContentView(R.layout.recycle_activity_detail)
        val namaGunung = intent.getStringExtra("namaGunung")
        val imageurl = intent.getStringExtra("imageurl")
        val tinggiGunung = intent.getStringExtra("tinggiGunung")
        val deskripsiGunung = intent.getStringExtra("deskripsiGunung")
        val ivGambar = findViewById<ImageView>(R.id.iv_gambar_gunung)
        val tvNamaGunung = findViewById<TextView>(R.id.tv_nama_gunung)
        val tvTinggiGunung = findViewById<TextView>(R.id.tv_tinggi_gunung)
        val tvDeskripsiGunung = findViewById<TextView>(R.id.tv_deskripsi_gunung)
        tvNamaGunung.text = namaGunung
        tvTinggiGunung.text = tinggiGunung
        tvDeskripsiGunung.text = deskripsiGunung
        Glide.with(this.applicationContext)
            .load(imageurl)
            .into(ivGambar)
    }
}