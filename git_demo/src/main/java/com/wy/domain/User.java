package com.wy.domain;

/**
 * Created by Wy on 2019/1/4
 */
public class User {
    private Integer id;
    private String name;
    private Integer age;
    private String aa;
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

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
