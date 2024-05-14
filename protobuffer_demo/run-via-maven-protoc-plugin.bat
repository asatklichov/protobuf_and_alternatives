echo https://www.xolstice.org/protobuf-maven-plugin/usage.html
echo https://www.xolstice.org/protobuf-maven-plugin/ 
#mvn protobuf:test-compile -DprotocExecutable="C:/apps/protoc-25.2-win64/bin/protoc.exe"
mvn protobuf:compile  -DprotocExecutable="C:/apps/protoc-25.2-win64/bin/protoc.exe"
