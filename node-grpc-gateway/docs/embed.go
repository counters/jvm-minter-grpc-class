package docs

import (
	"embed"
)

//go:embed api.swagger.json
//go:embed index.html
var FS embed.FS
