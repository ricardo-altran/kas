package com.altran.techtest.kas.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Data Transfer Object for describing an object from the list of
 * results received.
 */
public class ResultsDTO {
    @JsonProperty("notes_translated")
    private MultiLanguageDTO notesTranslated;
    private String geolocalization;
    private String code;
    @JsonProperty("url_tornada")
    private MultiLanguageDTO urlTornada;

    public ResultsDTO() {

    }
}
