pipeline{
    
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