package hello.springmvc.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogTestController {
    private final Logger log = LoggerFactory.getLogger(getClass());

    @GetMapping("/log-test")
    public String logTest() {

        String name = "Spring";

        System.out.println("name = " + name);

        log.trace("TRACE LOG = {}", name);
        log.debug("DEBUG LOG = {}", name);
        log.info("INFO LOG  = {}", name);
        log.warn("WARN LOG  = {}", name);
        log.error("ERROR LOG = {}", name);

        return "OK";
    }
}
