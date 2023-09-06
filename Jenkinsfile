pipeline {
    agent any
    stages {
        stage('Check version'){
            steps{
                withMaven( maven:'Maven-3') {
                    sh 'mvn --version'
                }
            }
        }

        stage('Clean') {
            steps{
                withMaven(maven:'Maven-3') {
                    sh 'mvn clean'
                }
            }
        }

        stage('Package and deploy to docker') {
            steps{
                withMaven(maven:'Maven-3') {
                    sh 'mvn install'
                }
            }
        }
    }
}