package io.mysnippet.consume.service;

import io.mysnippet.consume.client.HiFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wangyongtao
 * @date 2018/7/16
 */
@Service
@SuppressWarnings("all")
public class HiFeignService {

  @Autowired
  HiFeignClient hiFeignClient;

  public String sayHi(String name) {
    return hiFeignClient.hiFromProduce(name);
  }
}
