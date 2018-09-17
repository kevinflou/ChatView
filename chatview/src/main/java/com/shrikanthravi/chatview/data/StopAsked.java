package com.shrikanthravi.chatview.data;

import android.view.View;

import java.util.List;

public class StopAsked {
    private String stop_id;
    private String name_arret;
    private String distance;
    private int handicap;
    private List<LigneDeservie> list_lignes;
    private View.OnClickListener onClickListener;

    public String getStop_id() {
        return stop_id;
    }

    public void setStop_id(String stop_id) {
        this.stop_id = stop_id;
    }

    public String getName_arret() {
        return name_arret;
    }

    public void setName_arret(String name_arret) {
        this.name_arret = name_arret;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public int getHandicap() {
        return handicap;
    }

    public void setHandicap(int handicap) {
        this.handicap = handicap;
    }

    public List<LigneDeservie> getList_lignes() {
        return list_lignes;
    }

    public void setList_lignes(List<LigneDeservie> list_lignes) {
        this.list_lignes = list_lignes;
    }

    public View.OnClickListener getOnClickListener() {
        return onClickListener;
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }
}
