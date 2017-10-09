package com.example.coolweatherxf.db;


import org.litepal.crud.DataSupport;

public class City extends DataSupport {
    private int id;
    private  String cityName;
    private  int cityCode;
    private  int pronviceId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getPronviceId() {
        return pronviceId;
    }

    public void setPronviceId(int pronviceId) {
        this.pronviceId = pronviceId;
    }
}
