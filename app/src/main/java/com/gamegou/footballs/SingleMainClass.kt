package com.gamegou.footballs

import android.app.Application
import com.onesignal.OneSignal
import com.orhanobut.hawk.Hawk

class SingleMainClass: Application() {


    companion object {
        const val dedeedeeedgtgt = "40e0fb21-186e-4f32-ae62-73f7253021bc"
        var appsCheckfrfrrf55 = "appsChecker"
        var MAIN_IDdrfrrf8: String? = ""
        var DEEPLfrfrrf55fg: String? = "d11"
        var C1ftgtgttg: String? = "c11"
        var linkfrfrrf = "link"

    }

    override fun onCreate() {
        super.onCreate()

        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE)
        OneSignal.initWithContext(this)
        OneSignal.setAppId(dedeedeeedgtgt)

        Hawk.init(this).build()


    }

}
