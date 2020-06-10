package cn.luxu.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@Slf4j
public class CloudAlibabaConsumerController {

    private static final String serviceUri = "http://cloudalibaba-provider";


    @Resource
    private RestTemplate restTemplate;

    @GetMapping(value = "/consumer/{id}")
    public String  consumer(@PathVariable("id") Integer id){
        return  restTemplate.getForObject(serviceUri + "/provider/" + id,String.class);
    }
}
