cd ../dubbo/
call mvn -DaltDeploymentRepository=snapshot-repo::default::file:../mvn-repository clean deploy

cd ../dubbo-demo-provider/
call mvn -DaltDeploymentRepository=snapshot-repo::default::file:../mvn-repository clean deploy

cd ../dubbo-demo-consumer/
call mvn -DaltDeploymentRepository=snapshot-repo::default::file:../mvn-repository clean deploy

@pause