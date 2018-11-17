package com.example.corentinrobert.fifaproperso

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.View
import org.jetbrains.anko.AnkoLogger

import com.example.corentinrobert.fifaproperso.matchFragment
import kotlinx.android.synthetic.main.fragment_match.view.*

class CustomView: AnkoLogger,View {
    companion object {
        val DELTA = 10
        lateinit var mCircle: MagicBaloon
    }
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs) {init()}
    constructor(context: Context) : this(context, null)

    private var mPaint = Paint()
    private fun init() {
        mPaint.setStyle(Paint.Style.FILL_AND_STROKE);
        mPaint.color = Color.argb(85,0,0,255)
    }



    override fun onLayout(changed: Boolean, left: Int, top: Int, right: Int, bot: Int)
    {
        super.onLayout(changed, left, top, right, bot)
        mCircle = MagicBaloon(width.toFloat(), height.toFloat())

    }

    @SuppressLint("ClickableViewAccessibility")

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        mCircle.delta = DELTA
        mCircle.move()
        canvas?.drawCircle(mCircle.cx, mCircle.cy, mCircle.rad, mPaint)
        mCircle.comptB
        mCircle.comptH
        invalidate()
    }
    override fun onTouchEvent(event: MotionEvent?) :Boolean{
        if (event != null && event.action == MotionEvent.ACTION_DOWN) {
            mCircle.cx=event.x.toFloat()
            mCircle.cy=event.y.toFloat()

        }
        return true
    }

}