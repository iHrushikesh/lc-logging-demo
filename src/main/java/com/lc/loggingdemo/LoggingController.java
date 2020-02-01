package com.lc.loggingdemo;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.MDC;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class LoggingController {

	Logger logger = LoggerFactory.getLogger(LoggingController.class);
	Logger auditlogger = LoggerFactory.getLogger("audit");

	@RequestMapping("/")
	public String index() throws Exception {

		ObjectMapper mapper = new ObjectMapper();
		// Mapped Diagnostic Context. Map key=value to log parameters from
		// context like userid, requestUUID etc.
		MDC.put("userid", "John Doe");

		try {
			logger.trace("A TRACE Message");
			logger.debug("A DEBUG Message");
			logger.info("An INFO Message");
			logger.warn("A WARN Message");
			logger.error("An ERROR Message");
			
			// Audit-Log json quickly using map
			Map<String, String> map = new HashMap<>();
			map.put("Hello", "World");
			map.put("from", "cloud!");
			auditlogger.info("{}", map);
			
			//Audit-Log existing object using mapper 
			ContainerBean bean = new ContainerBean("John", "Doe", "male");
			String json = mapper.writeValueAsString(bean);
			auditlogger.info(json);
			
			// Sample Exception for logging demo
			throw new Exception("some exception");
			
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		}
		return "Swooosh! Check out the Kibanna to see the logs on aws...";
	}
}
