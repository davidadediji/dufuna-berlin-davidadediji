FROM amazoncorretto:17
VOLUME /tmp
EXPOSE 8090
ENTRYPOINT ["java","-jar","/address-docker.jar"]
ADD target/address-docker.jar address-docker.jar