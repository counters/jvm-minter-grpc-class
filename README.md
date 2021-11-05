# jvm-minter-grpc-class
Kotlin &amp; Java class for gRPC client

Use
 **@TODO**

```shell

```


# Разное
**Добавление**
```shell
git subtree add --prefix node-grpc-gateway https://github.com/MinterTeam/node-grpc-gateway.git master
```
**Обновление**
```shell
git subtree pull --prefix node-grpc-gateway https://github.com/MinterTeam/node-grpc-gateway.git master
```
**Удалить лишнее**
```shell
rm node-grpc-gateway/api.proto
rm node-grpc-gateway/swagger.proto
```
- fix proto files `node-grpc-gateway/*.proto` (@TODO)

```shell
rm -r jvm ;
buf generate node-grpc-gateway
rm -r jvm ; buf generate node-grpc-gateway
#mkdir -p java/src
#ln -s ./../../jvm/src/main/java java/src/main

```
