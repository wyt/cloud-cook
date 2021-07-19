package github.wyt.gateway.fallback;

import com.alibaba.csp.sentinel.log.RecordLog;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import github.wyt.gateway.custom.BlockResponse;
import github.wyt.gateway.zuul.enhance.fallback.ZuulBlockFallbackProvider;

import javax.servlet.http.HttpServletRequest;

public class ZuulFallbackProvider2 implements ZuulBlockFallbackProvider {

  @Override
  public String getRoute() {
    return "*";
  }

  @Override
  public BlockResponse fallbackResponse(HttpServletRequest request, String route, Throwable cause) {

    RecordLog.info(
        String.format("[Sentinel DefaultBlockFallbackProvider] Run fallback route: %s", route));

    if (cause instanceof BlockException) {

      String name = request.getParameter("name");

      BlockResponse blockResponse = new BlockResponse(200, null, route);
      String respBody = "{\"code\":\"200\",\"msg\":\"哥们:" + name + "，你被限流了2\"}";
      blockResponse.setRespBody(respBody);
      return blockResponse;
    } else {
      BlockResponse blockResponse = new BlockResponse(500, null, route);
      String respBody = "{\"status\":\"11004\",\"message\":\"网络开小差了,请稍后重试2\"}";
      blockResponse.setRespBody(respBody);
      return blockResponse;
    }
  }
}
