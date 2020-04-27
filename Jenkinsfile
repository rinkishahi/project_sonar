pipeline {
    agent any
    stages {
        stage('compile stage') {
		  steps{
              withMaven(maven : 'maven3.5')
		      {
			    sh 'mvn clean compile'
			  }
		  }
        }
		stage('testing stage') {
		  steps{
              withMaven(maven : 'maven3.5')
		      {
			    sh 'mvn test'
			  }
		  }
        }
		stage('deploy stage') {
		  steps{
              withMaven(maven : 'maven3.5')
		      {
			    sh 'mvn clean install -PautoInstallPackage'
			  }
		  }
        }
    }
}
