package com.example.doeurn.httpclient_retrofit.entity.response;

import com.example.doeurn.httpclient_retrofit.entity.Category;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Doeurn on 11/29/17.
 */

public class CategoryResponse {


    @SerializedName("code")
    public String code;
    @SerializedName("status")
    public boolean status;
    @SerializedName("msg")
    public String msg;
    @SerializedName("data")
    public List<Category> categories;


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }
}
