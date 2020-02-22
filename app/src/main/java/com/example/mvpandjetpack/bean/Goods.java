package com.example.mvpandjetpack.bean;


/**
 * 实体
 */
public class Goods {
    private static final String TAG = "Goods";


    public int icon;
    public String like;
    public String style;

    public Goods() {

    }

    public Goods(int icon, String like, String style) {
        super();
        this.icon = icon;
        this.like = like;
        this.style = style;
    }
}
