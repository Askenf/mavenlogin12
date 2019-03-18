package com.wx.bean;

public class goodsInfo {
    private int goodsId;
    private String goodsName;
    private int goodsType;

    public int getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(int goodsType) {
        this.goodsType = goodsType;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    private String goodsTitle;

    private double goodsPrice;

    private double goodsFreight;

    private int goodsSKU;

    private int goodsSellNum;

    private String content;

    private String goodsImg;

    private String goodsImg2;
    //说明
    private String goodsMsg;
    //注意事项
    private String goodsNote;
    //状态码
    private int code;
    //信息
    private String msg;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public goodsInfo(int goodsId, String goodsName, int goodsType, String goodsTitle, double goodsPrice, double goodsFreight, int goodsSKU, int goodsSellNum, String content, String goodsImg, String goodsImg2, String goodsMsg, String goodsNote) {
        this.goodsId = goodsId;
        this.goodsName = goodsName;
        this.goodsType = goodsType;
        this.goodsTitle = goodsTitle;
        this.goodsPrice = goodsPrice;
        this.goodsFreight = goodsFreight;
        this.goodsSKU = goodsSKU;
        this.goodsSellNum = goodsSellNum;
        this.content = content;
        this.goodsImg = goodsImg;
        this.goodsImg2 = goodsImg2;
        this.goodsMsg = goodsMsg;
        this.goodsNote = goodsNote;
    }

    public String getGoodsImg2() {
        return goodsImg2;
    }

    public void setGoodsImg2(String goodsImg2) {
        this.goodsImg2 = goodsImg2;
    }

    public String getGoodsMsg() {
        return goodsMsg;
    }

    public void setGoodsMsg(String goodsMsg) {
        this.goodsMsg = goodsMsg;
    }

    public String getGoodsNote() {
        return goodsNote;
    }

    public void setGoodsNote(String goodsNote) {
        this.goodsNote = goodsNote;
    }

    public goodsInfo() {
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
