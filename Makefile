all:
	go mod tidy
	go install \
		github.com/grpc-ecosystem/grpc-gateway/v2/protoc-gen-grpc-gateway \
		github.com/grpc-ecosystem/grpc-gateway/v2/protoc-gen-openapiv2 \
		google.golang.org/protobuf/cmd/protoc-gen-go \
		google.golang.org/grpc/cmd/protoc-gen-go-grpc \
		github.com/rakyll/statik
	mkdir -p api_pb
	buf generate
	rm -rf api_pb/*
	mv ./gen/go/* ./api_pb/
	rm ./gen/openapiv2/api.swagger.json
	mv ./gen/openapiv2/api.swagger.json ./docs/
	sed -i 's~api_pb~~g' ./docs/api.swagger.json
	sed -i 's~#/definitions/rpcStatus~~g' ./docs/api.swagger.json
	statik -m -f -src docs/
