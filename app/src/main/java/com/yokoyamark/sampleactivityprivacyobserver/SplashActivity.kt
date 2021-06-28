package com.yokoyamark.sampleactivityprivacyobserver

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.*

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
    }

    override fun onStart() {
        super.onStart()

        CoroutineScope(Dispatchers.Default).launch {
            delay(1000)
            startActivity(Intent(this@SplashActivity, MainActivity::class.java))
        }
    }
}
