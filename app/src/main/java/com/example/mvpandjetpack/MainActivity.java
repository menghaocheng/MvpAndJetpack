package com.example.mvpandjetpack;


import android.os.Bundle;
import android.widget.ListView;

import com.example.mvpandjetpack.adapter.GoodsAdapter;
import com.example.mvpandjetpack.bean.Goods;
import com.example.mvpandjetpack.presenter.GoodsPresenter;
import com.example.mvpandjetpack.view.BaseActivity;
import com.example.mvpandjetpack.view.IGoodsView;

import java.util.List;


public class MainActivity extends BaseActivity<GoodsPresenter<IGoodsView>, IGoodsView> implements IGoodsView {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listview);
        presenter.fetch();
    }

    /**
     * 选择对应的表示层
     * @return
     */
    @Override
    protected GoodsPresenter<IGoodsView> creatPresenter() {
        return new GoodsPresenter<>();
    }

    @Override
    public void showGoodsView(List<Goods> goods) {
        //goods这里已经有数据
        listView.setAdapter(new GoodsAdapter(this, goods));
    }

    @Override
    protected void init() {
        //完成一个订阅关系
        //就是说明一下，哪个类可以监听我的生命周期
        getLifecycle().addObserver(presenter);
    }

    @Override
    protected void registSDK() {

    }

    @Override
    protected void unregistSDK() {

    }

    @Override
    public void showErrorMessage(String msg) {

    }

}
