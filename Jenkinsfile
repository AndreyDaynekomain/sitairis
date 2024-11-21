pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                ant -f src/main/java/org/daynekq/DOMParserExample.java
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