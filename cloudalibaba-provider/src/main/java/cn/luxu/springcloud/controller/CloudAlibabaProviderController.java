package cn.luxu.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@Slf4j
public class CloudAlibabaProviderController {

    @Value("${server.port}")
    private String port;

    @GetMapping(value = "/provider/{id}")
    public String provider(@PathVariable("id") Integer id){
        return "UUID:" + UUID.randomUUID().toString() + "Port: " + port;
    }
}
