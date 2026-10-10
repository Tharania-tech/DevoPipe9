pipeline {
agent any

tools {
    jdk 'JDK 21'
    maven 'Maven'
}

stages {

    stage('Checkout') {
        steps {
            checkout scm
        }
    }

    stage('Build and Test') {
        steps {
            bat 'mvn clean test'
        }
        post {
            always {
                junit 'target/surefire-reports/*.xml'
            }
        }
    }

    stage('Coverage') {
        steps {
            bat 'mvn jacoco:report'
        }
    }

    stage('Package') {
        steps {
            bat 'mvn package -DskipTests'
        }
    }

    stage('Static Analysis') {
        steps {
            withSonarQubeEnv('SonarQube') {
                bat 'mvn sonar:sonar'
            }
        }
    }
}

}