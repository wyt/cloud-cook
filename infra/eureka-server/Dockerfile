FROM java:8

MAINTAINER wangyongtao

ARG JAR_FILE

ADD ./target/${JAR_FILE} app.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","/app.jar"] #容器启动时运行 java -jar app.jar