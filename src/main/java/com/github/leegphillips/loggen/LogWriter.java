package com.github.leegphillips.loggen;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
class LogWriter {
    private static final Log logger = LogFactory.getLog(LogWriter.class);

    @Scheduled(fixedDelay = 100)
    public void scan() throws Throwable {
        throw new Throwable();
    }
}
