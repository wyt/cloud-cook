FROM java:8

MAINTAINER wangyongtao

ARG JAR_FILE

ADD ./target/${JAR_FILE} app.jar

EXPOSE 9003

ENTRYPOINT ["java","-jar","/app.jar"]