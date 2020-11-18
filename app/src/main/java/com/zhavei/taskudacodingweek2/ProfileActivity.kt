package com.zhavei.taskudacodingweek2

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.*
import com.zhavei.taskudacodingweek2.age.calculator.AgeMainActivity
import com.zhavei.taskudacodingweek2.bmicalculator.BmimainActivity
import com.zhavei.taskudacodingweek2.listview.ListviewMainActivity
import com.zhavei.taskudacodingweek2.recyceview.ListGunungActivity
import kotlinx.android.synthetic.main.activity_profile.*

class ProfileActivity : AppCompatActivity() {

    lateinit var auth: FirebaseAuth
    var databaseReference: DatabaseReference? = null
    var database: FirebaseDatabase? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        supportActionBar!!.hide()
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
        window.addFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS)

        auth = FirebaseAuth.getInstance()
        database = FirebaseDatabase.getInstance()
        databaseReference = database?.reference!!.child("profile")

        loadProfile()
        itemMainActivity()

    }

    //item main activity
    private fun itemMainActivity() {
        cv_bmi.setOnClickListener {
            startActivity(Intent(this@ProfileActivity, BmimainActivity::class.java))

        }

        cv_age.setOnClickListener {
            startActivity(Intent(this@ProfileActivity, AgeMainActivity::class.java))

        }

        cv_listview.setOnClickListener {
            startActivity(Intent(this@ProfileActivity, ListviewMainActivity::class.java))

        }

        cv_recycleview.setOnClickListener {
            startActivity(Intent(this@ProfileActivity, ListGunungActivity::class.java))

        }

        tv_author.setOnClickListener {
            startActivity(Intent(this@ProfileActivity, AboutMainActivity::class.java))

        }

    }

    private fun loadProfile() {
        val user = auth.currentUser
        val userreference = databaseReference?.child(user?.uid!!)


        userreference?.addValueEventListener(object: ValueEventListener{
            override fun onDataChange(snapshot: DataSnapshot) {

                tv_main_firstNametext.text = "Halo " + snapshot.child("firstname").value.toString()
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }
        })

        tv_main_logoutButtonmain.setOnClickListener {
            auth.signOut()
            startActivity(Intent(this@ProfileActivity, LoginActivity::class.java))
            finish()
        }


    }




//    // onbackpressed dialog
//    override fun onBackPressed() {
//        AlertDialog.Builder(this)
//            .setIcon(android.R.drawable.ic_dialog_alert)
//            .setMessage("beneran mau pergi?")
//            .setPositiveButton(
//                "iya"
//            ) { dialog, which -> finish() }
//            .setNegativeButton("engga", null)
//            .show()
//    }
}

