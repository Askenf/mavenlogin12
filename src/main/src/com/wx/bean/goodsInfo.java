package com.wx.bean;

public class goodsInfo {
    private int goodsId;

    private String goodsTitle;

    private double goodsPrice;

    private double goodsFreight;

    private int goodsSKU;

    private int goodsSellNum;

    private String content;

    private String goodsImg;

    public goodsInfo() {
    }

    public goodsInfo(int goodsId, String goodsTitle, double goodsPrice, double goodsFreight, int goodsSKU, int goodsSellNum, String content, String goodsImg) {
        this.goodsId = goodsId;
        this.goodsTitle = goodsTitle;
        this.goodsPrice = goodsPrice;
        this.goodsFreight = goodsFreight;
        this.goodsSKU = goodsSKU;
        this.goodsSellNum = goodsSellNum;
        this.content = content;
        this.goodsImg = goodsImg;
    }

    public String getGoodsTitle() {
        return goodsTitle;
    }

    public int getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(int goodsId) {
        this.goodsId = goodsId;
    }

    public void setGoodsTitle(String goodsTitle) {
        this.goodsTitle = goodsTitle;
    }

    public double getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(double goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public double getGoodsFreight() {
        return goodsFreight;
    }

    public void setGoodsFreight(double goodsFreight) {
        this.goodsFreight = goodsFreight;
    }

    public int getGoodsSKU() {
        return goodsSKU;
    }

    public void setGoodsSKU(int goodsSKU) {
        this.goodsSKU = goodsSKU;
    }

    public int getGoodsSellNum() {
        return goodsSellNum;
    }

    public void setGoodsSellNum(int goodsSellNum) {
        this.goodsSellNum = goodsSellNum;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getGoodsImg() {
        return goodsImg;
    }

    public void setGoodsImg(String goodsImg) {
        this.goodsImg = goodsImg;
    }
}
