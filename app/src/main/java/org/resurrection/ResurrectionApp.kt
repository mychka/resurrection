package org.resurrection

import android.app.Application
import android.os.Bundle
import java.util.*

class ResurrectionApp : Application() {

    companion object {

        /**
         * Refreshed on every process start.
         */
        val PROCESS_STARTED_AT = Date().toString()

        /**
         * Preserved across process restarts.
         */
        lateinit var STATE: ResurrectionState

        fun ensureState(savedInstanceState: Bundle?) {
            if (!::STATE.isInitialized) {
                STATE = ResurrectionState(savedInstanceState)
            }
        }
    }
}