package com.altran.techtest.kas.dto;

import java.util.List;

/**
 * Data Transfer Object which encapsulates the "result" attribute received
 * from the response of the API resource.
 */
public class ResultDTO {
    private int count;
    private String sort;
    // "facets" is deprecated according to Solr help documentation.
    private List<ItemDTO> results;

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

    public List<ItemDTO> getResults() {
        return results;
    }

    public void setResults(List<ItemDTO> results) {
        this.results = results;
    }
}
