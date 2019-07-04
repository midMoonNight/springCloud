package com.atguigu.myrule;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;
/**
 * 用于自定义自己的Ribbon负载均衡算法
 * @author Administrator
 *
 */
@Configuration
public class MySelfRule {
	@Bean
	public IRule myRule() {
//		return new WeightedResponseTimeRule();
		return new RoundRobinRuleMySelf();
	}
}
