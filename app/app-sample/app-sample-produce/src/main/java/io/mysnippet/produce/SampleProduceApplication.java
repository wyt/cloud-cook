package io.mysnippet.produce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author wangyongtao
 * @date 2018/7/16
 */
@SpringBootApplication
@EnableEurekaClient
@EnableHystrix // 开启熔断器功能
@EnableHystrixDashboard // 开启熔断器Dashboard
public class SampleProduceApplication {

  public static void main(String[] args) {
    SpringApplication.run(SampleProduceApplication.class, args);
  }
}
