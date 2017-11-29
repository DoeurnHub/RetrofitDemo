package com.example.doeurn.httpclient_retrofit.entity;

import com.example.doeurn.httpclient_retrofit.entity.response.BaseEntity;
import com.example.doeurn.httpclient_retrofit.entity.response.CategoryResponse;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Doeurn on 11/29/17.
 */

public class Category  extends BaseEntity{

    @SerializedName("id")
    public int id;
    @SerializedName("status")
    public boolean status;
    @SerializedName("cate_name")
    public String cate_name;
    @SerializedName("des")
    public String des;
    @SerializedName("icon_name")
    public String icon_name;
    @SerializedName("sub_cate")
    public List<SubCategory> subCategories;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

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

    public List<SubCategory> getSubCategories() {
        return subCategories;
    }

    public void setSubCategories(List<SubCategory> subCategories) {
        this.subCategories = subCategories;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", status=" + status +
                ", cate_name='" + cate_name + '\'' +
                ", des='" + des + '\'' +
                ", icon_name='" + icon_name + '\'' +
                ", subCategories=" + subCategories +
                '}';
    }
}
