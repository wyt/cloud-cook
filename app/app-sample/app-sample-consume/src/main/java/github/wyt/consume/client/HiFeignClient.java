package github.wyt.consume.client;

import github.wyt.consume.client.fallback.HiFeignClientFallBack;
import github.wyt.consume.config.FeignConfig;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
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
