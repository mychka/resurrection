package org.resurrection

import android.os.Bundle

class ResurrectionState(savedInstanceState: Bundle?) {

    var appStartedAt: String? = null

    var sessionStartedAt: String? = null

    init {
        savedInstanceState?.let {
            appStartedAt = it.getString("appStartedAt")
            sessionStartedAt = it.getString("sessionStartedAt")
        }
    }

    fun save(outState: Bundle) {
        outState.putString("appStartedAt", appStartedAt)
        outState.putString("sessionStartedAt", sessionStartedAt)
    }
}