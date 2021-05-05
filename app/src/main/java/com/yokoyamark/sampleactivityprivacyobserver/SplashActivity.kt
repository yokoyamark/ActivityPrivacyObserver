package com.yokoyamark.sampleactivityprivacyobserver

import android.content.Intent
import android.os.Bundle
import android.view.WindowInsets
import android.view.WindowInsetsController
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
        window.insetsController?.hide(WindowInsets.Type.statusBars() or WindowInsets.Type.navigationBars())
        window.insetsController?.systemBarsBehavior =
            WindowInsetsController.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE

        CoroutineScope(Dispatchers.Default).launch {
            delay(1000)
            startActivity(Intent(this@SplashActivity, MainActivity::class.java))
        }
    }
}
