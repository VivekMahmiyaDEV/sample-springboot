package com.sample.springbootdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class SampleController {

    @GetMapping(path = {"/sample","/sample/{name}"})
    public String testsample(@PathVariable("name") Optional<String> name) {
        return name.map(n -> "Hello " + n).orElse("Hello World");
    }

    @GetMapping(path = {"/sample1","/sample1/{name}"})
    public String testsample(@PathVariable("name") Optional<String> name) {
        return name.map(n -> "You are Hacked " + n).orElse("You are hacked");
    }
}
