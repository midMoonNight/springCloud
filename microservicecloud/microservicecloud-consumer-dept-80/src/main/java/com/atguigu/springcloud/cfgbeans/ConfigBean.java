package com.atguigu.springcloud.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;

@Configuration
public class ConfigBean {
    @Bean
    //Spring Cloud Ribbon是基于Netflix Ribbon实现的一套客户端       负载均衡的工具。
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
    
    /**
     * Ribbon的默认负载均衡算法是轮询，如果需要修改负载均衡算法，则像下面这个使用IRule这个接口，然后返回一个轮询算法。
     * @return
     */
    @Bean
    public IRule myRule() {
    	return new RandomRule();
    }
}