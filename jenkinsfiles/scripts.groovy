def initializeGit() {
    sh label: '', script: '''
              if [ ! -d ".git" ] 
              then 
              git init 
              fi'''
}

def preStageResult = true