package com.example.mvpandjetpack.view;

import com.example.mvpandjetpack.bean.Goods;

import java.util.List;

/**
 * UI逻辑定义在这里
 */
public interface IGoodsView extends IBaseView{
    //显示图片与文字
    void showGoodsView(List<Goods> goods);
    //加载进度条
    //获取音视频流……
}
