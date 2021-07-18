package github.wyt.gateway.fallback;

import com.alibaba.csp.sentinel.adapter.gateway.zuul.fallback.ZuulBlockFallbackProvider;
import com.alibaba.csp.sentinel.log.RecordLog;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import github.wyt.gateway.custom.BlockResponse;

public class ZuulFallbackProvider implements ZuulBlockFallbackProvider {

  @Override
  public String getRoute() {
    return "*";
  }

  @Override
  public BlockResponse fallbackResponse(String route, Throwable cause) {

    RecordLog.info(
        String.format("[Sentinel DefaultBlockFallbackProvider] Run fallback route: %s", route));

    if (cause instanceof BlockException) {
      BlockResponse blockResponse = new BlockResponse(200, null, route);
      String respBody = "{\"code\":\"200\",\"msg\":\"哥们儿我被限流了\"}";
      blockResponse.setRespBody(respBody);
      return blockResponse;
    } else {
      BlockResponse blockResponse = new BlockResponse(500, null, route);
      String respBody = "{\"status\":\"11004\",\"message\":\"网络开小差了,请稍后重试\"}";
      blockResponse.setRespBody(respBody);
      return blockResponse;
    }
  }

  //  @Override
  //  public BlockResponse fallbackResponse(String route, Throwable cause) {
  //    RecordLog.info(
  //        String.format("[Sentinel DefaultBlockFallbackProvider] Run fallback route: %s", route));
  //    if (cause instanceof BlockException) {
  //      return new BlockResponse(429, "Sentinel block exception", route);
  //    } else {
  //      return new BlockResponse(500, "System Error", route);
  //    }
  //  }
}
