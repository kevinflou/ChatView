package com.shrikanthravi.chatview.data;

import android.view.View;

import java.util.List;

public class StopAsked {
    private String stop_id;
    private String distance;
    private String handicap;
    private List<LigneDeservie> list_lignes;
    private View.OnClickListener onClickListener;

    public String getStop_id() {
        return stop_id;
    }

    public void setStop_id(String stop_id) {
        this.stop_id = stop_id;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getHandicap() {
        return handicap;
    }

    public void setHandicap(String handicap) {
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
