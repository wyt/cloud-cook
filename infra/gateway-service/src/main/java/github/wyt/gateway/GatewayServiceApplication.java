package github.wyt.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

/**
 * @author wangyongtao
 * @date 2018/7/16
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class GatewayServiceApplication {

  public static void main(String[] args) {
    ApplicationContext ctx = SpringApplication.run(GatewayServiceApplication.class, args);
    printBeans(ctx);
  }

  public static void printBeans(ApplicationContext ctx) {
    System.out.println("Let's inspect the beans provided by Spring Boot:");
    String[] beanNames = ctx.getBeanDefinitionNames();
    Arrays.sort(beanNames);
    for (String beanName : beanNames) {
      System.out.println("beanName: " + beanName);
    }
  }
}
