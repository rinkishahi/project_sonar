pipeline {
    agent any
    stages {
		stage('testing stage') {
		  steps{
              withMaven(maven : 'maven3.5')
		      {
			    bat 'mvn test'
			  }
		  }
        }
		stage('deploy stage') {
		  steps{
              withMaven(maven : 'maven3.5')
		      {
			    bat 'mvn clean install'
			  }
		  }
        }
		stage('generate sonar report') {
		  steps{
              withMaven(maven : 'maven3.5')
		      {
			    bat 'mvn sonar:sonar -Dsonar.projectKey=aem-gws -Dsonar.host.url=http://localhost:9000 -Dsonar.login=fc7e45a9bcc6808e6361d4c10dcc284e99611741'
			  }
		  }
        }
    }
}
