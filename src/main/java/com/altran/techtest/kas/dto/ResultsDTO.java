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

    public MultiLanguageDTO getNotesTranslated() {
        return notesTranslated;
    }

    public void setNotesTranslated(MultiLanguageDTO notesTranslated) {
        this.notesTranslated = notesTranslated;
    }

    public String getGeolocalization() {
        return geolocalization;
    }

    public void setGeolocalization(String geolocalization) {
        this.geolocalization = geolocalization;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public MultiLanguageDTO getUrlTornada() {
        return urlTornada;
    }

    public void setUrlTornada(MultiLanguageDTO urlTornada) {
        this.urlTornada = urlTornada;
    }
}
