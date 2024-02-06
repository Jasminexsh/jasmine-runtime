package com.jasmine.runtime.facade.model;

import java.io.Serializable;
import java.util.Map;

/**
 * @author xieshanghan
 * @version DubboDemoQueryResponse.java v 0.1, 2024/2/5 xieshanghan
 */
public class DubboDemoQueryResponse implements Serializable {

    private static final long serialVersionUID = 6423656097532565933L;

    private Object data;

    private Map<String, Object> extraInfo;

    private String errMsg;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Map<String, Object> getExtraInfo() {
        return extraInfo;
    }

    public void setExtraInfo(Map<String, Object> extraInfo) {
        this.extraInfo = extraInfo;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    @Override
    public String toString() {
        return "DubboDemoQueryResponse{" +
                "data=" + data +
                ", extraInfo=" + extraInfo +
                ", errMsg='" + errMsg + '\'' +
                '}';
    }

}