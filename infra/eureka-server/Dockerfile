FROM winchannel/springboot-assy-filebeat:1.1.1

MAINTAINER wangyongtao

ARG JAR_FILE

ADD ./target/${JAR_FILE} app.jar

EXPOSE 7777

ENTRYPOINT ["java","-jar","/app.jar"] #容器启动时运行 java -jar app.jar