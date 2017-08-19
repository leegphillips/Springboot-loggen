package com.github.leegphillips.loggen;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class LogWriter {
    private static final Log logger = LogFactory.getLog(LogWriter.class);

    @Scheduled(fixedDelay = 100)
    public void scan() throws InterruptedException {
        logger.info(new Throwable());
    }
}
