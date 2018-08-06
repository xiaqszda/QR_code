package co.ntx.qr

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
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


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        val intentResult = IntentIntegrator.parseActivityResult(requestCode, resultCode, data)
        if (intentResult != null){
            if (intentResult.contents == null){
                toast("扫描错误")
            }else{
                toast(intentResult.contents)
                text1.text = intentResult.contents
            }
        }
        super.onActivityResult(requestCode, resultCode, data)
    }

}
