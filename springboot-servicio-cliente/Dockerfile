FROM openjdk:8
VOLUME /tmp
EXPOSE 8081
ADD ./target/springboot-servicio-cliente-0.0.1-SNAPSHOT.jar servicio-cliente.jar
ENTRYPOINT ["java","-jar","/servicio-cliente.jar"]