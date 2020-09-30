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
		--swagger_out=disable_default_errors=true,simple_operation_ids=true,allow_merge=true,fqn_for_swagger_name=false,merge_file_name=api:./docs \
		--go_out=plugins=grpc:./api_pb ./*.proto
	sed -i 's/api_pb//g' docs/api.swagger.json
	statik -m -f -src docs/
