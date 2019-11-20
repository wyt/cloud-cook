package io.mysnippet.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.support.ServerWebExchangeUtils;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ServerWebExchange;

/**
 * @author wangyongtao
 * @date 2018/7/16
 */
@RestController
@SpringBootApplication
@EnableEurekaClient
public class GatewayServiceApplication {

  @RequestMapping("/consume_fallback")
  public String consumeFallback(ServerWebExchange exchange) {
    String requestUrl =
        exchange.getAttribute(ServerWebExchangeUtils.GATEWAY_ORIGINAL_REQUEST_URL_ATTR).toString();

    return "Consume请求[" + requestUrl + "]发生降级!";
  }

  @RequestMapping("/produce_fallback")
  public String produceFallback(ServerWebExchange exchange) {
    String requestUrl =
        exchange.getAttribute(ServerWebExchangeUtils.GATEWAY_ORIGINAL_REQUEST_URL_ATTR).toString();

    return "Produce请求[" + requestUrl + "]发生降级!";
  }

  public static void main(String[] args) {
    SpringApplication.run(GatewayServiceApplication.class, args);
  }
}
