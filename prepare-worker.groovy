node {
    stage("initialize") {
        withCredentials([sshUserPrivateKey(credentialsId: 'jenkins1', keyFileVariable: 'SSHKEY', usernameVariable: 'SSHUSERNAME')]) {
          sh "ssh  -o StrictHostKeyChecking=no -i $SSHKEY $SSHUSERNAME@143.198.151.20 yum install epel-release -y"
        }
    }       
}    