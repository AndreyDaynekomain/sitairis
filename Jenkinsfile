pipeline {
    agent any

    stages {
        stage('Prepare') {
            steps {
                // Ensure build.sh is executable
                sh 'chmod +x build.sh'
            }
        }

        stage('Build') {
            steps {
                // Run the build script
                sh './build.sh'
            }
        }
    }

    post {
        always {
            echo 'Pipeline finished.'
        }
    }
}