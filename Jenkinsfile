pipeline {
    agent any

  options {
        buildDiscarder(logRotator(numToKeepStr: '5', artifactNumToKeepStr: '5'))
   }

  tools {
         maven 'mvn_3.9.9'
   }
    stages {
        stage('Code Compilation') {
            steps {
                sh 'mvn clean compile'
            }
        }

        stage('Junit exceution') {
            steps {
                sh 'mvn clean test'
            }
        }

        stage('Code Package') {
            steps {
                sh 'mvn clean package'
            }
        }
    }
}