pipeline {
    agent any
    parameters {
        choice(name: 'PLATFORM', choices: ['Linux', 'Windows', 'macOS'], description: 'Target platform for build')
        string(name: 'BUILD_VERSION', defaultValue: '1.0', description: 'Version of the build')
    }
    stages {
        stage('Build') {
            steps {
                script {
                    if (params.PLATFORM == 'Windows') {
                        echo "Building for Windows..."
                        // Додайте ваші команди збірки для Windows
                    } else if (params.PLATFORM == 'macOS') {
                        echo "Building for macOS..."
                        // Додайте ваші команди збірки для macOS
                    } else {
                        echo "Building for Linux..."
                        // Додайте ваші команди збірки для Linux
                    }
                }
            }
        }
        stage('Test') {
            steps {
                echo 'Running tests...'
                // Додайте ваші команди для тестування
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying application...'
                // Додайте ваші команди для розгортання
            }
        }
    }
}
