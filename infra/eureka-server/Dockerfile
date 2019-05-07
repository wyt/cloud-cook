FROM wangyongtao/springboot-assy-filebeat:1.12.3

MAINTAINER wangyongtao

ARG JAR_FILE

ADD ./target/${JAR_FILE} eureka-server.jar

# EXPOSE 7777

ENTRYPOINT ["sh","/filebeat-springboot-entrypoint.sh","/eureka-server.jar","--spring.profiles.active=${SPRING_PROFILES_ACTIVE}"]