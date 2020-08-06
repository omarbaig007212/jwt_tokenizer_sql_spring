package com.tokenizerjwt.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Display {

    @RequestMapping({ "/hello" })
    public String firstPage() {
        return "hi World";
    }

}