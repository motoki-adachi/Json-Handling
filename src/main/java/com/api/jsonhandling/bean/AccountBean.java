package com.api.jsonhandling.bean;

import java.util.List;

import lombok.Data;

@Data
public class AccountBean {

    private String id;
    private int index;
    private String guid;
    private String isActive;
    private String balance;
    private String picture;
    private int age;
    private String eyeColor;
    private String name;
    private String gender;
    private String company;
    private String email;
    private String phone;
    private String address;
    private String about;
    private String registered;
    private double latitude;
    private double longitude;
    private List<String> tags;
    private List<FriendBean> friends;
    private String greeting;
    private String favoriteFruit;
}
