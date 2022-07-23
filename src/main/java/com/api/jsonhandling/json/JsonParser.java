package com.api.jsonhandling.json;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.api.jsonhandling.bean.AccountBean;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class JsonParser {

    public List<AccountBean> accountJsonParser(InputStream inputStream) throws IOException {

	// 結果を格納するリストを生成
	List<AccountBean> resultList = new ArrayList<AccountBean>();
	// Jackson処理を行うmapperの生成
	ObjectMapper mapper = new ObjectMapper();

	try {
	    // 引数として取得したjsonファイルを対象のJavaクラスに変換する
	    resultList = Arrays.asList(mapper.readValue(inputStream, AccountBean[].class));
	} catch (JsonProcessingException e) {
	    e.printStackTrace();
	}

	return resultList;
    }

}
