package com.pepela.opendota

import android.app.Application
import com.pepela.opendota.di.applicationModule
import com.pepela.opendota.di.playerModule
import org.koin.android.ext.android.startKoin
import timber.log.Timber

class OpenDotaApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin(this, listOf(applicationModule, playerModule))

        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }

}
