package com.api.jsonhandling.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.api.jsonhandling.bean.AccountBean;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "account")
@Getter
@Setter
public class Account {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "data_index")
    private int dataIndex;

    @Column(name = "guid")
    private String guid;

    @Column(name = "is_active")
    private String isActive;

    @Column(name = "balance")
    private String balance;

    @Column(name = "picture")
    private String picture;

    @Column(name = "age")
    private int age;

    @Column(name = "eye_color")
    private String eyeColor;

    @Column(name = "name")
    private String name;

    @Column(name = "gender")
    private String gender;

    @Column(name = "company")
    private String company;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    @Column(name = "address")
    private String address;

    @Column(name = "about")
    private String about;

    @Column(name = "registered")
    private String registered;

    @Column(name = "latitude")
    private double latitude;

    @Column(name = "longitude")
    private double longitude;

    @OneToMany(mappedBy = "account", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private List<Tag> tags = new ArrayList<Tag>();

    @OneToMany(mappedBy = "account", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private List<Friend> friends = new ArrayList<Friend>();

    @Column(name = "greeting")
    private String greeting;

    @Column(name = "favorite_fruit")
    private String favoriteFruit;

    public Account() {

    }

    public Account(AccountBean accountBean) {
	super();
	this.id = accountBean.getId();
	this.dataIndex = accountBean.getIndex();
	this.guid = accountBean.getGuid();
	this.isActive = accountBean.getIsActive();
	this.balance = accountBean.getBalance();
	this.picture = accountBean.getPicture();
	this.age = accountBean.getAge();
	this.eyeColor = accountBean.getEyeColor();
	this.name = accountBean.getName();
	this.gender = accountBean.getGender();
	this.company = accountBean.getCompany();
	this.email = accountBean.getEmail();
	this.phone = accountBean.getPhone();
	this.address = accountBean.getAddress();
	this.about = accountBean.getAbout();
	this.registered = accountBean.getRegistered();
	this.latitude = accountBean.getLatitude();
	this.longitude = accountBean.getLongitude();
	this.greeting = accountBean.getGreeting();
	this.favoriteFruit = accountBean.getFavoriteFruit();
    }
}
