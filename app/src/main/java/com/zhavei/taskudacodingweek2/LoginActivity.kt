package com.zhavei.taskudacodingweek2

import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.view.WindowManager
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    lateinit var auth: FirebaseAuth


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        supportActionBar!!.hide()
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
        window.addFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS)


        auth = FirebaseAuth.getInstance()

        val curretuser = auth.currentUser
        if (curretuser != null) {
            startActivity(Intent(this@LoginActivity, ProfileActivity::class.java))
            finish()
        }

        login()
    }


    private fun login() {
        bt_loginbuttonLogin.setOnClickListener {

            if ( TextUtils.isEmpty(et_usernameinputLogin.text.toString())){
                et_usernameinputLogin.setError("Masukan User Name")
                return@setOnClickListener
            }
            else if ( TextUtils.isEmpty(et_passwordinputLogin.text.toString())){
                et_passwordinputLogin.setError("Masukan password")
                return@setOnClickListener
            }
            auth.signInWithEmailAndPassword(et_usernameinputLogin.text.toString(), et_passwordinputLogin.text.toString())
                .addOnCompleteListener {
                    if (it.isSuccessful) {
                        Toast.makeText(this@LoginActivity, "login berhasil", Toast.LENGTH_LONG).show()
                        startActivity(Intent(this@LoginActivity, ProfileActivity::class.java))
                        finish()
                    } else {
                        Toast.makeText(this@LoginActivity, "Email Atau Pasword Salah", Toast.LENGTH_LONG).show()
                    }
                }
        }

        tv_registertextLogin.setOnClickListener{
            startActivity(Intent(this@LoginActivity, RegistrationActivity::class.java))
        }
    }

    override fun onBackPressed() {
        AlertDialog.Builder(this)
            .setIcon(android.R.drawable.ic_dialog_alert)
            .setMessage("beneran mau pergi?")
            .setPositiveButton(
                "iya"
            ) { dialog, which -> finish() }
            .setNegativeButton("engga", null)
            .show()
    }

}