# jvm-minter-grpc-class
Kotlin &amp; Java class for gRPC client

Use
 **@TODO**

```shell

```


Update/Install
```shell
git clone https://github.com/MinterTeam/node-grpc-gateway.git
cp node-grpc-gateway/api.proto protos/api.proto
cp node-grpc-gateway/data.proto protos/data.proto
cp node-grpc-gateway/events.proto protos/events.proto
cp node-grpc-gateway/resources.proto protos/resources.proto
rm -r node-grpc-gateway

```

**Удалить лишнее**
```shell
rm node-grpc-gateway/api.proto
rm node-grpc-gateway/swagger.proto
```
- fix proto files `protos/*.proto` (@TODO)
```protobuf
option java_multiple_files = true;
option java_package = "counters.minter.grpc.client";
//import "protoc-gen-openapiv2/options/annotations.proto";
```


```shell
rm -r src/main/java/counters/minter/grpc/client ;
rm -r src/main/kotlin/counters/minter/grpc/client ;
buf generate protos
rm -r jvm ; buf generate node-grpc-gateway
```
