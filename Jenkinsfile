#!groovy
node {
    stage('Checkout') {
        git '/home/ubuntu/jenkins_calc'
    }
    
    stage('build') {
        sh 'mvn clean package -Dskiptests'
    }
    stage('test'){
        sh 'mvn test'
    }
    stage('publish'){
        junit '**/target/surefire-reports/*.xml'
    }
    stage('free'){
        build job: 'ex1', parameters: [string(name: 'MAX_LIMIT', value: '90')]
    }
    
    stage('archive'){
        archiveArtifacts '**/target/*.jar'
    }
}
