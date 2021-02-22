pipeline{
    agent any
    stages{
        stage("Build"){
            steps{
                bat 'mvn -version'
            }
            post{
                success{
                    echo "========Maven compile stage executed successfully========"
                }
                failure{
                    echo "========Maven compile stage execution failed========"
                }
            }
        }
        stage("build & SonarQube analysis") {
            steps {
              withSonarQubeEnv('sonarqube') {
                bat 'mvn verify sonar:sonar'
              }
            }
          }
       
    }
    post{
        always{
            echo "========Running on ========"
        }
        changed{
                    echo "========Their is change in Packaging from pervious========"
                }
        success{
            echo "========pipeline executed successfully ========"
        }
        failure{
            echo "========pipeline execution failed========"
        }
    }
}