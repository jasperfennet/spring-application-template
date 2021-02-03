pipeline {
    triggers {
        GenericTrigger(
                genericVariables: [
                        [key: 'triggerRef', value: '$.changes[0].ref.displayId'],
                        [key: 'trifferName', value: '$.actor.name'],
                ],
                regexpFilterText: '$triggerRef',
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
