package io.mysnippet.consume.client;

import io.mysnippet.consume.client.fallback.AppFlowFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(
    name = "arch-app-flow",
    url = "${opsops.query.url:http://reco-arch.yiche.com/opspos}",
    fallback = AppFlowFallback.class)
@SuppressWarnings("all")
public interface AppFlowRemoteClient {

  @RequestMapping(
      method = RequestMethod.POST,
      consumes = "application/json",
      value = "/v1/recommend/query")
  String query(String params);
}
