FROM openjdk:8
VOLUME /tmp
EXPOSE 8082
ADD ./target/springboot-servicio-destino-0.0.1-SNAPSHOT.jar servicio-destino.jar
ENTRYPOINT ["java","-jar","/servicio-destino.jar"]