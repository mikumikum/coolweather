package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * 继承LitePal包里的DataSupport类
 * 用于创建数据库表
 * 此类是存放天气的市级表
 * Created by Ding on 2019/3/11.
 */

public class City extends DataSupport {
    private int id;
    //记录市名称
    private String cityName;
    //记录市代号
    private int cityCode;
    //记录当前市所属的id值
    private int provinceId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
