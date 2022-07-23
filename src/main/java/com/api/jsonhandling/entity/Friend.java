package com.api.jsonhandling.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.api.jsonhandling.bean.FriendBean;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "friend")
@Getter
@Setter
public class Friend {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "data_id")
    private Long dataId;

    @Column(name = "name")
    private String name;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "account_id")
    @JsonIgnore
    private Account account;

    public Friend() {

    }

    public Friend(FriendBean friendBean, Account account) {
	super();
	this.dataId = friendBean.getId();
	this.name = friendBean.getName();
	this.account = account;
    }

}
