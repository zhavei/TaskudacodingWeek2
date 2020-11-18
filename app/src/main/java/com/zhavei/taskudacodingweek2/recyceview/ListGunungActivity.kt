package com.zhavei.taskudacodingweek2.recyceview

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.view.WindowManager
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.zhavei.taskudacodingweek2.R
import com.zhavei.taskudacodingweek2.R.layout
import java.util.*

class ListGunungActivity : AppCompatActivity() {
    // ambil data list gunung
    private val gunungList = MockData.gunungList
    private val gunungListDisplay: MutableList<Gunung> = ArrayList()
    private var adapter: GunungListAdapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar!!.hide()
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
        window.addFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS)
        setContentView(layout.recycle_activity_list_gunung)
        gunungListDisplay.addAll(gunungList)

        //editext search
        val etSearch = findViewById<EditText>(R.id.et_search_gununglist)
        etSearch.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {
                //not Use
            }

            override fun onTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {
                //not use
            }

            override fun afterTextChanged(editable: Editable) {
                val searchKey = editable.toString()
                gunungListDisplay.clear()
                for (gunung in gunungList) {
                    val namaGunung = gunung.namaGunung?.toLowerCase()
                    if (namaGunung != null) {
                        if (namaGunung.contains(searchKey.toLowerCase())) {
                            gunungListDisplay.add(gunung)
                        }
                    }
                }
                adapter!!.notifyDataSetChanged()
            }
        })


        // menampilkan list gunung
        val rvGunungList = findViewById<RecyclerView>(R.id.rv_gunung_list)
        rvGunungList.layoutManager = LinearLayoutManager(this.applicationContext)
        adapter = GunungListAdapter(gunungListDisplay)
        rvGunungList.adapter = adapter
    }

}