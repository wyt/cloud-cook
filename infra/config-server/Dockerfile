FROM wangyongtao/springboot-assy-filebeat:1.12.3

MAINTAINER wangyongtao

ARG JAR_FILE

ADD ./target/${JAR_FILE} config-server.jar

EXPOSE 7766

ENTRYPOINT ["sh","/cloud-assy-entrypoint.sh","/config-server.jar","--spring.profiles.active=${SPRING_PROFILES_ACTIVE}"]