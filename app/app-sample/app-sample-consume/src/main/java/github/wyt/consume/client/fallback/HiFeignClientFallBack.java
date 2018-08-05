package github.wyt.consume.client.fallback;

import github.wyt.consume.client.HiFeignClient;
import org.springframework.stereotype.Component;

/**
 * @author wangyongtao
 * @date 2018/7/16
 */
@Component
public class HiFeignClientFallBack implements HiFeignClient {

  @Override
  public String hiFromProduce(String name) {
    return "hi, " + name + " an error occured. [by HiFeignClientFallBack]";
  }
}
