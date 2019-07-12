package com.sup.itg.itglearntouch.touch;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

public class TouchView extends View {

    public TouchView(Context context) {
        super(context);
    }

    public TouchView(Context context, @androidx.annotation.Nullable AttributeSet attrs) {
        super(context, attrs);
    }


    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        String action = "";
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                action = "ACTION_DOWN";
                Log.e("dispatch  : ", " TouchView down: " + event.getX() + " " + event.getY());
                break;
            case MotionEvent.ACTION_MOVE:
                Log.e("dispatch  : ", "TouchView move: " + event.getX() + " " + event.getY());
                action = "ACTION_MOVE";
                break;
            case MotionEvent.ACTION_UP:
                action = "ACTION_UP";
                Log.e("dispatch  : ", "TouchView up: " + event.getX() + " " + event.getY());
                break;
        }
        boolean r = super.dispatchTouchEvent(event);
        Log.e("dispatch : ", "TouchView " + action + " " + r);
        return r;
    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        String action = "";
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                action = "ACTION_DOWN";
                Log.e("onTouchEvent", "TouchView down: " + event.getX() + " " + event.getY());
                break;
            case MotionEvent.ACTION_MOVE:
                action = "ACTION_MOVE";
                Log.e("onTouchEvent", "TouchView move: " + event.getX() + " " + event.getY());
                break;
            case MotionEvent.ACTION_UP:
                action = "ACTION_UP";
                Log.e("onTouchEvent", "TouchView up: " + event.getX() + " " + event.getY());
                break;
        }
        boolean r = super.onTouchEvent(event);
        r = true;
        Log.e("onTouchEvent : ", "TouchView " + action + " " + r);
        return r;
    }
}
