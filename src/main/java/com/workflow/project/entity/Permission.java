package com.workflow.project.entity;

public class Permission {

    private Long permissionId;

    private String name;

    private String url;

    public Long getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Long permissionId) {
        this.permissionId = permissionId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name != null ? name.trim() : null;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url != null ? url.trim() : null;
    }
}
