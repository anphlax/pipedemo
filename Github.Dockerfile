FROM eclipse-temurin:17-jre
# RUN apt-get update && apt-get install -y postgresql-client

COPY .jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
EXPOSE 8080 8080