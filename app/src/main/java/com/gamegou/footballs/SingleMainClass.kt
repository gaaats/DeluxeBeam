package com.gamegou.footballs

import android.app.Application
import com.onesignal.OneSignal
import com.orhanobut.hawk.Hawk

class SingleMainClass: Application() {


    companion object {
        var linkfrfrrf = "link"
        const val jpjpjpj = "40e0fb21-186e-4f32-ae62-73f7253021bc"
        var appsCheckfrfrrf55ggtgt = "appsChecker"
        var MAIN_IDdrfrrf8ftgt: String? = ""
        var DEEPLfrfrrf55fggtghy: String? = "d11"
        var C1ftgtgttggtgtg: String? = "c11"


    }

    override fun onCreate() {
        super.onCreate()

        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE)
        OneSignal.initWithContext(this)
        OneSignal.setAppId(jpjpjpj)

        Hawk.init(this).build()


    }

}
