FROM tomcat:8.5.34-jre8-slim

ENV TZ=Asia/Hong_Kong

VOLUME /tmp
WORKDIR "/tmp"

COPY target/demo-1.0-SNAPSHOT.jar ./app.jar
ENTRYPOINT exec java $JAVA_OPTS -jar ./app.jar
EXPOSE 8091 8012