package github.wyt.uaa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author wangyongtao
 * @date 2018/7/18
 */
@SpringBootApplication
@EnableEurekaClient
public class PlatformUaaApplication {

  public static void main(String[] args) {
    SpringApplication.run(PlatformUaaApplication.class, args);
  }
}
