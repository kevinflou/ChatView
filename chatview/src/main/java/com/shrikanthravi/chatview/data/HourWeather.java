package com.shrikanthravi.chatview.data;

import android.view.View;

public class HourWeather {
    private String TMP2m;
    private String icon;
    private String hour;
    private View.OnClickListener clickListener;

    public String getTMP2m() {
        return TMP2m + "°";
    }

    public void setTMP2m(String TMP2m) {
        this.TMP2m = TMP2m;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public View.OnClickListener getClickListener() {
        return clickListener;
    }

    public void setClickListener(View.OnClickListener clickListener) {
        this.clickListener = clickListener;
    }
}
