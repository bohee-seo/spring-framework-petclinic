package org.springframework.samples.petclinic.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiRestController {

    @GetMapping(value = "/version", produces = {"application/JSON"})
    public String getApiVersion(){
        return "{\"version\": \"1.0.1\"}";
    }
}
