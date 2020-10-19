all:
	go mod tidy
	go install \
		github.com/grpc-ecosystem/grpc-gateway/v2/protoc-gen-grpc-gateway \
		github.com/grpc-ecosystem/grpc-gateway/v2/protoc-gen-openapiv2 \
		google.golang.org/protobuf/cmd/protoc-gen-go \
		google.golang.org/grpc/cmd/protoc-gen-go-grpc \
		github.com/rakyll/statik
	mkdir -p api_pb
	protoc -I . \
		--go_out ./api_pb \
		--grpc-gateway_out=logtostderr=true,generate_unbound_methods=true:./api_pb \
		--openapiv2_out=json_names_for_fields=false,disable_default_errors=true,simple_operation_ids=true,allow_merge=true,merge_file_name=api:./docs \
		--go-grpc_out=./api_pb ./*.proto
	sed -i 's/api_pb//g' docs/api.swagger.json
	statik -m -f -src docs/
