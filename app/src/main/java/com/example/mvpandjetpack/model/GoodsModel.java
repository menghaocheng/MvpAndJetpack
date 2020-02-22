package com.example.mvpandjetpack.model;

import com.example.mvpandjetpack.R;
import com.example.mvpandjetpack.bean.Goods;
import java.util.ArrayList;
import java.util.List;

public class GoodsModel implements IGoodsModel{
    @Override
    public void loadGoodsData(OnloadListener onloadListner) {
        //在这里把数据交到presenter层
        onloadListner.onComplete(getData());
    }

    private List<Goods> getData(){
        ArrayList<Goods> data = new ArrayList<>();
        data.add(new Goods(R.drawable.s1, "一星", "****"));
        data.add(new Goods(R.drawable.s2, "一星", "****" ));
        data.add(new Goods(R.drawable.s3, "一星", "****" ));
        data.add(new Goods(R.drawable.s4, "一星", "****" ));
        data.add(new Goods(R.drawable.s5, "一星", "****" ));
        return data;
    }
}
