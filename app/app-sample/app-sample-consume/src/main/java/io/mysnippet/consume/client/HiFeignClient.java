package io.mysnippet.consume.client;

import io.mysnippet.consume.client.fallback.HiFeignClientFallBack;
import io.mysnippet.consume.config.FeignConfig;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * https://www.jianshu.com/p/27532a49261f
 * @author wangyongtao
 * @date 2018/7/16
 */
@FeignClient(
  value = "app-sample-produce",
  configuration = FeignConfig.class,
  fallback = HiFeignClientFallBack.class
)
public interface HiFeignClient {

  /**
   * 调用生产者的/hi接口
   *
   * @param name
   * @return
   */
  @GetMapping(value = "/hi")
  String hiFromProduce(@RequestParam(value = "name") String name);
}
