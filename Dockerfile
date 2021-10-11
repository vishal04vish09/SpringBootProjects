FROM java:8

EXPOSE 8080

ADD target/SpringAksDemo.jar SpringAksDemo.jar

ENTRYPOINT ["java","-jar","SpringAksDemo.jar"]