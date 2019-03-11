package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * 继承LitePal包里的DataSupport类
 * 用于创建数据库表
 * 此类是存放天气的县级表
 * Created by Ding on 2019/3/11.
 */

public class County extends DataSupport {

    private int id;
    //记录县的名字
    private String countyName;
    //记录县所对应的天气
    private String weatherId;
    //记录当前县所属的id值
    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

}