@Library("shared-lib@master") _
pipeline {
  agent { label 'nas246.shao.sh' }
  environment {
    EMAIL_RECIPIENTS = 'tempestwin@163.com'
    // credential以 username:password 格式存储, 在打印日志中会被mask message-web-api
    API_TOKEN_ADMIN_CREDENTIALS = credentials('admin-api-token')
    MESSAGE_WEB_API_CREDENTIALS = credentials('message-web-api')
  }

  stages {
    stage('git pull to trigger build') {
      steps {
        sh '''
        cd /app/backup/docker-storage/shaoOrgWiki/bulletin && git pull
        date > ${WORKSPACE}/release.txt
        '''
      }
    }

  }

  post {
    always {
      archiveArtifacts artifacts: '*.txt', onlyIfSuccessful: true
      send_customized_message true
      send_customized_mail()
    }
  }
}
