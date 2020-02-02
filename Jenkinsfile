pipeline {
  agent {
    node {
      label 'Kube'
    }

  }
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