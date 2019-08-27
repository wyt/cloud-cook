FROM wangyongtao/springboot-assy-filebeat:1.12.3

MAINTAINER wangyongtao

ARG JAR_FILE

ADD ./target/${JAR_FILE} app-sample-produce.jar

EXPOSE 9003

ENTRYPOINT ["sh","/cloud-assy-entrypoint.sh","/app-sample-produce.jar","--spring.profiles.active=${SPRING_PROFILES_ACTIVE}"]