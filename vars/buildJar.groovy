#!/user/bin/env groovy

def call() {
  echo 'bilding the application...'
  sh  'mvn package'
}