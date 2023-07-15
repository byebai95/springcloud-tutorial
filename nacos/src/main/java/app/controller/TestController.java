package app.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${userName:DefaultString}")
    private String userName;

    @GetMapping
    public String getInfo(){
        return userName;
    }
}
