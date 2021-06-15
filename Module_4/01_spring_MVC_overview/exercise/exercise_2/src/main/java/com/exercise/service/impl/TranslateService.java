package com.exercise.service.impl;

import com.exercise.service.ITranslateService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class TranslateService implements ITranslateService {
    @Override
    public String translateVietnamese(String english) {
        Map<String,String> mapTranslate = new HashMap<>();
        mapTranslate.put("hello","xin chao");
        mapTranslate.put("goodbye","tam biet");
        mapTranslate.put("good afternoon","chao buoi trua");
        mapTranslate.put("good evening","chao buoi toi");
        mapTranslate.put("good night","chuc ngu ngon");
        return mapTranslate.get(english);
    }
}
