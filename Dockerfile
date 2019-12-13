FROM openjdk:8-jre-alpine
EXPOSE 8080
COPY build/libs/*-all.jar foo.jar
CMD exec java ${JAVA_OPTS} -jar foo.jar
