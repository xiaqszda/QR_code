package co.ntx.qr

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.zxing.integration.android.IntentIntegrator
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.toast

/**
 * xtn
 */
class MainActivity : AppCompatActivity() {

    private val camera = IntentIntegrator(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        text1.text = "????"
        startQr()
    }


    private fun startQr(){
        Permission().getPermission(this)
        scan.setOnClickListener{
            camera.initiateScan()
            toast("点击")
        }

    }


}
