package com.mballem.json.domain;

import java.io.Serializable;
import java.util.List;

/**
 * Created by http://www.mballem.com/ on 09/02/2016.
 */
public class User implements Serializable {

    private Integer id;

    private String name;

    private String email;

    private List<Phone> phones;

    public User() {
        super();
    }

    public User(Integer id, String name, String email, List<Phone> phones) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phones = phones;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Phone> getPhones() {
        return phones;
    }

    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phones=" + phones +
                '}';
    }
}
