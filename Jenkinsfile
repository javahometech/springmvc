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
                sshagent(['tomcat-dev']) {
                   // stop the server
                   sh "ssh -o StrictHostKeyChecking=no ec2-user@172.31.40.135 /opt/tomcat8/bin/shutdown.sh"
                   // delete old wafile
                   sh "ssh ec2-user@172.31.40.135 rm -rf /opt/tomcat8/webapps/springmvc*"
                   // copy latest war file to tomcat-dev server
                   sh "scp  target/springmvc.war ec2-user@172.31.40.135:/opt/tomcat8/webapps/"
                   // start the server
                   sh "ssh ec2-user@172.31.40.135 /opt/tomcat8/bin/startup.sh"
                }    
            }
        }
    }
}
