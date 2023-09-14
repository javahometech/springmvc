FROM alpine:3.14.0
LABEL AUTHOR="AAP"
LABEL EMAIL="aap@gmail"

#install java
RUN apk add openjdk8-jre

#download tomcat
RUN wget https://dlcdn.apache.org/tomcat/tomcat-8/v8.5.93/bin/apache-tomcat-8.5.93.tar.gz

#extract file
RUN tar -xf apache-tomcat-8.5.93.tar.gz

#renaming tomcat folder
RUN mv apache-tomcat-8.5.93 tomcat8

#put static website on tomcat

RUN mkdir tomcat8/webappa/testweb

RUN echo "<h2> Welcome </h2>">tomcat8/webappa/testweb/index.html

#exposing 8080 port for tomcat
EXPOSE 8080

#starting tomcat
CMD ["tomcat8/bin/startup.sh"]