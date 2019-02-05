pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        dir(path: 'spring-demo') {
          sh 'mvn clean install test'
        }

      }
    }
  }
}