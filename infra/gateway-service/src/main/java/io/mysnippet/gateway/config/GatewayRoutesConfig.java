package io.mysnippet.gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author wangyongtao
 * @date 2019/11/21
 */
@Configuration
public class GatewayRoutesConfig {

  @Bean
  public RouteLocator apiRoutes(RouteLocatorBuilder builder) {

    RouteLocatorBuilder.Builder routes = builder.routes();

    RouteLocatorBuilder.Builder serviceProvider =
        routes
            .route(
                "appSampleConsume",
                r ->
                    r.path("/app-sample-consume/**")
                        .filters(
                            f -> {
                              f.stripPrefix(1);
                              f.hystrix(
                                  config -> {
                                    config.setName("appSampleConsume");
                                    config.setFallbackUri("forward:/consume_fallback");
                                  });
                              return f;
                            })
                        .uri("lb://app-sample-consume"))
            .route(
                "appSampleProduce",
                r ->
                    r.path("/app-sample-produce/**")
                        .filters(
                            f -> {
                              f.stripPrefix(1);
                              f.hystrix(
                                  config -> {
                                    config.setName("appSampleProduce");
                                    config.setFallbackUri("forward:/produce_fallback");
                                  });
                              return f;
                            })
                        .uri("lb://app-sample-produce"));

    RouteLocator routeLocator = serviceProvider.build();
    return routeLocator;
  }
}
