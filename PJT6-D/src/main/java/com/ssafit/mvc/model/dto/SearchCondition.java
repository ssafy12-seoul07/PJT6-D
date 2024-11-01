package com.ssafit.mvc.model.dto;

public class SearchCondition {
    private String key; // 검색 기준
    private String name; // 검색어
    private String orderBy; // 정렬 기준
    private String orderByDir; // 정렬 방향(asc, desc)
    
    public SearchCondition() {}
    
    public String getKey() {
        return key;
    }
    public void setKey(String key) {
        this.key = key;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getOrderBy() {
        return orderBy;
    }
    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }
    public String getOrderByDir() {
        return orderByDir;
    }
    public void setOrderByDir(String orderByDir) {
        this.orderByDir = orderByDir;
    }
    
    @Override
    public String toString() {
        return "SearchCondition [key=" + key + ", name=" + name + ", orderBy=" + orderBy + ", orderByDir=" + orderByDir
                + "]";
    }
    
    
    
}
