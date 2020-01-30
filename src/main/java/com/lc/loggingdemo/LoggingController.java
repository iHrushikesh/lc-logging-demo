package com.lc.loggingdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoggingController {
 
    Logger logger = LoggerFactory.getLogger(LoggingController.class);
    Logger auditlogger = LoggerFactory.getLogger("audit");
 
    @RequestMapping("/")
    public String index() throws Exception {
    	try {
        logger.trace("A TRACE Message");
        logger.debug("A DEBUG Message");
        logger.info("An INFO Message");
        logger.warn("A WARN Message");
        logger.error("An ERROR Message");
        auditlogger.info("Hello audit");
        throw new Exception("some exception");
    	}catch(Exception e) {
    		logger.error(e.getMessage(), e);
    	}
        return "Howdy! Check out the Logs to see the output...";
    }
}
