FROM java:8-jdk-alpine
COPY target/01_sprig_project-mvc_-0.0.1-SNAPSHOT.war   /usr/app/
WORKDIR /usr/app
EXPOSE 8088
RUN sh -c  'touch 01_sprig_project-mvc_-0.0.1-SNAPSHOT.war'
ENTRYPOINT ["java", "-jar", "01_sprig_project-mvc_-0.0.1-SNAPSHOT.war"]