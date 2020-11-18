package com.zhavei.taskudacodingweek2

import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.view.WindowManager
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_registration.*

class RegistrationActivity : AppCompatActivity() {
    lateinit var auth: FirebaseAuth
    var databaseReference: DatabaseReference? = null
    var database: FirebaseDatabase? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        supportActionBar!!.hide()
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
        window.addFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS)

        setContentView(R.layout.activity_registration)

        auth = FirebaseAuth.getInstance()
        database = FirebaseDatabase.getInstance()
        databaseReference = database?.reference!!.child("profile")

        register()
        backLogin()
    }


    private fun register() {
        bt_registerbutton.setOnClickListener {

            if (TextUtils.isEmpty(et_FirstNameInput.text.toString())) {
                et_FirstNameInput.setError("Nama Depan")
                return@setOnClickListener
            } else if (TextUtils.isEmpty(et_lastnameinput.text.toString())) {
                et_lastnameinput.setError("Nama Belakang")
                return@setOnClickListener
            } else if (TextUtils.isEmpty(et_usernameinputReg.text.toString())) {
                et_usernameinputReg.setError("Masukan User Name")
                return@setOnClickListener
            } else if (TextUtils.isEmpty(et_passwordinputReg.text.toString())) {
                et_passwordinputReg.setError("Masukan Pasword")
                return@setOnClickListener
            }


            auth.createUserWithEmailAndPassword(
                et_usernameinputReg.text.toString(),
                et_passwordinputReg.text.toString()
            )
                .addOnCompleteListener {
                    if (it.isSuccessful) {
                        val currentUser = auth.currentUser
                        val currentUserDb = databaseReference?.child((currentUser?.uid!!))
                        currentUserDb?.child("firstname")
                            ?.setValue(et_FirstNameInput.text.toString())
                        currentUserDb?.child("lastname")
                            ?.setValue(et_lastnameinput.text.toString())
                        Toast.makeText(
                            this@RegistrationActivity,
                            " registrasi berhasil!",
                            Toast.LENGTH_LONG
                        ).show()
                        finish()


                    } else {
                        Toast.makeText(
                            this@RegistrationActivity,
                            " registrasi gagal, email salah atau pass kurang kuat",
                            Toast.LENGTH_LONG
                        ).show()
                    }
                }
        }
    }

    private fun backLogin() {
        tv_back_login.setOnClickListener {
            startActivity(Intent(this@RegistrationActivity, LoginActivity::class.java))
            onBackPressed()
        }
    }

}