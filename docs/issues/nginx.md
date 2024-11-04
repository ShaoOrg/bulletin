## Nginx

###### 502 Bad Gateway, 当使用proxy_pass with 变量 $target_url
- 错误日志中显示 [error] 7#7: *1 de.vicp.net could not be resolved (3: Host not found)
- 通过 resolver 192.168.50.236 **ipv6=off**; 解决,原因是nginx默认启用ipv6作为dns lookup
