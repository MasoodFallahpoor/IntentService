package ir.fallahpoor.intentservice

import android.app.IntentService
import android.content.Intent
import android.util.Log

class DownloadIntentService : IntentService("DOWNLOAD_WORKER_THREAD") {

    companion object {
        const val IMAGE_URL = "image_url"
    }

    private val tag = DownloadIntentService::class.java.simpleName
    private val timeToSleepInMillis = 5000L

    override fun onHandleIntent(intent: Intent?) {
        log("onNewIntent")
        intent?.let {
            log("Image URL is: " + it.getStringExtra(IMAGE_URL))
        }
        downloadImage()
    }

    private fun log(message: String) {
        Log.d(tag, message + " (thread = " + Thread.currentThread().name.toUpperCase() + ")")
    }

    private fun downloadImage() {
        log("Image is downloading ...")
        Thread.sleep(timeToSleepInMillis)
    }

    override fun onDestroy() {
        super.onDestroy()
        log("onDestroy")
    }

}