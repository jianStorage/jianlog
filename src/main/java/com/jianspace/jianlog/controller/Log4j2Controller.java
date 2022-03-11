package com.jianspace.jianlog.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Slf4j
@RestController
public class Log4j2Controller {
    //private static final Logger LOGGER = LoggerFactory.getLogger(Log4j2Controller.class);
    /**
     * 日志级别
     * OFF > FATAL > ERROR > WARN > INFO > DEBUG > TRACE > ALL
     */
    @RequestMapping("/printLog")
    public String printLog (){
        for (int i = 0; i < 800; i++) {
           // log.debug("debug message:{}={}", "line", i);
            log.warn("ERROR message:{}={}", "line", i);
            log.error("WARN message:{}={}", "line", i);
            log.info("INFO message:{}={}", "line", i);
            log.debug("DEBUG message:{}={}", "line", i);
            log.trace("TRACE message:{}={}", "line", i);
/*            log.error("ERROR 级别日志");
            log.warn("WARN 级别日志");
            log.info("INFO 级别日志");
            log.debug("DEBUG 级别日志");
            log.trace("TRACE 级别日志");

 */
        }
        return "success" ;
    }
}
