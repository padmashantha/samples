pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        dir("spring-demo") {
          sh 'mvn clean install test'
        }
      }
    }
  }
}
