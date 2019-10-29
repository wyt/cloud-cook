package io.mysnippet.monitor;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Configuration;

/**
 * @author wangyongtao
 * @date 2018-7-16
 */
@Configuration
@EnableAutoConfiguration
@EnableDiscoveryClient
@EnableAdminServer
public class PlatformMonitorApplication {

  public static void main(String[] args) {
    SpringApplication.run(PlatformMonitorApplication.class, args);
  }
}
