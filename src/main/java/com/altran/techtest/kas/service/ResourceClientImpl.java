package com.altran.techtest.kas.service;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service("resourceReaderService")
public class ResourceClientImpl implements IResourceClient {
    private static final String RESOURCE_URI =
            "http://opendata-ajuntament.barcelona.cat/data/api/3/action/package_search?start=0&rows=450";

    @Override
    public String getResourceData() {
        HttpHeaders httpHeaders = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<>(httpHeaders);
        RestTemplate restTemplate = new RestTemplate();
        return (restTemplate.exchange(RESOURCE_URI, HttpMethod.POST, entity, String.class).getBody());
    }
}
