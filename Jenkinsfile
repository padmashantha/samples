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
                 sh "${scannerHome}/bin/sonar-scanner" 
            }
          }
       }
    }
    stage ('Upload') {
      steps {
            rtBuildInfo (
                captureEnv: true,
            )
            rtUpload (
                serverId: "my-artifactory",
                spec:
                    """{
                      "files": [
                        {
                          "pattern": "spring-demo/**/*.jar",
                          "target": "libs-snapshot-local/"
                        }
                     ]
                    }"""
            )
            rtPublishBuildInfo (
                serverId: "my-artifactory"
            )
      }
    }
}
