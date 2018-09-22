package com.altran.techtest.kas.service;

import com.altran.techtest.kas.dto.SolrMessageDTO;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service("resourceReaderService")
public class ResourceClientImpl implements IResourceClient {
    private static final String RESOURCE_URI =
            "http://opendata-ajuntament.barcelona.cat/data/api/3/action/package_search";
    private static final String QUERY_SEPARATOR = "?";
    private static final String QUERY_AND = "&";
    private static final String START = "start=";
    private static final String ROWS = "rows=";
    private static final int START_PARAMETER = 0;
    private static final int ROWS_PARAMETER = 5;

    @Override
    public SolrMessageDTO getResourceData() {
        HttpHeaders httpHeaders = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<>(httpHeaders);
        RestTemplate restTemplate = new RestTemplate();
        return (restTemplate.exchange(RESOURCE_URI + QUERY_SEPARATOR + START + START_PARAMETER
                + QUERY_AND + ROWS + ROWS_PARAMETER, HttpMethod.GET, entity, SolrMessageDTO.class).getBody());
    }
}
