## Spring Cloud Cook

### 使用说明

在Win环境下开发，在本地设置host

``` bash
127.0.0.1 eureka-server
```


#### 注册中心

http://eureka-server:7777/

http://localhost:9003/hi?name=wangyongtao1

http://localhost:9002/hi2?name=wangyongtao3

API网关接口

Rabbion方式调用

http://localhost:7000/api/app-sample-consume/hi?name=wangyongtao

Fegin方式调用

http://localhost:7000/api/app-sample-consume/hi2?name=wangyongtao

聚合监控

http://localhost:8000/#/

链路追踪

http://localhost:7755

### 参考

https://cloud.spring.io/spring-cloud-static/Edgware.SR1/single/spring-cloud.html


### 参与贡献
    
* WANG YONG TAO ([@wangyt](https://yongtao.wang))