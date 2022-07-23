package com.api.jsonhandling.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.jsonhandling.bean.AccountBean;
import com.api.jsonhandling.entity.Account;
import com.api.jsonhandling.entity.Friend;
import com.api.jsonhandling.entity.Tag;
import com.api.jsonhandling.repository.AccountRepository;

@Service
public class AccountRegistrationProcessService {

    @Autowired
    private TagRegistrationProcessService tagRegistrationProcessService;
    @Autowired
    private FriendRegistrationProcessService friendRegistrationProcessService;
    @Autowired
    private AccountRepository accountRepository;

    public boolean accountRegistration(List<AccountBean> accountBeanList) {

	List<Account> accountList = new ArrayList<Account>();

	for (AccountBean accountBean : accountBeanList) {

	    // entityの生成
	    Account account = new Account(accountBean);
	    // 登録するタグリストの処理
	    List<Tag> tagList = tagRegistrationProcessService.tagRegistrationProcess(accountBean.getTags(), account);
	    account.setTags(tagList);
	    // 登録するフレンドリストの処理
	    List<Friend> friendList = friendRegistrationProcessService
		    .friendRegistrationProcess(accountBean.getFriends(), account);
	    account.setFriends(friendList);
	    // アカウントリストへの格納
	    accountList.add(account);
	}

	accountRepository.saveAll(accountList);
	return true;
    }

}
