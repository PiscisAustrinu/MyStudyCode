package com.Ylb.Spring5.Test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Log {
    private static final Logger log = LoggerFactory.getLogger(Log.class);

    public static void main(String[] args) {
        log.info("hello log");
        log.warn("hello log");
    }
}
