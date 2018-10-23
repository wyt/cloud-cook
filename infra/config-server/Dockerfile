FROM winchannel/springboot-assy-filebeat:1.1.1

MAINTAINER wangyongtao

ARG JAR_FILE

ADD ./target/${JAR_FILE} app.jar

EXPOSE 7766

ENTRYPOINT ["java","-jar","/app.jar"]