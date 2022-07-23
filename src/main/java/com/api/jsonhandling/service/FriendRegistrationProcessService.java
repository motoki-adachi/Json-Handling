package com.api.jsonhandling.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.api.jsonhandling.bean.FriendBean;
import com.api.jsonhandling.entity.Account;
import com.api.jsonhandling.entity.Friend;

@Service
public class FriendRegistrationProcessService {

    public List<Friend> friendRegistrationProcess(List<FriendBean> friendBeanList, Account account) {

	List<Friend> friendList = new ArrayList<Friend>();

	for (int i = 0; i < friendBeanList.size(); i++) {

	    Friend friend = new Friend(friendBeanList.get(i), account);
	    friendList.add(friend);
	}

	return friendList;
    }

}
