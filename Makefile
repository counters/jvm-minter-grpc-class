all:
	go mod tidy
	go install \
		github.com/grpc-ecosystem/grpc-gateway/protoc-gen-grpc-gateway \
		github.com/grpc-ecosystem/grpc-gateway/protoc-gen-swagger \
		github.com/golang/protobuf/protoc-gen-go \
		github.com/rakyll/statik
	mkdir -p api_pb
	protoc -I. \
		--grpc-gateway_out=logtostderr=true:./api_pb \
		--swagger_out=allow_merge=true,merge_file_name=api:./docs \
		--go_out=plugins=grpc:./api_pb ./*.proto
	sed -i 's/\/gatewayruntimeError/\/api_pbErrorBody/g' docs/api.swagger.json
	sed -i 's/ApiService_//g' docs/api.swagger.json
	statik -m -f -src docs/
