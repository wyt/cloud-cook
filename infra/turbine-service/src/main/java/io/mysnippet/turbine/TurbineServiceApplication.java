package io.mysnippet.turbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * @author wangyongtao
 * @date 2018/7/19
 */
@SpringBootApplication
@EnableTurbine
@EnableHystrixDashboard
@EnableHystrix
public class TurbineServiceApplication {

  public static void main(String[] args) {
    SpringApplication.run(TurbineServiceApplication.class, args);
  }
}
