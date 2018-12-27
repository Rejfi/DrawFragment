package com.revolshen.fragmentapp

import android.app.Activity
import android.app.admin.DeviceAdminInfo
import android.bluetooth.BluetoothClass
import android.content.Intent
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.preference.PreferenceScreen
import android.provider.MediaStore
import android.util.AttributeSet
import android.util.Log
import android.view.DragAndDropPermissions
import android.view.MotionEvent
import android.view.VelocityTracker
import android.view.View
import android.widget.Toast
import com.revolshen.fragmentapp.R.layout.activity_main
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_first.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun clearView(v: View){
        DrawViewKT.circles.clear()
    }

}




