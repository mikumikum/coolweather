package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 由于JSON字段不太适合直接作为Java字段命名
 * 所以这里使用了@SerializedName注解的方式让JSON和Java字段建立映射关系
 * Created by Ding on 2019/3/12.
 */

    public class Forecast {

    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature {
        public String max;

        public String min;
    }

    public class More{
        @SerializedName("txt_d")
        public String info;
    }
}
