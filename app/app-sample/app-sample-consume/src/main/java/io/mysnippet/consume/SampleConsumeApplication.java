package io.mysnippet.consume;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * 使用Ribbon作为服务消费者的负载均衡器。 结合RestTemplate消费REST服务， RestTemplate是一个网络请求框架。
 *
 * @author wangyongtao
 * @date 2018/7/16
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients // 开启Feign Client功能
@EnableHystrix // 开启熔断器功能
public class SampleConsumeApplication {

  public static void main(String[] args) {
    SpringApplication.run(SampleConsumeApplication.class, args);
  }
}
