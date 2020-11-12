package com.example.kiemtralist;

public class sodienthoai {
    String text;
    Integer img;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getImg() {
        return img;
    }

    public void setImg(Integer img) {
        this.img = img;
    }

    public sodienthoai(String text, Integer img) {
        this.text = text;
        this.img = img;
    }
}
