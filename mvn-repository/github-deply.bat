del com/

cd ../dubbo/
call mvn -DaltDeploymentRepository=snapshot-repo::default::file:../mvn-repository clean deploy

cd ../dubbo-demo-dubbo-demo-provider/
call mvn -DaltDeploymentRepository=snapshot-repo::default::file:../mvn-repository clean deploy

cd ../dubbo-demo-dubbo-demo-consumer/
call mvn -DaltDeploymentRepository=snapshot-repo::default::file:../mvn-repository clean deploy

@pause