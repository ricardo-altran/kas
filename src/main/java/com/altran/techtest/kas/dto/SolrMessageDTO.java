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

    public String getHelp() {
        return help;
    }

    public void setHelp(String help) {
        this.help = help;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public ResultDTO getResult() {
        return result;
    }

    public void setResult(ResultDTO result) {
        this.result = result;
    }
}
