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
			    bat 'mvn clean install -PautoInstallPackage'
			  }
		  }
        }
    }
}
