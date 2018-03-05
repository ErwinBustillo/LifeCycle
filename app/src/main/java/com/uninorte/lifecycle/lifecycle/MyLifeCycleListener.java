package com.uninorte.lifecycle.lifecycle;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.util.Log;

/**
 * Created by erwin on 3/4/2018.
 */

public class MyLifeCycleListener implements LifecycleObserver {

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void resume() {
        Log.d("ThisIsLife","On Resume");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void pause() {
        Log.d("ThisIsLife","On  Pause");
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void start() {
        Log.d("ThisIsLife","On Start");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void stop() {
        Log.d("ThisIsLife","On Stop");
    }

}
