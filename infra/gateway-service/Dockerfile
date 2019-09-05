FROM mysnippet/cloud-assy:1.15.4

MAINTAINER wangyongtao

ARG JAR_FILE

ADD ./target/${JAR_FILE} gateway-service.jar

EXPOSE 7000

ENTRYPOINT ["sh","/cloud-assy-entrypoint.sh","/gateway-service.jar","--spring.profiles.active=${SPRING_PROFILES_ACTIVE}"]