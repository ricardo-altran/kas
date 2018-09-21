package com.altran.techtest.kas.dto;

import java.util.List;

/**
 * Data Transfer Object which encapsulates the "result" attribute received
 * from the response of the API resource.
 */
public class ResultDTO {
    private int count;
    private String sort;
//    private FacetDTO facets;
    private List<ResultsDTO> results;

    public ResultDTO() {

    }
}
