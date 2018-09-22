package com.altran.techtest.kas.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class OrganizationDTO {
    private String code;
    @JsonProperty("display_name")
    private String displayName;
    private String description;
    private OrganizationDTO parent;
    private String created;
    @JsonProperty("package_count")
    private int packageCount;
    @JsonProperty("image_display_url")
    private String imageDisplayUrl;
    @JsonProperty("tematica_nti")
    private String tematicaNti;
    @JsonProperty("description_translated")
    private MultiLanguageDTO descriptionTranslated;
    private String name;
    @JsonProperty("is_organization")
    private boolean isOrganization;
    private String state;
    @JsonProperty("image_url")
    private String imageUrl;
    private List<GroupDTO> groups;
    private String type;
    private String title;
    @JsonProperty("revision_id")
    private String revisionId;
    @JsonProperty("title_translated")
    private MultiLanguageDTO titleTranslated;
    @JsonProperty("num_followers")
    private int numFollowers;
    private String id;
    @JsonProperty("approval_status")
    private String approvalStatus;

    public OrganizationDTO() {

    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public OrganizationDTO getParent() {
        return parent;
    }

    public void setParent(OrganizationDTO parent) {
        this.parent = parent;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public int getPackageCount() {
        return packageCount;
    }

    public void setPackageCount(int packageCount) {
        this.packageCount = packageCount;
    }

    public String getImageDisplayUrl() {
        return imageDisplayUrl;
    }

    public void setImageDisplayUrl(String imageDisplayUrl) {
        this.imageDisplayUrl = imageDisplayUrl;
    }

    public String getTematicaNti() {
        return tematicaNti;
    }

    public void setTematicaNti(String tematicaNti) {
        this.tematicaNti = tematicaNti;
    }

    public MultiLanguageDTO getDescriptionTranslated() {
        return descriptionTranslated;
    }

    public void setDescriptionTranslated(MultiLanguageDTO descriptionTranslated) {
        this.descriptionTranslated = descriptionTranslated;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isOrganization() {
        return isOrganization;
    }

    public void setOrganization(boolean organization) {
        isOrganization = organization;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public List<GroupDTO> getGroups() {
        return groups;
    }

    public void setGroups(List<GroupDTO> groups) {
        this.groups = groups;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public MultiLanguageDTO getTitleTranslated() {
        return titleTranslated;
    }

    public void setTitleTranslated(MultiLanguageDTO titleTranslated) {
        this.titleTranslated = titleTranslated;
    }

    public int getNumFollowers() {
        return numFollowers;
    }

    public void setNumFollowers(int numFollowers) {
        this.numFollowers = numFollowers;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(String approvalStatus) {
        this.approvalStatus = approvalStatus;
    }
}
