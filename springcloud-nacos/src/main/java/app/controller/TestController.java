package app.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RefreshScope
@RestController
public class TestController {

    @Value("${name}")
    private String name;

    @Value("${age:0}")
    private int age;

    @GetMapping
    public Map<String,Object> getInfo(){
        System.out.println("getInfo");
        Map<String,Object> map = new HashMap<>();
        map.put("name", name);
        map.put("age", age);
        return map;
    }
}
