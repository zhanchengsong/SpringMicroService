def gradleHome = tool 'Gradle6'
pipeline {

  agent any
  stages {
    stage('Build Jar') {
      steps {
        withGradle() {
           // run Gradle to execute compile and unit testing
          sh "'${gradleHome}/bin/gradle' clean compileJava test"
        }

      }
    }

  }
}