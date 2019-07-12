package com.sup.itg.itglearntouch.touch;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;

public class TouchLinearLayout extends LinearLayout {
    public TouchLinearLayout(Context context) {
        super(context);
    }

    public TouchLinearLayout(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        String action = "";

        switch (ev.getAction()) {
            case MotionEvent.ACTION_DOWN:
                action = "ACTION_DOWN";
                Log.e("dispatch  : ", " TouchLinearLayout down: " + ev.getX() + " " + ev.getY());
                break;
            case MotionEvent.ACTION_MOVE:
                Log.e("dispatch  : ", "TouchLinearLayout move: " + ev.getX() + " " + ev.getY());
                action = "ACTION_MOVE";
                break;
            case MotionEvent.ACTION_UP:
                action = "ACTION_UP";
                Log.e("dispatch  : ", "TouchLinearLayout up: " + ev.getX() + " " + ev.getY());
                break;
        }
        boolean r = super.dispatchTouchEvent(ev);
        Log.e("dispatch : ", "TouchLinearLayout " + action + " " + r);
        return r;
    }


    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        String action = "";

        switch (ev.getAction()) {
            case MotionEvent.ACTION_DOWN:
                action = "ACTION_DOWN";
                Log.e("onInterceptTouchEvent", "TouchLinearLayout down: " + ev.getX() + " " + ev.getY());
                break;
            case MotionEvent.ACTION_MOVE:
                action = "ACTION_MOVE";
                Log.e("onInterceptTouchEvent", "TouchLinearLayout move: " + ev.getX() + " " + ev.getY());
                break;
            case MotionEvent.ACTION_UP:
                action = "ACTION_UP";
                Log.e("onInterceptTouchEvent", "TouchLinearLayout up: " + ev.getX() + " " + ev.getY());
                break;
        }
        boolean r = super.onInterceptTouchEvent(ev);
        Log.e("onInterceptTouchEvent", "TouchLinearLayout " + action + " " + r);
        return r;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        String action = "";
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                action = "ACTION_DOWN";
                Log.e("onTouchEvent", "TouchLinearLayout down: " + event.getX() + " " + event.getY());
                break;
            case MotionEvent.ACTION_MOVE:
                Log.e("onTouchEvent", "TouchLinearLayout move: " + event.getX() + " " + event.getY());
                action = "ACTION_MOVE";
                break;
            case MotionEvent.ACTION_UP:
                action = "ACTION_UP";
                Log.e("onTouchEvent", "TouchLinearLayout up: " + event.getX() + " " + event.getY());
                break;
        }
        boolean r = super.onTouchEvent(event);
        Log.e("onTouchEvent : ", "TouchLinearLayout " + action + " " + r);
        return r;
    }
}
