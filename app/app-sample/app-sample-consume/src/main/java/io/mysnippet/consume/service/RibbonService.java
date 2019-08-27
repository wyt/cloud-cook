package io.mysnippet.consume.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author wangyongtao
 * @date 2018/7/16
 */
@Service
public class RibbonService {

  @Autowired RestTemplate restTemplate;

  @HystrixCommand(fallbackMethod = "hiError") // HystrixCommand，使hi方法启用熔断器功能
  public String hi(String name) {
    return restTemplate.getForObject("http://app-sample-produce/hi?name=" + name, String.class);
  }

  /**
   * 发生熔断时，fallback逻辑
   *
   * @param name
   * @return
   */
  public String hiError(String name) {
    return "hi, " + name + " an error occured.";
  }
}
