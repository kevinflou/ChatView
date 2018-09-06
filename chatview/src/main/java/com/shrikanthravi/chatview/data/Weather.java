package com.shrikanthravi.chatview.data;

import android.view.View;

import java.util.List;

public class Weather {
    private String City;
    private String current_temp;
    private String current_icon;
    private String current_condition;
    private String tmax;
    private String tmin;
    private List<HourWeather> list_weather_by_hour;
    private View.OnClickListener onClickListener;

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getCurrent_temp() {
        return current_temp + "°";
    }

    public void setCurrent_temp(String current_temp) {
        this.current_temp = current_temp;
    }

    public String getCurrent_icon() {
        return current_icon;
    }

    public void setCurrent_icon(String current_icon) {
        this.current_icon = current_icon;
    }

    public String getCurrent_condition() {
        return current_condition;
    }

    public void setCurrent_condition(String current_condition) {
        this.current_condition = current_condition;
    }

    public String getTmax() {
        return tmax + "°";
    }

    public void setTmax(String tmax) {
        this.tmax = tmax;
    }

    public String getTmin() {
        return tmin +"°";
    }

    public void setTmin(String tmin) {
        this.tmin = tmin;
    }

    public List<HourWeather> getList_weather_by_hour() {
        return list_weather_by_hour;
    }

    public void setList_weather_by_hour(List<HourWeather> list_weather_by_hour) {
        this.list_weather_by_hour = list_weather_by_hour;
    }

    public View.OnClickListener getOnClickListener() {
        return onClickListener;
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }
}
