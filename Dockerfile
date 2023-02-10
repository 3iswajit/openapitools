FROM java:8
EXPOSE 8080
ADD /target/openapitools.jar openapitools.jar
ENTRYPOINT ["java","-jar","openapitools.jar"]


