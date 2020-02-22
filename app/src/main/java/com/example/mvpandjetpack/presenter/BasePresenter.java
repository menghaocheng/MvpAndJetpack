package com.example.mvpandjetpack.presenter;

import android.util.Log;

import com.example.mvpandjetpack.view.IBaseView;
import java.lang.ref.WeakReference;

import androidx.annotation.CallSuper;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;

public class BasePresenter<T extends IBaseView> implements LifecycleObserver {
    private static final String TAG = "BasePresenter";
    //IGoodsView iGoodsView;
    WeakReference<T> iGoodsView;

    /**
     * 绑定
     */
    public void attachView(T view){
        iGoodsView = new WeakReference<>(view);
    }

    /**
     * 解绑
     */
    public void detachView() {
        if(iGoodsView!=null){
            iGoodsView.clear();
            iGoodsView = null;
        }
    }

    /**
     * 监听onCreate()
     */
    @CallSuper
    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    void onCreate(LifecycleOwner owner){
        //在子类中实现
        Log.i(TAG, "create");
     }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    void onStart(LifecycleOwner owner){
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    void onStop(LifecycleOwner owner){
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    void onResume(LifecycleOwner owner){
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    void onPause(LifecycleOwner owner){
    }

    @CallSuper
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    void onDestroy(LifecycleOwner owner){
        Log.i(TAG, "destroy");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_ANY)
    void onAny(LifecycleOwner owner){
    }




}
