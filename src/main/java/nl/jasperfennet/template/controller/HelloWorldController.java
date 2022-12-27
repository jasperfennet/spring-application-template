/*
 * =================
 * Copyright (c) 2021.  Jasper Fennet Solutions, All rights reserved
 * =================
 */

package nl.jasperfennet.template.controller;

import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HelloWorldController {

    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "User greeted properly", content = {@Content(mediaType = "application/json")}),
            @ApiResponse(responseCode = "400", description = "Name not provided"),
    })
    public String helloWorld(@Parameter(description = "Name used in greetings") @RequestParam String name) {
        log.info(" hallo");
        return "Hello " + name;
    }

    @GetMapping(value = "/rapportage", produces = "text/plain")
    public String test() {
        double x = Math.random();
        return String.format("jasper_123 %f", x);
    }
}
