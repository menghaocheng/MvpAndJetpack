package com.example.mvpandjetpack.model;


import com.example.mvpandjetpack.bean.Goods;

import java.util.List;

/**
 * model层接口
 */
public interface IGoodsModel {
    void loadGoodsData(OnloadListener onloadListner);
    interface OnloadListener{
        void onComplete(List<Goods> goods);
    }
}
