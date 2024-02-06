package com.jasmine.runtime.util;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.InetAddress;

/**
 * @author xieshanghan
 * @version IpUtil.java v 0.1, 2024/2/5 xieshanghan
 */
public class IpUtil {

    private static final Logger LOGGER = LoggerFactory.getLogger(IpUtil.class);

    public static String getHostName() {
        try {
            return InetAddress.getLocalHost().getHostName();
        } catch (Throwable th) {
            LoggerUtil.error(LOGGER, th, "getHostName th");
            return StringUtils.EMPTY;
        }
    }

}