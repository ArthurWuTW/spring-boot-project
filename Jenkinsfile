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
                    docker exec -d project-java-tomcat /bin/sh -c "touch /home/user/aa.txt"
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