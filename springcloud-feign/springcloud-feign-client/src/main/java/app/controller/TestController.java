package app.controller;

import app.server.FeignServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private FeignServer feignServer;

    @GetMapping
    public String get(){
        return "Test";
    }

    @GetMapping("/user")
    public String getUserInfo(){
        return feignServer.getUserInfo();
    }
}
