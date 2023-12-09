FROM openjdk

EXPOSE 8080

ADD target/pull-p.jar puul-p.jar
ENTRYPOINT ["java", "-jar", "/pull-p.jar"]
