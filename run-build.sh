#!/usr/bin/env bash

export HOST=user
export BUILD_DIR=build/libs
export TOMCAT_WEBAPP_DIR=/home/user/tomcat/apache-tomcat-9.0.52/webapps

./gradlew clean
./gradlew build

cp $BUILD_DIR/spring-boot-project-0.0.1-SNAPSHOT.war $TOMCAT_WEBAPP_DIR/demo.war


git config --global user.email "lion811004@gmail.com"
git config --global user.name "ArthurWuTW"

