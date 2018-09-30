#!groovy

echo 'Payload:'
echo Payload



node ("maven"){

    stage("Process Projects"){
        input 'stop'
    }
}
