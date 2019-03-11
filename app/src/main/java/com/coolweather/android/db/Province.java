package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * 继承LitePal包里的DataSupport类
 * 用于创建数据库表
 * 此类是存放天气的省级表
 * Created by Ding on 2019/3/11.
 */

public class Province extends DataSupport {
    private int id;
    //记录省名称
    private String provinceName;
    //记录省代号
    private int provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
