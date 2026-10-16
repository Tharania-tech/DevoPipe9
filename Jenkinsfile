pipeline {
agent any

stages {
    stage('Build and Test') {
        steps {
            bat 'mvn clean test'
        }
    }

    stage('Static Analysis') {
        steps {
            withSonarQubeEnv('SonarQube') {
                bat 'mvn sonar:sonar'
            }
        }
    }

    stage('Quality Gate') {
        steps {
            timeout(time: 10, unit: 'MINUTES') {
                waitForQualityGate abortPipeline: true
            }
        }
    }

    stage('Package') {
        steps {
            bat 'mvn package -DskipTests'
        }
    }
}

}