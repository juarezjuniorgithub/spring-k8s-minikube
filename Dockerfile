FROM adoptopenjdk/openjdk11:ubi
VOLUME /tmp
COPY target/spring-k8s-minikube-1.0-SNAPSHOT.jar app.jar
ENV JAVA_OPTS=""
ENTRYPOINT exec java -jar /app.jar