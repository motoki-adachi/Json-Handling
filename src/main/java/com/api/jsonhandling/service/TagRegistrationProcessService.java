package com.api.jsonhandling.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.api.jsonhandling.entity.Account;
import com.api.jsonhandling.entity.Tag;

@Service
public class TagRegistrationProcessService {

    public List<Tag> tagRegistrationProcess(List<String> tagBeanList, Account account) {

	List<Tag> tagList = new ArrayList<Tag>();

	for (int i = 0; i < tagBeanList.size(); i++) {

	    Tag tag = new Tag(tagBeanList.get(i), account);
	    tagList.add(tag);
	}

	return tagList;
    }

}
