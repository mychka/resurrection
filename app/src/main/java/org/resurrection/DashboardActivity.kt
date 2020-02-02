package org.resurrection

import android.os.Bundle
import kotlinx.android.synthetic.main.dashboard_activity.*
import org.resurrection.ResurrectionApp.Companion.PROCESS_STARTED_AT
import org.resurrection.ResurrectionApp.Companion.STATE

class DashboardActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.dashboard_activity)

        debugText.text =
            "Process started at $PROCESS_STARTED_AT\nApp started at ${STATE.appStartedAt}\nLast session started at ${STATE.sessionStartedAt}"
    }
}
