package io.mysnippet.consume.web;

import io.mysnippet.consume.service.RibbonService;
import io.mysnippet.consume.service.HiFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangyongtao
 * @date 2018/7/16
 */
@RestController
public class HiController {

  @Autowired
  RibbonService ribbonService;

  /**
   * RestTemplate结合Ribbon调用
   *
   * @param name
   * @return
   */
  @GetMapping("/hi-ribbon")
  public String hiRibbon(@RequestParam(required = false, defaultValue = "foobar") String name) {
    return ribbonService.hi(name);
  }

  // ------------------------------------------//

  @Autowired
  HiFeignService hiFeignService;

  /**
   * Feign声明式调用,Feign默认拥有负载均衡能力
   *
   * @param name
   * @return
   */
  @GetMapping("/hi-feign")
  public String hiFeign(@RequestParam(required = false, defaultValue = "foobar") String name) {
    return hiFeignService.sayHi(name);
  }
}
