node {
  environment {
    gradleHome = tool 'Gradle6'
    GRADLE_HOME = tool 'Gradle6'
    JAVA_HOME = tool 'JDK8'
    DOCKER_HOME = tool 'Docker'
  }
  agent any
  stages {
    stage('Build Jar') {
      steps('Gradle Build') {
          // run Gradle to execute compile without unit testing
          sh "'${gradleHome}/bin/gradle' -g gradle-user-home clean build -x test"
      }

    }
    stage ('Build Images') {
        steps('Building Product-Service Image') {
              product-service-image = docker.build("product-service", "microservices/product-service")
         }
    }

  }
}