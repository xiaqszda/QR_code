package co.ntx.qr

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.zxing.integration.android.IntentIntegrator

/**
 * xtn
 */
class MainActivity : AppCompatActivity() {

//    private var tv : TextView? = null
//    private var camera : IntentIntegrator? = null
//    private var scanButton : Button? = null
    private val tv = findViewById<TextView>(R.id.text1)
    private val camera = IntentIntegrator(this)
    private val scanButton = findViewById<Button>(R.id.scan)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        init()
        tv.text = "????"
        startQr()
    }


    private fun startQr(){
        Permission().getPermission(this)
        scanButton.setOnClickListener{
            camera.initiateScan()
        }
//        camera.initiateScan()

    }


//    private fun init(){
//        tv = findViewById(R.id.text1)
//        scanButton = findViewById(R.id.scan)
//        camera = IntentIntegrator(this)
//    }
}
