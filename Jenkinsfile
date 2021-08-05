pipeline {
    agent any

    environment {
        DOCKER_PREFIX = "docker exec -d project-java-tomcat /bin/sh -c"
        TOMCAT_WEBAPP_DIR = "/home/user/tomcat/apache-tomcat-10.0.8/webapps"
    }
    
    triggers {
        githubPush()
    }

    stages {

        stage('Cloning file') {
            steps {
                sh """  
                    #!/bin/bash
                    ${env.DOCKER_PREFIX} "cd /home/user/Desktop/jenkins-tmp-dir && \
                                          rm -rf spring-boot-project || echo 'No repo exists!' \
                                         "
                    ${env.DOCKER_PREFIX} "cd /home/user/Desktop/jenkins-tmp-dir && \
                                          git clone https://github.com/ArthurWuTW/spring-boot-project' \
                                         "
                """
            }
        }

        stage('Clean Build') {
            steps {
                sh """ 
                    #!/bin/bash
                    ${env.DOCKER_PREFIX} "cd /home/user/Desktop/jenkins-tmp-dir/spring-boot-project && \
                                          ./gradlew clean \
                                         "
                """
            }
        }

        stage('Build') {
            steps {
                sh """  
                    #!/bin/bash
                    ${env.DOCKER_PREFIX} "cd /home/user/Desktop/jenkins-tmp-dir/spring-boot-project && \
                                          ./gradlew war \
                                         "
                """
            }
        }

        stage('Move War File') {
            steps {
                sh """  
                    #!/bin/bash
                    ${env.DOCKER_PREFIX} "cd /home/user/Desktop/jenkins-tmp-dir/spring-boot-project && \
                                          cp ./build/libs/demo-0.0.1-SNAPSHOT-plain.war ${env.TOMCAT_WEBAPP_DIR}/ \
                                         "
                """
            }
        }

        stage('Delete tmp file') {
            steps {
                sh """  
                    #!/bin/bash
                    ${env.DOCKER_PREFIX} "cd /home/user/Desktop/jenkins-tmp-dir && \
                                          rm -rf spring-boot-project || echo 'No repo exists!' \
                                         "
                """
            }
        }
    }
}