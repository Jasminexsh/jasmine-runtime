package com.jasmine.runtime.facade.impl;

import com.jasmine.runtime.facade.DubboDemoFacade;
import com.jasmine.runtime.facade.model.DubboDemoQueryRequest;
import com.jasmine.runtime.facade.model.DubboDemoQueryResponse;
import com.jasmine.runtime.util.IpUtil;
import com.jasmine.runtime.util.LoggerUtil;
import org.apache.commons.lang3.StringUtils;
import org.apache.dubbo.config.annotation.DubboService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author xieshanghan
 * @version DubboDemoFacadeImpl.java v 0.1, 2024/2/5 xieshanghan
 */
@DubboService(interfaceClass = DubboDemoFacade.class)
public class DubboDemoFacadeImpl implements DubboDemoFacade {

    private static final Logger LOGGER = LoggerFactory.getLogger(DubboDemoFacadeImpl.class);

    private static final String IP = "ip";

    private static final String HOST_NAME = "hostName";

    @Override
    public DubboDemoQueryResponse queryDubboDemoInfo(DubboDemoQueryRequest request) {
        DubboDemoQueryResponse response = new DubboDemoQueryResponse();
        try {
            if (request == null) {
                return response;
            }

            if (StringUtils.equals(IP, request.getQueryFieldName())) {
                response.setData("127.0.0.1");
            } else if (StringUtils.equals(HOST_NAME, request.getQueryFieldName())) {
                response.setData(IpUtil.getHostName());
            }
            return response;
        } catch (Throwable th) {
            LoggerUtil.error(LOGGER, th, "queryDubboDemoInfo th, request={}", request);
            response.setErrMsg(th.getMessage());
            return response;
        }
    }

}