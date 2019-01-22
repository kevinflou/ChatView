package com.shrikanthravi.chatview.data;


import android.net.Uri;
import android.view.View;

import java.util.List;

/**
 * Created by shrikanthravi on 16/02/18.
 */


public class Message {


    protected String LeftSimpleMessage = "LEFT";
    protected String RightSimpleMessage = "RIGHT";
    protected String LeftSingleImage = "LeftImage";
    protected String RightSingleImage = "RightImage";

    //Can hold upto 11 images.
    protected String LeftMultipleImages = "LeftImages";
    protected String RightMultipleImages = "RightImages";

    //Single Video
    protected String LeftVideo = "LeftVideo";
    protected String RightVideo = "RightVideo";

    protected String LeftAudio = "LeftAudio";
    protected String RightAudio = "RightAudio";

    protected long id;
    protected MessageType messageType;
    protected String type;
    protected String body;
    protected String time;
    protected String status;
    protected List<Uri> imageList;
    protected String userName;
    protected Uri userIcon;
    protected Uri videoUri;
    protected Uri audioUri;
    protected int indexPosition;
    protected List<CarouselCell> list_carousel;
    protected Weather weather;
    protected List<StopAsked> stopAsked;
    protected List<POIAsked> listpoiAsked;
    protected List<RouteAsked> routeAsked;
    protected Boolean isTuto;
    protected View.OnClickListener tuto1OnClick;
    protected View.OnClickListener tuto2OnClick;
    protected View.OnClickListener tuto3OnClick;
    protected View.OnClickListener tuto4OnClick;

    public enum MessageType{
        LeftSimpleMessage,
        RightSimpleMessage,
        RightSimpleImage,
        LeftSingleImage,
        RightSingleImage,
        LeftMultipleImages,
        RightMultipleImages,
        LeftVideo,
        RightVideo,
        LeftAudio,
        RightAudio,
        LeftCarousel,
        LeftMeteoMessage,
        LeftStopMessage,
        LeftTypingMessage,
        LeftPOIMessage,
        LeftRouteMessage,
        TutoHelp
    }

    public Message(){

    }

    public Uri getAudioUri() {
        return audioUri;
    }

    public void setAudioUri(Uri audioUri) {
        this.audioUri = audioUri;
    }

    public MessageType getMessageType() {
        return messageType;
    }

    public void setMessageType(MessageType messageType) {
        this.messageType = messageType;
    }

    public int getIndexPosition() {
        return indexPosition;
    }

    public void setIndexPosition(int indexPosition) {
        this.indexPosition = indexPosition;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getTime() {
        return "";
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Uri> getImageList() {
        return imageList;
    }

    public void setImageList(List<Uri> imageList) {
        this.imageList = imageList;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Uri getUserIcon() {
        return userIcon;
    }

    public void setUserIcon(Uri userIcon) {
        this.userIcon = userIcon;
    }

    public Uri getVideoUri() {
        return videoUri;
    }

    public void setVideoUri(Uri videoUri) {
        this.videoUri = videoUri;
    }

    public List<CarouselCell> getList_carousel() {
        return list_carousel;
    }

    public void setList_carousel(List<CarouselCell> list_carousel) {
        this.list_carousel = list_carousel;
    }

    public Weather getWeather() {
        return weather;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }

    public List<StopAsked> getListStopAsked() { return stopAsked; }

    public void setListStopAsked(List<StopAsked> stopAsked) { this.stopAsked = stopAsked; }

    public List<POIAsked> getListpoiAsked() {
        return listpoiAsked;
    }

    public void setListpoiAsked(List<POIAsked> listpoiAsked) {
        this.listpoiAsked = listpoiAsked;
    }

    public List<RouteAsked> getRouteAsked() {
        return routeAsked;
    }

    public void setRouteAsked(List<RouteAsked> routeAsked) {
        this.routeAsked = routeAsked;
    }

    public View.OnClickListener getTuto1OnClick() {
        return tuto1OnClick;
    }

    public void setTuto1OnClick(View.OnClickListener tuto1OnClick) {
        this.tuto1OnClick = tuto1OnClick;
    }

    public View.OnClickListener getTuto2OnClick() {
        return tuto2OnClick;
    }

    public void setTuto2OnClick(View.OnClickListener tuto2OnClick) {
        this.tuto2OnClick = tuto2OnClick;
    }

    public View.OnClickListener getTuto3OnClick() {
        return tuto3OnClick;
    }

    public void setTuto3OnClick(View.OnClickListener tuto3OnClick) {
        this.tuto3OnClick = tuto3OnClick;
    }

    public View.OnClickListener getTuto4OnClick() {
        return tuto4OnClick;
    }

    public void setTuto4OnClick(View.OnClickListener tuto4OnClick) {
        this.tuto4OnClick = tuto4OnClick;
    }

    public Boolean getTuto() {
        return isTuto;
    }

    public void setTuto(Boolean tuto) {
        isTuto = tuto;
    }
}


