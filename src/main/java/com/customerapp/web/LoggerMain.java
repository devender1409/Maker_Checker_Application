package com.customerapp.web;

import com.customerapp.model.hibernate.service.interfaces.CustomerService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggerMain {
        private static final Logger log = LogManager.getLogger(CustomerService.class);

        public void processData(){
            log.trace("from trace method");
            log.debug("from debug method");
            log.info("from info method");
            log.warn("from trace method");
            log.error("from trace method");
            log.fatal("from trace method");
        }

}
