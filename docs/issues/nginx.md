## Nginx
- Nas236 ![400px,1000px](../assets/mindmap/nas236_nginx_topology.km)
###### 502 Bad Gateway, 当使用proxy_pass with 变量 $target_url
- 错误日志中显示 [error] 7#7: *1 de.vicp.net could not be resolved (3: Host not found)
- 通过 resolver 192.168.50.236 **ipv6=off**; 解决,原因是nginx默认启用ipv6作为dns lookup
###### 调用Bash
- systemd socket ![400px,600px](../assets/mindmap/bash_nginx.km)
- Lua, openresty默认加载lua
```
user root; # run in docker必须或有sudo权限
http {
  server {
    location {
      content_by_lua_block {
        if os.execute("touch /var/mkdocs-material/index.md") then
          ngx.say("mkdocs-material refresh!!!")
        else
          ngx.say("mkdocs-material refresh failure!!!")
        end
      }
    }
  }
}
```
