package com.altran.techtest.kas.dto;

/**
 * Multilanguage object for the three languages: "ca", "en" and "es".
 */
public class MultiLanguageDTO {
    private String ca;
    private String en;
    private String es;

    public MultiLanguageDTO() {

    }

    public String getCa() {
        return ca;
    }

    public void setCa(String ca) {
        this.ca = ca;
    }

    public String getEn() {
        return en;
    }

    public void setEn(String en) {
        this.en = en;
    }

    public String getEs() {
        return es;
    }

    public void setEs(String es) {
        this.es = es;
    }
}
