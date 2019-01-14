package com.shrikanthravi.chatview.data;

import android.support.annotation.NonNull;

import java.io.Serializable;

/**
 * Created by kevin on 28/06/2018.
 */

public class SqlRoute implements Comparable<SqlRoute>,Serializable{
    private int id;
    private String route_id;
    private int city_id;
    private String agency_id;
    private String short_name;
    private String long_name;
    private String description;
    private int type;
    private String url;
    private String color;
    private String text_color;
    private int favorited;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRoute_id() {
        return route_id;
    }

    public void setRoute_id(String route_id) {
        this.route_id = route_id;
    }

    public int getCity_id() {
        return city_id;
    }

    public void setCity_id(int city_id) {
        this.city_id = city_id;
    }

    public String getAgency_id() {
        return agency_id;
    }

    public void setAgency_id(String agency_id) {
        this.agency_id = agency_id;
    }

    public String getShort_name() {
        return short_name;
    }

    public void setShort_name(String short_name) {
        this.short_name = short_name;
    }

    public String getLong_name() {
        return long_name;
    }

    public void setLong_name(String long_name) {
        this.long_name = long_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getText_color() {
        return text_color;
    }

    public void setText_color(String text_color) {
        this.text_color = text_color;
    }

    public int getFavorited() {
        return favorited;
    }

    public void setFavorited(int favorited) {
        this.favorited = favorited;
    }

    public int compareTo(@NonNull SqlRoute o) {
        return Integer.valueOf(getRoute_id()).compareTo(Integer.valueOf(o.getRoute_id()));
    }
}
