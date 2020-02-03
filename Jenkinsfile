pipeline {
  environment {
    gradleHome = tool 'Gradle6'
    GRADLE_HOME = tool 'Gradle6'
  }
  agent any
  stages {
    stage('Build Jar') {
      steps('Gradle Build') {
          // run Gradle to execute compile without unit testing
          sh "'${gradleHome}/gradle' clean build -x test"


      }
    }

  }
}