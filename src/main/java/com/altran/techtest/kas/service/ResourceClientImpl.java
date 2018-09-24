package com.altran.techtest.kas.service;

import com.altran.techtest.kas.dto.SolrMessageDTO;
import com.altran.techtest.kas.exception.*;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service("resourceReaderService")
public class ResourceClientImpl implements IResourceClient {
    private static final String BASE_URL = "http://opendata-ajuntament.barcelona.cat";
    private static final String RESOURCE_URI = "/data/api/3/action/package_search";
    private static final String HEADER_CONTENT_TYPE_JSON = "application/json;charset=utf-8";
    private static final String START = "start";
    private static final String ROWS = "rows";
    private static final String QUERY_FILTER = "fq";

    private final WebClient webClient;

    public ResourceClientImpl() {
        this.webClient = WebClient.builder()
                .baseUrl(BASE_URL)
                .defaultHeader(HttpHeaders.CONTENT_TYPE, HEADER_CONTENT_TYPE_JSON)
                .build();
    }

    @Override
    public Flux<SolrMessageDTO> getAllResultsFromResource(Integer page, Integer rows) {
        return this.webClient.get()
                .uri(uriBuilder -> uriBuilder.path(RESOURCE_URI)
                        .queryParam(START, page * rows)
                        .queryParam(ROWS, rows)
                        .build())
                .retrieve()
                .onStatus(HttpStatus::is4xxClientError, clientResponse ->
                        Mono.error(new KasClientException()))
                .onStatus(HttpStatus::is5xxServerError, clientResponse ->
                        Mono.error(new KasServerException()))
                .bodyToFlux(SolrMessageDTO.class);
    }

    @Override
    public Mono<SolrMessageDTO> getResultFromResourceById(String id) {
        Mono<SolrMessageDTO> solrMessageDTOMono = this.webClient.get()
                .uri(uriBuilder -> uriBuilder.path(RESOURCE_URI)
                        .queryParam(QUERY_FILTER, "id:" + id)
                        .build())
                .retrieve()
                .onStatus(HttpStatus::is4xxClientError, clientResponse ->
                        Mono.error(new KasClientException()))
                .onStatus(HttpStatus::is5xxServerError, clientResponse ->
                        Mono.error(new KasServerException()))
                .bodyToMono(SolrMessageDTO.class);
        if(solrMessageDTOMono.block().getResult().getCount() == 0)
            throw new KasNoSuchItem();
        return solrMessageDTOMono;
    }

    @Override
    public Mono<SolrMessageDTO> getResultFromResourceByName(String name) {
        Mono<SolrMessageDTO> solrMessageDTOMono = this.webClient.get()
                .uri(uriBuilder -> uriBuilder.path(RESOURCE_URI)
                        .queryParam(QUERY_FILTER, "name:" + name)
                        .build())
                .retrieve()
                .onStatus(HttpStatus::is4xxClientError, clientResponse ->
                        Mono.error(new KasClientException()))
                .onStatus(HttpStatus::is5xxServerError, clientResponse ->
                        Mono.error(new KasServerException()))
                .bodyToMono(SolrMessageDTO.class);
        if(solrMessageDTOMono.block().getResult().getCount() == 0)
            throw new KasNoSuchItemWithThisName();
        return solrMessageDTOMono;
    }

}
