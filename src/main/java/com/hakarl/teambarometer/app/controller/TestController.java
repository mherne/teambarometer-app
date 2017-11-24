package com.hakarl.teambarometer.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author armannds
 * @since 2017-11-24
 */
@RestController
public class TestController {

    @RequestMapping("/")
    public String testMapping() {
        return "Hello I am running on amazon";
    }

}
