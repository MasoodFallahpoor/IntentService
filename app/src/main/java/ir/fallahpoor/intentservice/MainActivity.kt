package ir.fallahpoor.intentservice

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startDownloadIntentServiceButton.setOnClickListener {
            intent = Intent(this, DownloadIntentService::class.java).apply {
                putExtra(DownloadIntentService.IMAGE_URL, "http://www.example.com/example.jpg")
            }
            startService(intent)
            showToast("Service DownloadIntentService STARTED")
        }

    }

    private fun showToast(message: String) {
        Toast.makeText(applicationContext, message, Toast.LENGTH_LONG).show()
    }

}
