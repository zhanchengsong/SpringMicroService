node {

    def gradleHome = tool 'Gradle6'
    def GRADLE_HOME = tool 'Gradle6'
    def JAVA_HOME = tool 'JDK8'
    def DOCKER_HOME = tool 'Docker'

    stage('Build Jar') {
      steps('Gradle Build') {
          // run Gradle to execute compile without unit testing
          sh "'${gradleHome}/bin/gradle' -g gradle-user-home clean build -x test"
      }

    }
    stage ('Build Images') {
        productService = docker.build("product-service", "microservices/product-service")
    }


}