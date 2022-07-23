package com.api.jsonhandling.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.api.jsonhandling.bean.AccountBean;
import com.api.jsonhandling.service.AccountJsonHandlingService;
import com.api.jsonhandling.service.AccountRegistrationProcessService;

@Controller
public class JsonHandlingController {

    @Autowired
    private AccountJsonHandlingService accountJsonHandlingService;
    @Autowired
    private AccountRegistrationProcessService accountRegistrationProcessService;

    @GetMapping("/insertAccountJsonData")
    public String insertAccountJsonData(Model theModel) {

	List<AccountBean> accountBeanList = accountJsonHandlingService.accountJsonHandling();
	boolean result = accountRegistrationProcessService.accountRegistration(accountBeanList);

	if (result) {
	    return "index";
	} else {
	    return "error";
	}

    }

}
