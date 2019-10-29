### Spring Cloud Cook

#### Eureka server

注册中心

在Win环境下开发，在本地设置host

``` bash
127.0.0.1 eureka-server
```

启动
```shell script
mvn spring-boot:run
```

访问 http://eureka-server:7777

#### Config server

配置中心

访问 http://config-server:7766/application-dev.yml

#### Gateway service

应用网关

访问 http://gateway-service:7000/health

#### 示例

直接请求生产者示例接口
http://app-sample-produce:9003/hi?name=foo

http://localhost:9002/hi2?name=bar

API网关接口

Rabbion方式调用

http://localhost:7000/api/app-sample-consume/hi?name=foobar

Fegin方式调用(伪RPC调用,dubbo)

http://localhost:7000/api/app-sample-consume/hi2?name=foobar

#### 聚合监控

http://localhost:8000/#/

#### 链路追踪

http://localhost:7755

#### 参考

https://cloud.spring.io/spring-cloud-static/Edgware.SR6/single/spring-cloud.html

#### 参与贡献
    
* WANG YONG TAO ([@wangyt](https://yongtao.wang))