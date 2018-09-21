package com.altran.techtest.kas.service;

import com.altran.techtest.kas.dto.SolrMessageDTO;

/**
 * This interface defines the service for gathering information
 * from the service API.
 */
public interface IResourceClient {

    SolrMessageDTO getResourceData();
}
