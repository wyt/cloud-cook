FROM wangyongtao/springboot-assy-filebeat:1.1.8

MAINTAINER wangyongtao

ARG JAR_FILE

ADD ./target/${JAR_FILE} config-server.jar

EXPOSE 7766

ENTRYPOINT ["sh","/filebeat-springboot-entrypoint.sh","/config-server.jar","--spring.profiles.active=${SPRING_PROFILES_ACTIVE}"]