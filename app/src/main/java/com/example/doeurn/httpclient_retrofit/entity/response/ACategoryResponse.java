package com.example.doeurn.httpclient_retrofit.entity.response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Doeurn on 11/29/17.
 */

public class ACategoryResponse  {


    @SerializedName("code")
    public String code;
    @SerializedName("status")
    public boolean status;
    @SerializedName("msg")
    public String msg;
    @SerializedName("data")
    public Data data;

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

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public static class Keywords {
        @SerializedName("id")
        public int id;
        @SerializedName("status")
        public boolean status;
        @SerializedName("keyword_name")
        public String keyword_name;
        @SerializedName("cate_id")
        public String cate_id;

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

        public String getKeyword_name() {
            return keyword_name;
        }

        public void setKeyword_name(String keyword_name) {
            this.keyword_name = keyword_name;
        }

        public String getCate_id() {
            return cate_id;
        }

        public void setCate_id(String cate_id) {
            this.cate_id = cate_id;
        }
    }

    public static class Data {
        @SerializedName("id")
        public int id;
        @SerializedName("status")
        public boolean status;
        @SerializedName("keywords")
        public List<Keywords> keywords;
        @SerializedName("cate_name")
        public String cate_name;
        @SerializedName("des")
        public String des;
        @SerializedName("icon_name")
        public String icon_name;
        @SerializedName("main_cate")
        public String main_cate;

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

        public List<Keywords> getKeywords() {
            return keywords;
        }

        public void setKeywords(List<Keywords> keywords) {
            this.keywords = keywords;
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

        public String getMain_cate() {
            return main_cate;
        }

        public void setMain_cate(String main_cate) {
            this.main_cate = main_cate;
        }
    }
}
