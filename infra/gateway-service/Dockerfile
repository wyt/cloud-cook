FROM wangyongtao/springboot-assy-filebeat:1.1.7

MAINTAINER wangyongtao

ARG JAR_FILE

ADD ./target/${JAR_FILE} gateway-service.jar

EXPOSE 7000

ENTRYPOINT ["sh","/filebeat-springboot-entrypoint.sh","/gateway-service.jar","--spring.profiles.active=${SPRING_PROFILES_ACTIVE}"]