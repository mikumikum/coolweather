package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 由于JSON字段不太适合直接作为Java字段命名
 * 所以这里使用了@SerializedName注解的方式让JSON和Java字段建立映射关系
 * Created by Ding on 2019/3/12.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {

        @SerializedName("loc")
        public String updateTime;

    }

}