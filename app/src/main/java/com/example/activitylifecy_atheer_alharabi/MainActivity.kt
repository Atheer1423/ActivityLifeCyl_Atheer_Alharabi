package com.example.activitylifecy_atheer_alharabi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show()
        Log.d("create","onCreate")

    }
    override fun onStart() {
        super.onStart()
        Log.d("start","onStart")
        Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Log.d("resume","onResume")
        Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        Log.d("pause","onPause")
        Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Log.d("stop","onStop")
        Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.d("destroy","onDestroy")
        Toast.makeText(this, "onDestory", Toast.LENGTH_SHORT).show()
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("restart","onRestart")
        Toast.makeText(this, "onRestart", Toast.LENGTH_SHORT).show()
    }
}

