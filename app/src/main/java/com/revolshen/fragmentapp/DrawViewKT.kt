package com.revolshen.fragmentapp

import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.View

class DrawViewKT @JvmOverloads constructor(context: Context, attributeSet: AttributeSet? = null): View(context, attributeSet) {

    companion object {
        var circles = ArrayList<Circle>()
    }

    private var paint = Paint()
    private lateinit var circle: Circle

    override fun onTouchEvent(event: MotionEvent?): Boolean {

        if (event != null) {
            val originPointF = PointF(event.x, event.y)
            when(event.action){
                MotionEvent.ACTION_DOWN -> {
                    circle = Circle()
                    circles.add(circle)
                    circle.originPoint = originPointF
                 //Log.e("Cords", "Origin cords X and Y: ${circle.originPoint.x} and ${circle.originPoint.y}" )
                }
                MotionEvent.ACTION_UP -> {
                    val currentPointF = PointF(event.x, event.y)
                    circle.currentPoint = currentPointF
                    //Log.e("Cords", "Current cords X and Y: ${circle.currentPoint.x} and ${circle.currentPoint.y}" )
                    invalidate()
                }
            }
        }

        return true
    }

    override fun onDraw(canvas: Canvas?) {
        for(circle in circles){
            val radius = Math.sqrt(Math.pow(circle.originPoint.x - circle.currentPoint.x.toDouble(), 2.0) + Math.pow(circle.originPoint.y - circle.currentPoint.y.toDouble(), 2.0))
            canvas?.drawCircle(circle.originPoint.x, circle.originPoint.y, radius.toFloat(), paint)
       }
        super.onDraw(canvas)
    }
}
