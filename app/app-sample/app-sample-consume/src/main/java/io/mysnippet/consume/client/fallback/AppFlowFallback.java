package io.mysnippet.consume.client.fallback;

import io.mysnippet.consume.client.AppFlowRemoteClient;

/**
 * @author gmwang
 * @date 2021/4/28
 */
public class AppFlowFallback implements AppFlowRemoteClient {

  @Override
  public String query(String params) {
    return null;
  }
}
