## Curl
###### Post Json
- 使用多个--data
```
curl --request POST --header "PRIVATE-TOKEN: person-access-token" \
--data "name=Release v0.2.6" \
--data "tag_name=v0.2.6" \
--data "description=Release description here" \
--data "assets:links:name=README.md" \
--data "assets:links:link_type=other" \
--data "assets:links:direct_asset_path=/README.md" \
--data "assets:links:url=https://de.vicp.net:58443/-/project/353/uploads/974b07a47b64d623a3a5ec881b4765c8/README.md" \
"https://de.vicp.net:58443/api/v4/projects/353/releases"
```
- 使用一个--data + EOF
```
post_json_data=$(cat <<EOF
{
  "name": "Release v0.2.5",
  "tag_name": "v0.2.5",
  "description": "Release description here",
  "assets":{"links":[
    {
      "name": "README.md",
      "link_type": "other",
      "direct_asset_path": "/README.md",
      "url": "https://de.vicp.net:58443/-/project/353/uploads/974b07a47b64d623a3a5ec881b4765c8/README.md"
    }
  ]}
}
EOF
)
curl "https://de.vicp.net:58443/api/v4/projects/353/releases" --header 'Content-Type: application/json' --request POST --header "PRIVATE-TOKEN: person-access-token" \
--data "$post_json_data"
```
```
post_json_data=$(cat 
)
curl "https://de.vicp.net:58443/api/v4/projects/353/releases" --header 'Content-Type: application/json' --request POST --header "PRIVATE-TOKEN: person-access-token" \
--data @- <<EOF
{
  "name": "Release v0.2.1",
  "tag_name": "v0.2.1",
  "description": "Release description here",
  "assets":{
    "links":[
      {
        "name": "README.md",
        "link_type": "other",
        "direct_asset_path": "/README.md",
        "url": "https://de.vicp.net:58443/-/project/353/uploads/974b07a47b64d623a3a5ec881b4765c8/README.md"
      }
    ]
  }
}
EOF
```
