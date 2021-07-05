package io.mysnippet.consume.client;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("dev")
@SuppressWarnings("all")
public class AppFlowRemoteClientTests {

  @Autowired private AppFlowRemoteClient appFlowRemoteClient;

  @Test
  public void queryTest() {
    String params = "{\"cityId\":201,\"dvid\":\"88899757487acd8cfe12a85b35c8ad5e\"}";
    String result = appFlowRemoteClient.query(params);
    System.out.println(result);
  }
}
