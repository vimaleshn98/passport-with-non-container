pipeline{
    agent any
    environment{
        New_Version = '1.0.3'
    }
    stages{
        stage("Build"){
            steps{
                echo "Maven compiling"
                bat 'mvn compile'
            }
            post{
                success{
                    echo "========Maven compile stage executed successfully ${New_Version}========"
                }
                failure{
                    echo "========Maven compile stage execution failed========"
                }
            }
        }
        stage("build & SonarQube analysis") {
            agent any
            steps {
              withSonarQubeEnv('sonarqube') {
                bat 'mvn verify sonar:sonar'
              }
            }
          }
       
    }
    post{
        always{
            echo "========Running ${env.BUILD_ID} on ${env.JENKINS_URL}========"
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