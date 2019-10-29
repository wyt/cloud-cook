package io.mysnippet.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import zipkin.server.EnableZipkinServer;

/**
 * @author wangyongtao
 * @date 2018/7/18
 */
@SpringBootApplication
@EnableZipkinServer
@EnableEurekaClient
public class ZipkinServiceApplication {

  public static void main(String[] args) {
    SpringApplication.run(ZipkinServiceApplication.class, args);
  }
}
