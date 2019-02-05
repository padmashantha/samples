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
                     scannerHome = tool 'SonarScanner';
            }
             withSonarQubeEnv('SonarQube') {
                 bat "${scannerHome}/bin/sonar-scanner.sh" 
            }
          }
       }
    }
}
