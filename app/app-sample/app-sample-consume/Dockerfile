FROM winchannel/springboot-assy-filebeat:1.1.1

MAINTAINER wangyongtao

ARG JAR_FILE

ADD ./target/${JAR_FILE} app-sample-consume.jar

EXPOSE 9002

ENTRYPOINT ["sh","/filebeat-springboot-entrypoint.sh","/app-sample-consume.jar","--spring.profiles.active=${SPRING_PROFILES_ACTIVE}"]