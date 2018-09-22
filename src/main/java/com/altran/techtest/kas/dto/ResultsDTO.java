package com.altran.techtest.kas.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Data Transfer Object for describing an object from the list of
 * results received.
 */
public class ResultsDTO {
    @JsonProperty("notes_translated")
    private MultiLanguageDTO notesTranslated;
    private String geolocation;
    private String code;
    @JsonProperty("url_tornada")
    private MultiLanguageDTO urlTornada;
    @JsonProperty("dataset_fields_description")
    private String datasetFieldsDescription;
    private String fuente;
    @JsonProperty("private")
    private boolean scope;
    @JsonProperty("num_tags")
    private int numTags;
    private String api;
    private String frequency;
    @JsonProperty("update_string")
    private String updateString;
    private String id;
    @JsonProperty("title_translated")
    private MultiLanguageDTO titleTranslated;
    @JsonProperty("metadata_modified")
    private String metadataModified;
    private String author;
    @JsonProperty("author_email")
    private String authorEmail;
    private boolean isopen;
    private String state;
    private String version;
    private String observations;
    private String department;
    @JsonProperty("creator_user_id")
    private String creatorUserId;
    private String type;
    private List<ResourceDTO> resources;

    public ResultsDTO() {

    }

    public MultiLanguageDTO getNotesTranslated() {
        return notesTranslated;
    }

    public void setNotesTranslated(MultiLanguageDTO notesTranslated) {
        this.notesTranslated = notesTranslated;
    }

    public String getGeolocation() {
        return geolocation;
    }

    public void setGeolocation(String geolocation) {
        this.geolocation = geolocation;
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

    public String getDatasetFieldsDescription() {
        return datasetFieldsDescription;
    }

    public void setDatasetFieldsDescription(String datasetFieldsDescription) {
        this.datasetFieldsDescription = datasetFieldsDescription;
    }

    public String getFuente() {
        return fuente;
    }

    public void setFuente(String fuente) {
        this.fuente = fuente;
    }

    public boolean isScope() {
        return scope;
    }

    public void setScope(boolean scope) {
        this.scope = scope;
    }

    public int getNumTags() {
        return numTags;
    }

    public void setNumTags(int numTags) {
        this.numTags = numTags;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public String getApi() {
        return api;
    }

    public void setApi(String api) {
        this.api = api;
    }

    public String getUpdateString() {
        return updateString;
    }

    public void setUpdateString(String updateString) {
        this.updateString = updateString;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public MultiLanguageDTO getTitleTranslated() {
        return titleTranslated;
    }

    public void setTitleTranslated(MultiLanguageDTO titleTranslated) {
        this.titleTranslated = titleTranslated;
    }

    public String getMetadataModified() {
        return metadataModified;
    }

    public void setMetadataModified(String metadataModified) {
        this.metadataModified = metadataModified;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthorEmail() {
        return authorEmail;
    }

    public void setAuthorEmail(String authorEmail) {
        this.authorEmail = authorEmail;
    }

    public boolean isIsopen() {
        return isopen;
    }

    public void setIsopen(boolean isopen) {
        this.isopen = isopen;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCreatorUserId() {
        return creatorUserId;
    }

    public void setCreatorUserId(String creatorUserId) {
        this.creatorUserId = creatorUserId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<ResourceDTO> getResources() {
        return resources;
    }

    public void setResources(List<ResourceDTO> resources) {
        this.resources = resources;
    }
}
