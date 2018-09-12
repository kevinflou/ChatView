package com.shrikanthravi.chatview.data;

import android.view.View;

public class POIAsked {

    private String name_poi;
    private String category_poi;
    private String rating_poi;
    private String adress_poi;
    private String distance_poi;
    private String id_poi;
    private String nb_avis_poi;
    private String link_photo_poi;
    private View.OnClickListener onClickListener;

    public String getName_poi() {
        return name_poi;
    }

    public void setName_poi(String name_poi) {
        this.name_poi = name_poi;
    }

    public String getCategory_poi() {
        return category_poi;
    }

    public void setCategory_poi(String category_poi) {
        this.category_poi = category_poi;
    }

    public String getRating_poi() {
        return rating_poi;
    }

    public void setRating_poi(String rating_poi) {
        this.rating_poi = rating_poi;
    }

    public String getAdress_poi() {
        return adress_poi;
    }

    public void setAdress_poi(String adress_poi) {
        this.adress_poi = adress_poi;
    }

    public String getDistance_poi() {
        return distance_poi;
    }

    public void setDistance_poi(String distance_poi) {
        this.distance_poi = distance_poi;
    }

    public String getId_poi() {
        return id_poi;
    }

    public void setId_poi(String id_poi) {
        this.id_poi = id_poi;
    }

    public View.OnClickListener getOnClickListener() {
        return onClickListener;
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    public String getNb_avis_poi() {
        return nb_avis_poi;
    }

    public void setNb_avis_poi(String nb_avis_poi) {
        this.nb_avis_poi = nb_avis_poi;
    }

    public String getLink_photo_poi() {
        return link_photo_poi;
    }

    public void setLink_photo_poi(String link_photo_poi) {
        this.link_photo_poi = link_photo_poi;
    }
}
