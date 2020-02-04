node {

    def gradleHome = tool 'Gradle6'
    def GRADLE_HOME = tool 'Gradle6'
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
        JAVA = tool 'JDK8'
        sh script: "ls *.*", returnStdout: true
        sh "'${gradleHome}/bin/gradle' -g gradle-user-home -Dorg.gradle.java.home='${JAVA}' clean build"
    }
    stage ('Build Images') {
        productService = docker.build("product-service", "microservices/product-service")
    }


}