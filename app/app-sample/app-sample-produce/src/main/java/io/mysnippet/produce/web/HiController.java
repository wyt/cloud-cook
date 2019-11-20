package io.mysnippet.produce.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * 提供一个测试接口。
 *
 * @author wangyongtao
 * @date 2018/7/16
 */
@RestController
public class HiController {

  @Value("${spring.application.name}")
  String appName;

  @Value("${server.port}")
  String port;

  @Value("${config.test.value}")
  String configTestValue;

  @GetMapping("/whoami")
  public String whoami() throws InterruptedException {
//    TimeUnit.SECONDS.sleep(10);
    return "I am " + appName;
  }

  @GetMapping("/hi")
  public String home(@RequestParam String name) {
    return "Hi "
        + name
        + ", I am from "
        + appName
        + " and the port is:"
        + port
        + " and the config test value is :"
        + configTestValue;
  }
}
