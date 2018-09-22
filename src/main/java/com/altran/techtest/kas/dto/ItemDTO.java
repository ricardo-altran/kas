package com.altran.techtest.kas.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Data Transfer Object for describing an object from the list of
 * results received.
 */
public class ItemDTO {
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
    @JsonProperty("num_resources")
    private int numResources;
    private List<TagDTO> tags;
    @JsonProperty("fecha_publicacion")
    private String fechaPublicacion;
    @JsonProperty("load_type")
    private String loadType;
    private List<GroupDTO> groups;
    @JsonProperty("license_id")
    private String licenseId;
    @JsonProperty("license_title")
    private String licenseTitle;
    private OrganizationDTO organization;
    private String name;
    private String url;
    private String notes;
    @JsonProperty("owner_org")
    private String ownerOrg;
    private String tag;
    @JsonProperty("license_url")
    private String licenseUrl;
    private String historical;
    private String title;
    @JsonProperty("revision_id")
    private String revisionId;
    @JsonProperty("date_deactivation_informed")
    private String dateDeactivationInformed;
    private List<ExtraDTO> extras;

    public ItemDTO() {

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

    public int getNumResources() {
        return numResources;
    }

    public void setNumResources(int numResources) {
        this.numResources = numResources;
    }

    public List<TagDTO> getTags() {
        return tags;
    }

    public void setTags(List<TagDTO> tags) {
        this.tags = tags;
    }

    public String getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getLoadType() {
        return loadType;
    }

    public void setLoadType(String loadType) {
        this.loadType = loadType;
    }

    public String getLicenseId() {
        return licenseId;
    }

    public void setLicenseId(String licenseId) {
        this.licenseId = licenseId;
    }

    public String getLicenseTitle() {
        return licenseTitle;
    }

    public void setLicenseTitle(String licenseTitle) {
        this.licenseTitle = licenseTitle;
    }

    public OrganizationDTO getOrganization() {
        return organization;
    }

    public void setOrganization(OrganizationDTO organization) {
        this.organization = organization;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getOwnerOrg() {
        return ownerOrg;
    }

    public void setOwnerOrg(String ownerOrg) {
        this.ownerOrg = ownerOrg;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getLicenseUrl() {
        return licenseUrl;
    }

    public void setLicenseUrl(String licenseUrl) {
        this.licenseUrl = licenseUrl;
    }

    public String getHistorical() {
        return historical;
    }

    public void setHistorical(String historical) {
        this.historical = historical;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRevisionId() {
        return revisionId;
    }

    public void setRevisionId(String revisionId) {
        this.revisionId = revisionId;
    }

    public String getDateDeactivationInformed() {
        return dateDeactivationInformed;
    }

    public void setDateDeactivationInformed(String dateDeactivationInformed) {
        this.dateDeactivationInformed = dateDeactivationInformed;
    }

    public List<ExtraDTO> getExtras() {
        return extras;
    }

    public void setExtras(List<ExtraDTO> extras) {
        this.extras = extras;
    }

    public List<GroupDTO> getGroups() {
        return groups;
    }

    public void setGroups(List<GroupDTO> groups) {
        this.groups = groups;
    }
}
