package org.resurrection

import android.os.Bundle

class ResurrectionState(savedInstanceState: Bundle?) {

    /**
     * Some piece of the global state.
     */
    var appStartedAt: String? = null

    /**
     * Another piece of the global state.
     */
    var lastSessionStartedAt: String? = null

    init {
        // Deserialize global state.
        savedInstanceState?.let {
            appStartedAt = it.getString("appStartedAt")
            lastSessionStartedAt = it.getString("lastSessionStartedAt")
        }
    }

    /**
     * Serialize global state.
     */
    fun save(outState: Bundle) {
        outState.putString("appStartedAt", appStartedAt)
        outState.putString("lastSessionStartedAt", lastSessionStartedAt)
    }
}