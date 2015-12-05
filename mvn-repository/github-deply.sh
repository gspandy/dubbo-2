#!/bin/bash

rm -rf com/

cd ../dubbo/
mvn -DaltDeploymentRepository=snapshot-repo::default::file:../mvn-repository clean deploy

cd ../dubbo-demo-dubbo-demo-provider/
mvn -DaltDeploymentRepository=snapshot-repo::default::file:../mvn-repository clean deploy

cd ../dubbo-demo-dubbo-demo-consumer/
mvn -DaltDeploymentRepository=snapshot-repo::default::file:../mvn-repository clean deploy