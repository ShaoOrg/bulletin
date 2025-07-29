# 常用的短语
## 一次性代理docker pull
[官方链接](https://docs.docker.com/engine/cli/proxy/)
HTTP_PROXY=http://192.168.50.34:10811 docker pull ubuntu-focal-binary
~/.docker/config.json
```
{
 "proxies": {
   "default": {
     "httpProxy": "http://192.168.50.34:10811",
     "httpsProxy": "http://192.168.50.34:10811",
     "noProxy": "*.github.shao.sh,*.shao.sh,de.vicp.net,127.0.0.0/8"
   }
 }
}
```
