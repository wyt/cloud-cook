package github.wyt.gateway.config;

import com.alibaba.csp.sentinel.adapter.gateway.zuul.fallback.ZuulBlockFallbackManager;
import com.alibaba.csp.sentinel.adapter.gateway.zuul.filters.SentinelZuulErrorFilter;
import com.alibaba.csp.sentinel.adapter.gateway.zuul.filters.SentinelZuulPostFilter;
import com.netflix.zuul.ZuulFilter;
import github.wyt.gateway.fallback.ZuulFallbackProvider2;
import github.wyt.gateway.zuul.enhance.filters.SentinelZuulPreFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
@SuppressWarnings("all")
public class ZuulConfig {

  @Bean
  public ZuulFilter sentinelZuulPreFilter() {
    // We can also provider the filter order in the constructor.
    return new SentinelZuulPreFilter();
  }

  @Bean
  public ZuulFilter sentinelZuulPostFilter() {
    return new SentinelZuulPostFilter();
  }

  @Bean
  public ZuulFilter sentinelZuulErrorFilter() {
    return new SentinelZuulErrorFilter();
  }

  /** 注册 ZuulFallbackProvider */
  @PostConstruct
  public void doInit() {
    ZuulBlockFallbackManager.registerProvider(new ZuulFallbackProvider2());
    //    initGatewayRules();
  }

  /** 配置限流规则 */
  //  private void initGatewayRules() {
  //    Set<GatewayFlowRule> rules = new HashSet<>();
  //    rules.add(
  //        new GatewayFlowRule("ribbonapi")
  //            .setCount(2) // 限流阈值
  //            .setIntervalSec(1) // 统计时间窗口，单位是秒，默认是 1 秒
  //        );
  //    GatewayRuleManager.loadRules(rules);
  //  }
}
