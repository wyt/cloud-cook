FROM winchannel/springboot-assy-filebeat

MAINTAINER wangyongtao

ARG JAR_FILE

ADD ./target/${JAR_FILE} ${JAR_FILE}

EXPOSE 9002

ENTRYPOINT ["sh","/filebeat-springboot-entrypoint.sh","/${JAR_FILE}"]