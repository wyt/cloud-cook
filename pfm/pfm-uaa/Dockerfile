FROM java:8

MAINTAINER wangyongtao

ARG JAR_FILE

ADD ./target/${JAR_FILE} app.jar

EXPOSE 8001

ENTRYPOINT ["java","-jar","/app.jar"]