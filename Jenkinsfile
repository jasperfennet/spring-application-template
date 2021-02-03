pipeline {
    triggers {
        GenericTrigger(
                regexpFilterExpression: 'refs/heads/' + BRANCH_NAME,
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
