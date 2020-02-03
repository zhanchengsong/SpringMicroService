pipeline {
  def gradleHome = tool 'Gradle6'
  agent any
  stages {
    stage('Build Jar') {
      steps {
        withGradle() {
          def gradleHome = tool 'Gradle6'
           // run Gradle to execute compile and unit testing
          sh "'${gradleHome}/bin/gradle' clean compileJava test"
        }

      }
    }

  }
}