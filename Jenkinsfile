pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                cd src/main/java/org/daynekq
                ant -d build
                echo 'Building..'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}