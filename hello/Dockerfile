FROM eclipse-temurin:17
RUN mkdir /opt/app
COPY target/hello-0.0.1-SNAPSHOT.jar /opt/app
CMD ["java", "-jar", "/opt/app/hello-0.0.1-SNAPSHOT.jar"]
EXPOSE 8080/tcp