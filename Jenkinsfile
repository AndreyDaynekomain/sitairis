pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                script {
                    // Run the Ant build
                    ant run
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