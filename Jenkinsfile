pipeline {
    agent any
    stages {
        stage('Check version'){
            steps{
                sh 'mvn --version'
            }
        }

        stage('Clean') {
            steps {
                sh 'mvn clean'
            }
        }

        stage('Package and deploy to docker') {
            steps {
                sh 'mvn install'
            }
        }
    }
}