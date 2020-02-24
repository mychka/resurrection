package org.resurrection

import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.login_activity.*
import org.resurrection.ResurrectionApp.Companion.PROCESS_STARTED_AT
import org.resurrection.ResurrectionApp.Companion.STATE
import java.util.*

class LoginActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (STATE.appStartedAt == null) {
            STATE.appStartedAt = Date().toString()
        }

        setContentView(R.layout.login_activity)

        debugText.text =
            "Process started at $PROCESS_STARTED_AT\nApp started at ${STATE.appStartedAt}\nLast session started at ${STATE.lastSessionStartedAt}"

        loginButton.setOnClickListener {
            STATE.lastSessionStartedAt = Date().toString()

            startActivity(Intent(this, DashboardActivity::class.java))
        }
    }
}