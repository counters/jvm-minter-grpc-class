## Fields of response
| Name      | Description                  |
| --------- | ---------------------------- | {{range .ResponseType.Fields}}
| {{.Name}} | {{fieldcomments .Message .}} | {{end}}