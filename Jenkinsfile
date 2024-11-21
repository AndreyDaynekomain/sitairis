pipeline {
    agent any

    tools {
        ant 'Ant' // Specify the name you gave it in Global Tool Configuration
    }

    stages {
        stage('Build') {
            steps {
                script {
                    // Run the Ant build
                    sh 'ant run'
                }
            }
        }
    }

    post {
        success {
            echo 'Сборка прошла успешно!'
        }
        failure {
            echo 'Сборка завершилась с ошибкой.'
        }
    }
}