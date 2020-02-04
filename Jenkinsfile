pipeline {

    stage('Initialize'){
            def dockerHome = tool 'Docker'
            env.PATH = "${dockerHome}/bin:${env.PATH}"
            checkout scm
    }
    stage('Build Jar') {
        // run Gradle to execute compile without unit testing
        sh "./gradlew clean build -x test"
    }
    stage ('Build Images') {
        productService = docker.build("product-service", "microservices/product-service")
    }


}