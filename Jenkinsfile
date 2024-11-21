pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                script {
                    // Убедитесь, что Ant установлен и доступен
                    ant src/main/java/org/daynekq/DOMParserExample.java
                }
            }
        }
    }

    post {
        success {
            echo 'Сборка и запуск прошли успешно!'
        }
        failure {
            echo 'Сборка завершилась с ошибкой.'
        }
    }
}