package co.ntx.qr

import android.Manifest
import android.app.Activity
import android.content.pm.PackageManager
import android.support.v4.app.ActivityCompat
import android.support.v7.app.AppCompatActivity
import org.jetbrains.anko.alert

/**
 * 权限相关
 * xtn
 */
class Permission : AppCompatActivity() {


    fun getPermission(context: Activity){
        val permissionCamera = Manifest.permission.CAMERA
        if (ActivityCompat.checkSelfPermission(context, permissionCamera) !=
                PackageManager.PERMISSION_GRANTED) {
            Permission().getPermission(context, permissionCamera)
        }
    }


    fun getPermission(context: Activity, permissionWhat : String){
        val permissions = arrayOf(permissionWhat)
        if (ActivityCompat.shouldShowRequestPermissionRationale(context, permissionWhat)){
            alert("请求相机权限") {
                yesButton {
                    ActivityCompat.requestPermissions(context, permissions, 1)
                }
                noButton {}
            }.show()
        }else{
            ActivityCompat.requestPermissions(context, permissions, 1)
        }
    }
}
