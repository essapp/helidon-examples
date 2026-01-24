build:
# 	mvn clean -f "/Users/zhaolc/rd/eding/mdm/common/pom.xml"
# 	mvn package -f "/Users/zhaolc/rd/eding/mdm/common/pom.xml"
# 	mvn install:install-file -Dfile=/Users/zhaolc/rd/eding/mdm/common/target/ess-eding-mdm-common-1.0.0.jar -DgroupId=pub.ess.eding.mdm -DartifactId=ess-eding-mdm-common -Dversion=1.0.0 -Dpackaging=jar
	mvn clean -f pom.xml
# 	mvn protobuf:compile-custom -f pom.xml
	mvn protobuf:compile -f pom.xml
# 	mvn compile -f "/Users/zhaolc/rd/eding/mdm/h2/pom.xml"
# 	mvn package -Dmaven.test.skip -Declipselink.weave.skip pom.xml
	mvn package -DskipTests
# 	mvn package -Pjlink-image -DskipTests

run: build
	java -jar ./target/helidon-examples-webserver-grpc.jar

.PHONY: build run
