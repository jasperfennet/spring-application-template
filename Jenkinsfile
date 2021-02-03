pipeline {
    triggers {
        GenericTrigger(
                genericVariables: [
                        [key: 'triggerRef', value: '$.changes[0].ref.displayId'],
                        [key: 'trifferName', value: '$.actor.name'],
                ],
                causeString: 'triggerd by $triggerName on $triggerRef',
                regexpFilterText: '$triggerRef',
                regexpFilterExpression: 'refs/heads/' + BRANCH_NAME,
                token: 'nl.jasperfennet.template_branch_trigger',
                printContributedVariables: true,
                printPostContent: true,
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
