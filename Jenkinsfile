@Library('javahome-libs') _
pipeline{
    agent any
    tools {
        maven 'maven3'
    }
    stages{

        stage('Maven Build'){
            steps{
                sh 'mvn clean package'
            }
        }
        stage('Tomcat Deploy'){
            steps{
                tomcatDeploy credId: 'tomcat-dev',
                             ip: '172.31.40.135',
                             userName: 'ec2-user',
                             tomcatHome: '/opt/tomcat8',
                             warName: 'springmvc'
            }
        }
    }
}
