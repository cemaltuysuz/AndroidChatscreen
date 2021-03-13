package com.example.messenger.models;

public class toplistmodel {

    int position;
    String categoryName;
    Boolean Select;

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Boolean getSelect() {
        return Select;
    }

    public void setSelect(Boolean select) {
        Select = select;
    }

    public toplistmodel() {
    }

    public toplistmodel(int position, String categoryName, Boolean select) {
        this.position = position;
        this.categoryName = categoryName;
        Select = select;
    }
}
