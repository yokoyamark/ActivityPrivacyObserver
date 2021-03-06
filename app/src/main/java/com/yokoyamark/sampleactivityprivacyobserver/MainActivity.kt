package com.yokoyamark.sampleactivityprivacyobserver

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.yokoyamark.activityprivacyobserver.PrivacyObserver

class MainActivity : AppCompatActivity() {
    lateinit var privacyObserver: PrivacyObserver

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        privacyObserver = PrivacyObserver(this, R.layout.activity_splash)
        lifecycle.addObserver(privacyObserver)
    }

    override fun onUserLeaveHint() {
        super.onUserLeaveHint()
        privacyObserver.onUserLeaveHint()
    }

}
