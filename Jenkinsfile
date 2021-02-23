/*
 * =================
 * Copyright (c) 2021.  Jasper Fennet Solutions, All rights reserved
 * =================
 */

pipeline {
    triggers {
        GenericTrigger(
                token: 'nl.jasperfennet.template_branch_trigger',
        )
    }
    agent any
    stages {
        stage("Build") {
            steps {
                sh 'mvn clean install'
            }
        }
    }
    post{
        success {
            sh 'echo "${env.BRANCH_NAME}" '
            sh 'echo "Creating Dockerimage'
            sh 'mvn spring-boot:build-image -Dspring-boot.build-image.imageName=jasperfennet/spring-application-template'
        }
    }
}
