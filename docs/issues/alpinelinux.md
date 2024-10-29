## Alpinelinux
###### 升级Gun Package
- 升级grep去support pcre
`apk add grep --update`
- 升级sed
`重新编译sed或直接下载http://192.168.50.246:39002/tools/linux/apk/sed-4.9.tar.gz,解压缩到/usr/local/bin`
- 安装多个包,如果已有则更新到最新版
`apk add jq yq curl lsblk net-tools nfs-utils cifs-utils grep --update`
- DHCP client去传递hostname, 设置/etc/network/interface无效
`udhcpc -i eth0 -x hostname:{{kvm-name}}`
