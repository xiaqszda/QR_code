package co.ntx.qr

import android.os.Bundle
import com.journeyapps.barcodescanner.CaptureManager
import kotlinx.android.synthetic.main.zxing_activity.*


internal class ZxingActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.zxing_activity)
        val capture = CaptureManager(this, dbv)
        capture.initializeFromIntent(intent, savedInstanceState)
        capture.decode()

    }
}
