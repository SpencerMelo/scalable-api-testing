pipeline {
    agent { docker { image 'maven:3.6.2' } }
    stages {
        stage('build') {
            steps {
                bat 'mvn clean install'
            }
        }
    }
}