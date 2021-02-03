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
}
