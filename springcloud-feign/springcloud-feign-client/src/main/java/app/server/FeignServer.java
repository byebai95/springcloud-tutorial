package app.server;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "feign-server")
public interface FeignServer {

    @RequestMapping(value = "/user",method = RequestMethod.GET)
    String getUserInfo();
}
