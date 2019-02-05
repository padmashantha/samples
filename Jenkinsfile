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
      stage('Sonarqube analysis') {
          steps {
            echo 'scanning files'
            script {
                     scannerHome = tool 'scanner';
            }
             withSonarQubeEnv('SonarQube') {
                 sh "${scannerHome}/bin/sonar-scanner.sh" 
            }
          }
       }
    }
}
