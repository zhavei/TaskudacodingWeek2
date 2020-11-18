package com.zhavei.taskudacodingweek2.listview

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import androidx.appcompat.app.AppCompatActivity
import com.zhavei.taskudacodingweek2.R
import kotlinx.android.synthetic.main.listview_mainactivity.*
import kotlinx.android.synthetic.main.listview_item_list_vehicle.view.*
import kotlinx.android.synthetic.main.listview_item_list_sport_car.view.*
import java.util.*

class ListviewMainActivity : AppCompatActivity() {

    var listVehicle = ArrayList<ModelDataVehicle>()
    var adapter: AdapterVehicle? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.listview_mainactivity)

        listVehicle.add(
            ModelDataVehicle("Ferrari", "Mobil Sport", R.drawable.listv_ferari, false)
        )
        listVehicle.add(
            ModelDataVehicle("BMW", "Mobil Sport", R.drawable.listv_bmw, false)
        )
        listVehicle.add(
            ModelDataVehicle("Tesla", "Mobil Sport", R.drawable.listv_tesla, false)
        )
        listVehicle.add(
            ModelDataVehicle("Yamaha R1", "Motor Sport", R.drawable.listv_yamahar1, false)
        )
        listVehicle.add(
            ModelDataVehicle("Toyota", "Mobil Kota", R.drawable.listv_toyota, false)
        )
        listVehicle.add(
            ModelDataVehicle("Hyundai", "Mobil Kota", R.drawable.listv_yunda, false)
        )

        listVehicle.add(
            ModelDataVehicle("Bus", "Mobil Kota", R.drawable.listv_bus, false)
        )

        listVehicle.add(
            ModelDataVehicle("Mazda", "Mobil Kota", R.drawable.listv_mazda, false)
        )

        listVehicle.add(
            ModelDataVehicle("Motor Honda", "Motor Kota", R.drawable.listv_yunda, false)
        )

        adapter = AdapterVehicle(this, listVehicle)
        lv_vehicle.adapter = adapter
    }

    inner class AdapterVehicle: BaseAdapter {
        var listVehicle = ArrayList<ModelDataVehicle>()
        var context: Context?=null

        constructor(context: Context, listOfVehicle: ArrayList<ModelDataVehicle>):super(){
            this.listVehicle= listOfVehicle
            this.context=context
        }

        override fun getView(p0: Int, p1: View?, p3: ViewGroup?): View {
            val vehicle = listVehicle[p0]
            if (vehicle.sportCar == true) {
                var inflator = context!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as
                        LayoutInflater
                var myView = inflator.inflate(R.layout.listview_item_list_sport_car, null)
                myView.tv_item_list_sport_cars.text = vehicle.nama!!
                myView.tv_deskrip_item_list_sport_car.text = vehicle.deskripsi!!
                myView.iv_item_list_sport_car.setImageResource(vehicle.gambar!!)
                myView.iv_item_list_sport_car.setOnClickListener {
                    val intent = Intent(context, listviewDetailVehicle::class.java)
                    intent.putExtra("nama", vehicle.nama!!)
                    intent.putExtra("deskripsi", vehicle.deskripsi!!)
                    intent.putExtra("gambar", vehicle.gambar!!)
                    context!!.startActivity(intent)
                }
                return myView
            } else {
                val vehicleElse = listVehicle[p0]
                val inflator = context!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as
                        LayoutInflater
                var myView = inflator.inflate(R.layout.listview_item_list_vehicle, null)
                myView.tv_item_list_vehicle.text = vehicleElse.nama!!
                myView.tv_deskrip_item_list_vehicle.text = vehicleElse.deskripsi!!
                myView.iv_item_list_vehicle.setImageResource(vehicleElse.gambar!!)
                myView.iv_item_list_vehicle.setOnClickListener {
                    val intent = Intent (context, listviewDetailVehicle::class.java)
                    intent.putExtra("nama", vehicleElse.nama!!)
                    intent.putExtra("deskripsi", vehicleElse.deskripsi!!)
                    intent.putExtra("gambar", vehicleElse.gambar!!)
                    context!!.startActivity(intent)

                }
                return myView
            }
        }

        override fun getItem(p0: Int): Any {
            return listVehicle[p0]
        }

        override fun getItemId(p0: Int): Long {
            return  p0.toLong()
        }

        override fun getCount(): Int {
            return listVehicle.size
        }
    }

}