package github.wyt.gateway.custom;

/**
 * 重写BlockResponse,自定义响应体
 *
 * @author wangyongtao
 * @date 2021-7-18
 */
public class BlockResponse
    extends com.alibaba.csp.sentinel.adapter.gateway.zuul.fallback.BlockResponse {

  private String respBody;

  public BlockResponse(int code, String message, String route) {
    super(code, message, route);
  }

  @Override
  public String toString() {
    return respBody;
  }

  public String getRespBody() {
    return respBody;
  }

  public void setRespBody(String respBody) {
    this.respBody = respBody;
  }
}
