#!/usr/bin/env bash

export HOST=user
export TMP_DIR=/home/$HOST/Desktop/jenkins-tmp-dir
export CONTAINER=project-java-tomcat

cd $TMP_DIR
git clone https://github.com/ArthurWuTW/spring-boot-project
cd spring-boot-project

./gradlew clean
./gradlew build