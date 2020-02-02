pipeline {
  agent any
  stages {
    stage('Build Jar') {
      steps {
        withGradle() {
          sh './gradlew build '
        }

      }
    }

  }
}