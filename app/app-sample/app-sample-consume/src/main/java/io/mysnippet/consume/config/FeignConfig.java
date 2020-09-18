package io.mysnippet.consume.config;

import feign.Retryer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static java.util.concurrent.TimeUnit.SECONDS;

/**
 * IoC容器中注册一个feignRetryer Bean
 *
 * @author wangyongtao
 * @date 2018/7/16
 */
@Configuration
public class FeignConfig {

  @Bean
  public Retryer feignRetryer() {
    return new Retryer.Default(100, SECONDS.toMillis(1), 5);
  }
}
