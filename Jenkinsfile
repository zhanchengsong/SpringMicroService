node {

    def gradleHome = tool 'Gradle6'
    def GRADLE_HOME = tool 'Gradle6'
    def JAVA_HOME = tool 'JDK8'
    def DOCKER_HOME = tool 'Docker'
    stage('Initialize'){
            def dockerHome = tool 'Docker'
            env.PATH = "${dockerHome}/bin:${env.PATH}"
    }

    environment {
        GRADLE_HOME = tool 'Gradle6'
        JAVA_HOME = tool 'JDK8'

    }

    stage('Build Jar') {
        // run Gradle to execute compile without unit testing
        JAVA_HOME = tool 'JDK8'
        echo "${JAVA_HOME}"
        sh "'${gradleHome}/bin/gradle' -g gradle-user-home -Dorg.gradle.java.home='${JAVA_HOME}' clean build -x test"
    }
    stage ('Build Images') {
        productService = docker.build("product-service", "microservices/product-service")
    }


}