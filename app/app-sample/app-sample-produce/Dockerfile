FROM winchannel/springboot-assy-filebeat:1.0.6-SNAPSHOT

MAINTAINER wangyongtao

ARG JAR_FILE

ADD ./target/${JAR_FILE} app-sample-produce.jar

EXPOSE 9003

ENTRYPOINT ["sh","/filebeat-springboot-entrypoint.sh","/app-sample-produce.jar","--spring.profiles.active=${SPRING_PROFILES_ACTIVE}"]