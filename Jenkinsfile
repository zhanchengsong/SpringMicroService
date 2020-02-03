pipeline {
  environment {
    gradleHome = tool 'Gradle6'
    GRADLE_HOME = tool 'Gradle6'
    JAVA_HOME = tool 'JDK8'
  }
  agent any
  stages {
    stage('Build Jar') {
      steps('Gradle Build') {
          // run Gradle to execute compile without unit testing
          sh "'${gradleHome}/bin/gradle' -g gradle-user-home clean build -x test"


      }
    }

  }
}