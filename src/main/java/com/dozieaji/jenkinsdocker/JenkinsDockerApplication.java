package com.dozieaji.jenkinsdocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class JenkinsDockerApplication {

    @GetMapping ("/message")
    public String helloMessage(){
        return "Hello world from Jenkins....";
    }

    public static void main(String[] args) {
        SpringApplication.run(JenkinsDockerApplication.class, args);
    }

}
