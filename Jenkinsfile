node {
    stage('Initialize'){
            def dockerHome = tool 'Docker'
            env.PATH = "${dockerHome}/bin:${env.PATH}"
            checkout scm
    }
    stage('Build Jar') {
        sh "./gradlew build -x test"
    }
    stage ('Build Images') {
        productService = docker.build("product-service", "microservices/product-service")
    }


}