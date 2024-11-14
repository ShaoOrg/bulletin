## Podman

###### 错误
- /etc/cni/net.d/200-loopback.conflist 内容
```json
{
    "cniVersion": "1.0.0",
    "type": "loopback"
}
- 如果不重要可以删除,就不会报错了 or 替换为
```json
{
    "cniVersion": "1.0.0",
    "name": "loopback",
    "plugins": [
        {
            "type": "loopback"
        }
    ]
}
```
```
- `ERRO[0000] Error loading CNI config list file /etc/cni/net.d/200-loopback.conflist: error parsing configuration list: no name`
增加 `"name": "podman"`
- `ERRO[0000] Error loading CNI config list file /etc/cni/net.d/200-loopback.conflist: error parsing configuration list: no 'plugins' key`
增加`"plugins": [],`
- `ERRO[0000] Error loading CNI config list file /etc/cni/net.d/200-loopback.conflist: error parsing configuration list: no plugins in list`
增加`"plugins": [{}],`
