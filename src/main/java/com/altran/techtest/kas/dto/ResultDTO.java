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

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public List<ResultsDTO> getResults() {
        return results;
    }

    public void setResults(List<ResultsDTO> results) {
        this.results = results;
    }
}
