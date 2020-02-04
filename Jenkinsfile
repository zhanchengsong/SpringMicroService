pipeline {
    agent any
    environment {
        DOCKER_HOME = tool 'Docker'
    }
    stages {
        stage('build jar') {
            steps {
                checkout scm
                sh "./gradlew build -x test"
            }
        }
        stage('build image') {
            steps {
                sh "'{$DOCKER_HOME}/bin/docker build ./microservices/product-service/ "
            }
        }
    }
}