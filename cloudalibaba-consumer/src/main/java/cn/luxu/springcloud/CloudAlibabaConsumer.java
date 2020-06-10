package cn.luxu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CloudAlibabaConsumer {
    public static void main(String[] args) {
        SpringApplication.run(CloudAlibabaConsumer.class,args);
    }
}
