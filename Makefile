build:
	mvn clean -f examples/webserver/grpc/pom.xml
	mvn protobuf:compile -f examples/webserver/grpc/pom.xml
	mvn package -f examples/webserver/grpc/pom.xml -DskipTests

run: build
	java -jar ./examples/webserver/grpc/target/helidon-examples-webserver-grpc.jar

.PHONY: build run

