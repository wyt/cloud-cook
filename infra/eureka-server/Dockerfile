FROM wangyongtao/cloud-assy:1.15.1

MAINTAINER wangyongtao

ARG JAR_FILE

ADD ./target/${JAR_FILE} eureka-server.jar

# EXPOSE 7777

ENTRYPOINT ["sh","/cloud-assy-entrypoint.sh","/eureka-server.jar","--spring.profiles.active=${SPRING_PROFILES_ACTIVE}"]