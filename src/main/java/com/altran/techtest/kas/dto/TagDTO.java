package com.altran.techtest.kas.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TagDTO {
    @JsonProperty("vocabulary_id")
    private String vocabularyId;
    private String state;
    @JsonProperty("display_name")
    private String displayName;
    private String id;
    private String name;

    public TagDTO() {

    }

    public String getVocabularyId() {
        return vocabularyId;
    }

    public void setVocabularyId(String vocabularyId) {
        this.vocabularyId = vocabularyId;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
