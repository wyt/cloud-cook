package github.wyt.consume.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * IoC容器中注入restTemplate Bean，并使之具有负载均衡功能。
 *
 * @author wangyongtao
 * @date 2018/7/16
 */
@Configuration // 声明当前类是一个配置类，相当于spring的一个xml配置文件
public class RibbonConfig {

  @Bean // 声明在方法上，表示当前方法的返回值为一个Bean
  @LoadBalanced // 使RestTemplate结合Ribbon开启负载均衡功能
  RestTemplate restTemplate() {
    return new RestTemplate();
  }
}
