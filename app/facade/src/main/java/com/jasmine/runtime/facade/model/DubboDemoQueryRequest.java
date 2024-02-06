package com.jasmine.runtime.facade.model;

import java.io.Serializable;
import java.util.Map;

/**
 * @author xieshanghan
 * @version DubboDemoQueryRequest.java v 0.1, 2024/2/5 xieshanghan
 */
public class DubboDemoQueryRequest implements Serializable {
    private static final long serialVersionUID = 8230285596307150617L;

    private String queryFieldName;

    private String queryFieldType;

    private Map<String, Object> queryExtraInfo;

    public String getQueryFieldName() {
        return queryFieldName;
    }

    public void setQueryFieldName(String queryFieldName) {
        this.queryFieldName = queryFieldName;
    }

    public String getQueryFieldType() {
        return queryFieldType;
    }

    public void setQueryFieldType(String queryFieldType) {
        this.queryFieldType = queryFieldType;
    }

    public Map<String, Object> getQueryExtraInfo() {
        return queryExtraInfo;
    }

    public void setQueryExtraInfo(Map<String, Object> queryExtraInfo) {
        this.queryExtraInfo = queryExtraInfo;
    }

    @Override
    public String toString() {
        return "DubboDemoQueryRequest{" +
                "queryFieldName='" + queryFieldName + '\'' +
                ", queryFieldType='" + queryFieldType + '\'' +
                ", queryExtraInfo=" + queryExtraInfo +
                '}';
    }

}