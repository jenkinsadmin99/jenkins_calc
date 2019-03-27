FROM ubuntu:16:04

RUN apt-get update
RUN apk-get install -q -y emacs
RUN apt-get install -q -y git
RUN apt-get install -q -y openjdk-8-jdk
ENV JAVA_HOME /usr/lib/jvm/java-8-openjdkamd64

RUN apt-get install -q -y maven
ENV MAVEN_HOME /usr/share/maven


COPY . /jenkins_calc
WORKDIR /jenkins_calc

# CMD 