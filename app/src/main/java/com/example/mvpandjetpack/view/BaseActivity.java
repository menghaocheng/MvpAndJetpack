package com.example.mvpandjetpack.view;

import android.os.Bundle;
import com.example.mvpandjetpack.presenter.BasePresenter;
import androidx.appcompat.app.AppCompatActivity;

public abstract class BaseActivity<T extends BasePresenter, V extends IBaseView> extends AppCompatActivity {
    //持有表示层
    protected T presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        presenter = creatPresenter();
        presenter.attachView((V)this);
        registSDK();
        unregistSDK();
        init();
    }

    protected abstract void init();

    protected abstract void registSDK();

    protected abstract void unregistSDK();

    protected abstract T creatPresenter();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.detachView();
        unregistSDK();
    }
}
