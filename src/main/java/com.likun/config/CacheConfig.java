package com.likun.config;

/**
 * Created by shuyun on 2016/7/5.
 */
public class CacheConfig {
    public static String host;
    public static int port;

    public static String getHost() {
        return host;
    }

    public static void setHost(String host) {
        CacheConfig.host = host;
    }

    public static int getPort() {
        return port;
    }

    public static void setPort(int port) {
        CacheConfig.port = port;
    }
}
