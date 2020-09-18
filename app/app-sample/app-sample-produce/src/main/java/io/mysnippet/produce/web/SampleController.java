package io.mysnippet.produce.web;

import com.alibaba.cloud.nacos.NacosConfigManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
class SampleController {

  @Autowired private NacosConfigManager nacosConfigManager;

  @Value("${user.name}")
  String userName;

  @Value("${user.age:25}")
  Integer age;

  @RequestMapping("/user")
  public String simple() {
    return "Hi, " + userName + ", your age is " + age + ".";
  }
}
