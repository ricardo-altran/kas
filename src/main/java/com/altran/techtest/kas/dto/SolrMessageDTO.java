package com.altran.techtest.kas.dto;

/**
 * Data Transfer Object which encapsulates the information received as a response
 * from the API resource.
 */
public class SolrMessageDTO {
    private String help;
    private boolean success;
    private ResultDTO result;

    public SolrMessageDTO() {

    }
}
