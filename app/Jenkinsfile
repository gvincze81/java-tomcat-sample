pipeline {
    agent any
    stages {
        stage('Build Application') {
            steps {
                sh 'mvn -f app/pom.xml clean package'
            }
            post {
                success {
                    archiveArtifacts artifacts: '**/*.war'
                }
            }
        }

        stage('Deploy to staging') {
            steps {
                build job: 'DeployApplicationToStagingEnv'
            }
        }

        stage('Deploy to production') {
            steps {
                timeout(time:5, unit:'DAYS') {
                    input message: 'Approve production deployment?'
                }

                build job: 'DeployApplicationToProductionEnv'
            }
        }

    }
}