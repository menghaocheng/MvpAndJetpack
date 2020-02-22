package com.example.mvpandjetpack.presenter;

import android.util.Log;
import com.example.mvpandjetpack.bean.Goods;
import com.example.mvpandjetpack.model.GoodsModel;
import com.example.mvpandjetpack.model.IGoodsModel;
import com.example.mvpandjetpack.view.IGoodsView;

import java.util.List;

import androidx.lifecycle.LifecycleOwner;

public class GoodsPresenter<T extends IGoodsView> extends BasePresenter{
    private static final String TAG = "GoodsPresenter";
    IGoodsModel iGoodsModel = new GoodsModel();

    /**
     * 执行业务逻辑
     */
    public void fetch() {
        if(iGoodsView.get() != null && iGoodsModel != null){
            iGoodsModel.loadGoodsData(new IGoodsModel.OnloadListener() {
                @Override
                public void onComplete(List<Goods> goods) {
                    //goods已经得到了数据源来的数据了
                    //把数据交给view层
                    ((IGoodsView)iGoodsView.get()).showGoodsView(goods);
                }
            });
        }
    }

    @Override
    void onCreate(LifecycleOwner owner) {
        super.onCreate(owner);
        Log.i(TAG, "create");
    }

    @Override
    void onDestroy(LifecycleOwner owner) {
        super.onDestroy(owner);
        Log.i(TAG, "destroy");
    }
}
