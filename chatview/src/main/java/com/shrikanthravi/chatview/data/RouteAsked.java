package com.shrikanthravi.chatview.data;

import android.view.View;

import java.util.List;

public class RouteAsked {
    private String route_id;
    private String type_route;
    private String short_name_route;
    private String long_name_route;
    private String color;
    private List<TimesRoute> times;
    private View.OnClickListener onClickListener;

    public String getRoute_id() {
        return route_id;
    }

    public void setRoute_id(String route_id) {
        this.route_id = route_id;
    }

    public String getType_route() {
        return type_route;
    }

    public void setType_route(String type_route) {
        this.type_route = type_route;
    }

    public String getShort_name_route() {
        return short_name_route;
    }

    public void setShort_name_route(String short_name_route) {
        this.short_name_route = short_name_route;
    }

    public String getLong_name_route() {
        return long_name_route;
    }

    public void setLong_name_route(String long_name_route) {
        this.long_name_route = long_name_route;
    }

    public List<TimesRoute> getTimes() {
        return times;
    }

    public void setTimes(List<TimesRoute> times) {
        this.times = times;
    }

    public View.OnClickListener getOnClickListener() {
        return onClickListener;
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
