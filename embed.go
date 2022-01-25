package node_grpc_gateway

import (
	"embed"
)

//go:embed docs/*
var content embed.FS

func Files() embed.FS {
	return content
}
