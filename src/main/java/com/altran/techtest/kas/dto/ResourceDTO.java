package com.altran.techtest.kas.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResourceDTO {
    @JsonProperty("cache_last_updated")
    private String cacheLastUpdated;
    @JsonProperty("package_id")
    private String packageId;
    @JsonProperty("datastore_active")
    private boolean datastoreActive;
    private String id;
    private String size;
    private String state;
    @JsonProperty("api_access_number")
    private String apiAccessNumber;
    @JsonProperty("api_access_number_absolute")
    private String apiAccessNumberAbsolute;
    private String hash;
    private String description;
    private String format;
    private String downloads;
    @JsonProperty("mimetype_inner")
    private String mimetypeInner;
    @JsonProperty("url_type")
    private String urlType;
    @JsonProperty("column_types")
    private String columnTypes;
    @JsonProperty("file_volume")
    private String fileVolume;
    private String mimetype;
    @JsonProperty("cache_url")
    private String cacheUrl;
    private String name;
    private String created;
    private String url;
    @JsonProperty("downloads_absolute")
    private String downloadsAbsolute;
    @JsonProperty("map_visualization_res")
    private String mapVisualizationRes;
    private String qa;
    @JsonProperty("last_modified")
    private String lastModified;
    private int position;
    @JsonProperty("revision_id")
    private String revisionId;
    @JsonProperty("resource_type")
    private String resourceType;

    public ResourceDTO() {

    }

    public String getCacheLastUpdated() {
        return cacheLastUpdated;
    }

    public void setCacheLastUpdated(String cacheLastUpdated) {
        this.cacheLastUpdated = cacheLastUpdated;
    }

    public String getPackageId() {
        return packageId;
    }

    public void setPackageId(String packageId) {
        this.packageId = packageId;
    }

    public boolean isDatastoreActive() {
        return datastoreActive;
    }

    public void setDatastoreActive(boolean datastoreActive) {
        this.datastoreActive = datastoreActive;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getApiAccessNumber() {
        return apiAccessNumber;
    }

    public void setApiAccessNumber(String apiAccessNumber) {
        this.apiAccessNumber = apiAccessNumber;
    }

    public String getApiAccessNumberAbsolute() {
        return apiAccessNumberAbsolute;
    }

    public void setApiAccessNumberAbsolute(String apiAccessNumberAbsolute) {
        this.apiAccessNumberAbsolute = apiAccessNumberAbsolute;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getDownloads() {
        return downloads;
    }

    public void setDownloads(String downloads) {
        this.downloads = downloads;
    }

    public String getMimetypeInner() {
        return mimetypeInner;
    }

    public void setMimetypeInner(String mimetypeInner) {
        this.mimetypeInner = mimetypeInner;
    }

    public String getUrlType() {
        return urlType;
    }

    public void setUrlType(String urlType) {
        this.urlType = urlType;
    }

    public String getColumnTypes() {
        return columnTypes;
    }

    public void setColumnTypes(String columnTypes) {
        this.columnTypes = columnTypes;
    }

    public String getFileVolume() {
        return fileVolume;
    }

    public void setFileVolume(String fileVolume) {
        this.fileVolume = fileVolume;
    }

    public String getMimetype() {
        return mimetype;
    }

    public void setMimetype(String mimetype) {
        this.mimetype = mimetype;
    }

    public String getCacheUrl() {
        return cacheUrl;
    }

    public void setCacheUrl(String cacheUrl) {
        this.cacheUrl = cacheUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDownloadsAbsolute() {
        return downloadsAbsolute;
    }

    public void setDownloadsAbsolute(String downloadsAbsolute) {
        this.downloadsAbsolute = downloadsAbsolute;
    }

    public String getMapVisualizationRes() {
        return mapVisualizationRes;
    }

    public void setMapVisualizationRes(String mapVisualizationRes) {
        this.mapVisualizationRes = mapVisualizationRes;
    }

    public String getQa() {
        return qa;
    }

    public void setQa(String qa) {
        this.qa = qa;
    }

    public String getLastModified() {
        return lastModified;
    }

    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getRevisionId() {
        return revisionId;
    }

    public void setRevisionId(String revisionId) {
        this.revisionId = revisionId;
    }

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }
}
