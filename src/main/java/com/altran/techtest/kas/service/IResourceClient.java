package com.altran.techtest.kas.service;

import com.altran.techtest.kas.dto.SolrMessageDTO;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * This interface defines the service for gathering information
 * from the service API.
 */
public interface IResourceClient {

    Flux<SolrMessageDTO> getAllResultsFromResource(Integer page, Integer rows);
    Mono<SolrMessageDTO> getResultFromResourceById(String id);
}
