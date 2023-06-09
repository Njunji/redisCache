package com.codechamp.redisN.utils;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

import java.util.Collections;

public class HttpUtils {
    private static String apiHost = "YOUR API HOST";
    private static String apiKey = "YOUR API KEY";

    public static HttpEntity<String> getHttpEntity() {
        System.out.println("apiHost: " + apiHost);
        System.out.println("apiKey: " + apiKey);
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        headers.set("X-RapidAPI-Host", apiHost);
        headers.set("X-RapidAPI-Key", apiKey);
        return new HttpEntity<>(null, headers);
    }
}
