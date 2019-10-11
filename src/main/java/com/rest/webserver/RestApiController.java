package com.rest.webserver;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApiController {

    private static final String template = "Hello, %s ";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(method = RequestMethod.GET, value="/names")
    public RestApi restApi(@RequestParam(value="name", defaultValue = "Tii") String name) {
        return new RestApi(counter.incrementAndGet(), String.format(template, name));
    }
}