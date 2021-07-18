package github.wyt.gateway.custom;

public class BlockResponse
    extends com.alibaba.csp.sentinel.adapter.gateway.zuul.fallback.BlockResponse {

  public BlockResponse(int code, String message, String route) {
    super(code, message, route);
  }
}
