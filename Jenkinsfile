pipeline {
    agent any
    stages {

        stage('Build Application') {
            steps {
                sh 'mvn -f pom.xml clean package'
            }
            post {
                success {
                    archiveArtifacts artifacts: '**/*.war'
                }
            }
        }

        stage('Create tomcat docker image') {
            steps {
                sh 'docker build -t tomcat_sample_webapp:${env.BUILD_ID} .'
            }
        }

    }
}