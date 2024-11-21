pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                script {
                     sh './build.sh'
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