FROM alpine:3.14.0
LABEL AUTHOR="Hari Kammana"
LABEL EMAIL="hari.kammana@gmail.com"

# Install Java
RUN apk add openjdk8-jre

# Download tomcat
RUN wget https://mirrors.estointernet.in/apache/tomcat/tomcat-8/v8.5.69/bin/apache-tomcat-8.5.69.tar.gz

# Extract the file
RUN tar xf apache-tomcat-8.5.69.tar.gz

# Rename tomcat folder
RUN mv apache-tomcat-8.5.69 tomcat8

# Put static website on tomcat

RUN mkdir tomcat8/webapps/hari

RUN echo "<h2> Java Home Docker App </h2>" > tomcat8/webapps/hari/index.html

EXPOSE 8080

CMD [ "tomcat8/bin/startup.sh" ]

