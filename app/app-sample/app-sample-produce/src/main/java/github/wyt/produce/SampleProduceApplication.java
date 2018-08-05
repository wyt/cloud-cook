package github.wyt.produce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author wangyongtao
 * @date 2018/7/16
 */
@SpringBootApplication
@EnableEurekaClient
public class SampleProduceApplication {

  public static void main(String[] args) {
    SpringApplication.run(SampleProduceApplication.class, args);
  }
}
