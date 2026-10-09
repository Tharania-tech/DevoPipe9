pipeline {
agent any

tools {
    jdk 'JDK21'
    maven 'Maven3'
}

stages {
    stage('Checkout') {
        steps {
            checkout scm
        }
    }

    stage('Build') {
        steps {
            bat 'mvn clean compile'
        }
    }

    stage('Test') {
        steps {
            bat 'mvn test'
        }

        post {
            always {
                junit 'target/surefire-reports/*.xml'
            }
        }
    }

    stage('Package') {
        steps {
            bat 'mvn package'
        }
    }

    stage('Code Coverage') {
        steps {
            bat 'mvn jacoco:report'
        }

        post {
            always {
                publishHTML(target: [
                    allowMissing: true,
                    alwaysLinkToLastBuild: true,
                    keepAll: true,
                    reportDir: 'target/site/jacoco',
                    reportFiles: 'index.html',
                    reportName: 'JaCoCo Coverage Report'
                ])
            }
        }
    }
}

post {
    success {
        echo 'CI Pipeline completed successfully!'
    }

    failure {
        echo 'CI Pipeline failed. Check the Console Output.'
    }
}

}