package app.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @SentinelResource("say")
    @GetMapping("/say")
    public String sayHello(){
        return "Hello";
    }
}
