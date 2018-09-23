package com.altran.techtest.kas.service;

import com.altran.techtest.kas.dto.ItemDTO;
import com.altran.techtest.kas.dto.SolrMessageDTO;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Service("resourceReaderService")
public class ResourceClientImpl implements IResourceClient {
    private static final String BASE_URL = "http://opendata-ajuntament.barcelona.cat";
    private static final String RESOURCE_URI = "/data/api/3/action/package_search";
    private static final String HEADER_CONTENT_TYPE_JSON = "application/json;charset=utf-8";
    private static final String START = "start";
    private static final String ROWS = "rows";
    private static final String QUERY_FILTER = "fq";
    private static final int ROWS_VALUE = 10;
    private static final int MAX_ROWS_VALUE = 1000;
    private static final int START_VALUE = 0;

    private final WebClient webClient = WebClient.builder()
            .baseUrl(BASE_URL)
            .defaultHeader(HttpHeaders.CONTENT_TYPE, HEADER_CONTENT_TYPE_JSON)
            .build();

    @Override
    public List<ItemDTO> getAllResultsFromResource() {
        SolrMessageDTO solrMessageDTO =  this.webClient.get()
                .uri(uriBuilder -> uriBuilder.path(RESOURCE_URI)
                        .queryParam(START, START_VALUE)
                        .queryParam(ROWS, ROWS_VALUE)
                        .build())
                .retrieve()
                .bodyToMono(SolrMessageDTO.class)
                .block();
        return solrMessageDTO.getResult().getResults();
    }

    @Override
    public ItemDTO getResultFromResourceById(String id) {
        SolrMessageDTO solrMessageDTO = this.webClient.get()
                .uri(uriBuilder -> uriBuilder.path(RESOURCE_URI)
                        .queryParam(QUERY_FILTER, "id:" + id)
                        .build())
                .retrieve()
                .bodyToMono(SolrMessageDTO.class)
                .block();
        // TODO: Exception should not be two records with the same ID
        return solrMessageDTO.getResult().getResults().get(0);
    }

}
