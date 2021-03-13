package com.example.messenger.models;

public class midlistmodel {

    int position;
    int imgResourceID;
    String username;
    String msgTime;
    String message;
    String msgNum;
    Boolean isActive;

    public midlistmodel() {
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getImgResourceID() {
        return imgResourceID;
    }

    public void setImgResourceID(int imgResourceID) {
        this.imgResourceID = imgResourceID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMsgTime() {
        return msgTime;
    }

    public void setMsgTime(String msgTime) {
        this.msgTime = msgTime;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMsgNum() {
        return msgNum;
    }

    public void setMsgNum(String msgNum) {
        this.msgNum = msgNum;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public midlistmodel(int position, int imgResourceID, String username, String msgTime, String message, String msgNum, Boolean isActive) {
        this.position = position;
        this.imgResourceID = imgResourceID;
        this.username = username;
        this.msgTime = msgTime;
        this.message = message;
        this.msgNum = msgNum;
        this.isActive = isActive;
    }
}
