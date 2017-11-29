package com.example.doeurn.httpclient_retrofit.entity.response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Doeurn on 11/29/17.
 */

public class CategoryForm {

    @SerializedName("cate_name")
    public String cate_name;
    @SerializedName("des")
    public String des;
    @SerializedName("icon_name")
    public String icon_name;
    @SerializedName("id")
    public int id;
    @SerializedName("keywords")
    public List<ACategoryResponse.Keywords> keywords;
    @SerializedName("status")
    public boolean status;


    public String getCate_name() {
        return cate_name;
    }

    public void setCate_name(String cate_name) {
        this.cate_name = cate_name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getIcon_name() {
        return icon_name;
    }

    public void setIcon_name(String icon_name) {
        this.icon_name = icon_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<ACategoryResponse.Keywords> getKeywords() {
        return keywords;
    }

    public void setKeywords(List<ACategoryResponse.Keywords> keywords) {
        this.keywords = keywords;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
