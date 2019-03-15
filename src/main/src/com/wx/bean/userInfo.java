package com.wx.bean;

public class userInfo {
    //    用户昵称
    private String nickName;
    //    用户会话密钥
    private String sessionKey;
    //    小程序Id
    private String appId;
    //    用户登录小程序的唯一标识
    private String openId;
    //    用户头像图片的 URL
    private String avatarUrl;
    //    用户性别0未知，1男性，2女性
    private int gender;
    //    用户所在国家
    private String country;
    //    用户所在省份
    private String province;
    //    用户所在城市
    private String city;
    //    显示语言，en英文，zh_CN简体中文，zh_TW繁体中文
    private String language;

    public userInfo() {
    }

    public userInfo(String nickName, String sessionKey, String appId, String openId, String avatarUrl, int gender, String country, String province, String city, String language) {
        this.nickName = nickName;
        this.sessionKey = sessionKey;
        this.appId = appId;
        this.openId = openId;
        this.avatarUrl = avatarUrl;
        this.gender = gender;
        this.country = country;
        this.province = province;
        this.city = city;
        this.language = language;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getSessionKey() {
        return sessionKey;
    }

    public void setSessionKey(String sessionKey) {
        this.sessionKey = sessionKey;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
