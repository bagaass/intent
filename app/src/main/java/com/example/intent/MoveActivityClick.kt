package com.example.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.view.View

class MoveActivityClick : AppCompatActivity() {

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_move_activity -> {
                val moveIntent = Intent(this@MainActivity, MoveActivityClick::class.java)
                startActivity(moveIntent)
            }
        }
    }
}