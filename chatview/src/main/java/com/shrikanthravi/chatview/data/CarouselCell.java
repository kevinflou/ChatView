package com.shrikanthravi.chatview.data;

import android.view.View;

public class CarouselCell {
    private String carousel_image;
    private String title_carousel;
    private String subtitle_carousel;
    private String completion_edit_text;
    private View.OnClickListener OnClickListener;

    public String getCarousel_image() {
        return carousel_image;
    }

    public void setCarousel_image(String carousel_image) {
        this.carousel_image = carousel_image;
    }

    public String getTitle_carousel() {
        return title_carousel;
    }

    public void setTitle_carousel(String title_carousel) {
        this.title_carousel = title_carousel;
    }

    public String getSubtitle_carousel() {
        return subtitle_carousel;
    }

    public void setSubtitle_carousel(String subtitle_carousel) {
        this.subtitle_carousel = subtitle_carousel;
    }

    public String getCompletion_edit_text() {
        return completion_edit_text;
    }

    public void setCompletion_edit_text(String completion_edit_text) {
        this.completion_edit_text = completion_edit_text;
    }

    public View.OnClickListener getOnClickListener() {
        return OnClickListener;
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        OnClickListener = onClickListener;
    }
}
