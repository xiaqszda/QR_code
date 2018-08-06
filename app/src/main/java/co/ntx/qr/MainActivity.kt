package co.ntx.qr

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

/**
 * 主类
 * xtn
 */
class MainActivity : AppCompatActivity() {

    private var tv : TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
        tv!!.text = "????"
        startQr()
    }


    private fun startQr(){
        Permission().getPermission(this)
    }


    private fun init(){
        tv = findViewById(R.id.text1)
    }
}
