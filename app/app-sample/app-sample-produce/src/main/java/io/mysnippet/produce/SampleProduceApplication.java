package io.mysnippet.produce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author wangyongtao
 * @date 2018/7/16
 */
@SpringBootApplication
@EnableDiscoveryClient
public class SampleProduceApplication {

  public static void main(String[] args) {
    SpringApplication.run(SampleProduceApplication.class, args);
  }
}
