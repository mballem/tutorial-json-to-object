package com.mballem.json.domain;

import java.io.Serializable;

/**
 * Created by http://www.mballem.com/ on 09/02/2016.
 */
public class Phone implements Serializable {

    private Integer id;

    private PhoneType type;

    private String number;

    public Phone() {
        super();
    }

    public Phone(Integer id, PhoneType type, String number) {
        this.id = id;
        this.type = type;
        this.number = number;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public PhoneType getType() {
        return type;
    }

    public void setType(PhoneType type) {
        this.type = type;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public enum PhoneType {
        MOBILE, OFFICE, HOME
    }

    @Override
    public String toString() {
        return "Phone{" +
                "id=" + id +
                ", type=" + type +
                ", number='" + number + '\'' +
                '}';
    }
}
