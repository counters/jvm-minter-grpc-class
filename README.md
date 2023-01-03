# jvm-minter-grpc-class
Kotlin &amp; Java class for gRPC client

## Install

```kotlin
dependencies {
    implementation("counters:jvm-minter-grpc-class:1.2.0")
    
// optional
    implementation("io.grpc:grpc-netty-shaded:1.50.2")
}
```


Update/Install proto files
```shell
git clone https://github.com/MinterTeam/node-grpc-gateway.git
cp node-grpc-gateway/api.proto protos/api.proto
cp node-grpc-gateway/data.proto protos/data.proto
cp node-grpc-gateway/events.proto protos/events.proto
cp node-grpc-gateway/resources.proto protos/resources.proto
rm -r node-grpc-gateway

```

## fix proto
- fix proto files `protos/*.proto` (@TODO)
```protobuf
option java_multiple_files = true;
option java_package = "counters.minter.grpc.client";
//import "protoc-gen-openapiv2/options/annotations.proto";
```
