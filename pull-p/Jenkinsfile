pipeline {
    agent any
    tools {
        maven 'Maven3'
    }
    stages {
        stage('Build Maven') {
            steps {
                checkout([$class: 'GitSCM',
                          branches: [[name: '*/main']],
                          userRemoteConfigs: [[url: 'https://github.com/nasihmaj/pull-p']]
                ])
                dir('pull-p') {
                    bat 'mvn clean install'
                }
            }
        }
        stage('Build docker image'){
            steps{
                script{
                    dir('pull-p') {
                        bat 'docker build -t nas/pull-p .'
                    }
                }
            }
        }
        stage('Push image to hub'){
            steps{
                script{
                    withCredentials([string(credentialsId: 'nasdo', variable: 'dockerhubpwd')]) {
                        bat 'docker login -u nasdo -p %dockerhubpwd%'
                        bat 'docker tag nas/pull-p nasdo/nas-pull-p:latest'
                        bat 'docker push nasdo/nas-pull-p:latest'
                    }
                }
            }
        }
    }
}
