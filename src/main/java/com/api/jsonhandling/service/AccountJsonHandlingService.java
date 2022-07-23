package com.api.jsonhandling.service;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import com.api.jsonhandling.bean.AccountBean;
import com.api.jsonhandling.json.JsonParser;

@Service
public class AccountJsonHandlingService {

    @Autowired
    private JsonParser jsonParser;

    public List<AccountBean> accountJsonHandling() {

	// JSON => Java.class 変換処理を行った結果を格納するリスト
	List<AccountBean> jsonParseResultList = new ArrayList<AccountBean>();

	try {
	    // JSONテストデータファイルを取得
	    InputStream inputStream = new ClassPathResource("json/sample_data.json").getInputStream();
	    // JSONの変換処理の呼び出し
	    jsonParseResultList = jsonParser.accountJsonParser(inputStream);
	} catch (IOException e) {
	    e.printStackTrace();
	}

	return jsonParseResultList;
    }
}
