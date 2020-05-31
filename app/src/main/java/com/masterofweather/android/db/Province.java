package com.masterofweather.android.db;

import org.litepal.crud.DataSupport;

public class Province extends DataSupport {
    private int id;
    private String provinceName;
    private int provinceCodeName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCodeName() {
        return provinceCodeName;
    }

    public void setProvinceCodeName(int provinceCodeName) {
        this.provinceCodeName = provinceCodeName;
    }
}
