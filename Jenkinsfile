pipeline {
    agent any

    triggers {
        githubPush()
    }

    stages {

        stage('Cloning file') {
            steps {
                sh '''
                    #!/bin/bash
                    cd /home/arthur/Desktop/jenkins-tmp-dir
                    git clone https://github.com/ArthurWuTW/spring-boot-project
                    cd spring-boot-project
                    docker cp ./run-build.sh project-java-tomcat:/home/user
                    docker exec -d project-java-tomcat /bin/sh -c "/home/user/run-build.sh"
                    docker exec -d project-java-tomcat /bin/sh -c "rm /home/user/run-build.sh"
                '''
            }
        }

        stage('Clean Build') {
            steps {
                sh ''' 
                    #!/bin/bash
                '''
            }
        }

        stage('Build') {
            steps {
                sh ''' 
                    #!/bin/bash
                '''
            }
        }

        stage('Move War File') {
            steps {
                sh ''' 
                    #!/bin/bash
                '''
            }
        }

        stage('Delete tmp file') {
            steps {
                sh '''
                    #!/bin/bash
                '''
            }
        }
    }
}