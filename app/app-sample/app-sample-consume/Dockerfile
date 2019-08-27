FROM wangyongtao/cloud-assy:1.15.1

MAINTAINER wangyongtao

ARG JAR_FILE

ADD ./target/${JAR_FILE} app-sample-consume.jar

EXPOSE 9002

ENTRYPOINT ["sh","/cloud-assy-entrypoint.sh","/app-sample-consume.jar","--spring.profiles.active=${SPRING_PROFILES_ACTIVE}"]