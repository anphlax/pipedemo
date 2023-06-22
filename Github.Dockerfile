FROM eclipse-temurin:17-jre

# Additional DB Migration Scripts here

COPY package/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
EXPOSE 8080 8080