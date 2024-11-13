# Bash

|描述|地址|
|  ----  | ----  |
| 类似 PowerShell 的 Ctrl+R 反向搜索功能，Bash 已经支持使用 Ctrl+R 来搜索历史记录中的命令|`Ctrl+R` 反向搜索|
|无论子进程内函数是否执行成功都退出|`(syno_cli_git_force_mirror_handler;exit 0) && exit 0`|
|无论子进程内函数是否执行成功都`echo 2`|`(syno_cli_git_force_mirror_handler;exit 1) && exit 0 \|\| echo 2`|
|mount nas234上的资源|`opt kernal backup smb-raid0`|
|bash获取一个文件所有奇数行的第一个字段|`awk 'NR % 2 == 1 { print $1 }' /tmp/plugin_cache/plugin_cache_file`|
|bash获取一个文件所有奇数行的第一个字段|`sed -n '1~2p' /tmp/plugin_cache/plugin_cache_file \| cut -d ':' -f 1`|
|ssh远程curl文件到本机|`ssh jenkins-8m2-docker 'curl -ks -L http://nas246.shao.sh:39002/tools/linux/core/bash-completion-2.14.0.tar.xz' > bc.tar.xz`|
|子shell代码块不改变当前context,包括当前路径|`(cd /sh/private/; ls -d */ \| sed 's/\///';)`|
|代码块,改变当前context,包括当前路径,{}必须跟换行|`{`<br>`cd /sh/private/; ls -d */ \| sed 's/\///';`<br>`}`|
|重启记录|`last reboot`|

---

###### ssh远程curl文件到本机tar
``` bash
ssh jenkins-8m2-docker 'curl -ks -L http://nas246.shao.sh:39002/tools/linux/core/bash-completion-2.14.0.tar.xz' | tar -xJf - -C /tmp
```
###### pipeline affect 命令的错误码
- 可以执行
`foo_str=$(aaffsf) || echo 1`
- 不会执行
`foo_str=$(aaffsf | grep running | awk '{print $2}') || echo 1`

###### lvs
- lvs 看磁盘分布
`lvs -o+devices`
###### grep
- 限定文件 grep
`grep -r "abc" --include "*.yaml" .`

###### yum variables
- stream, centos-stream, rocky中有效
```
centos-stream: 8-stream, 9-stream, 10-stream
rocky: 8-rocky, 9-rocky
```
- releasever, red hat系列中有效
```
centos: 8, 9, 10
centos-stream: 8, 9, 10
...
```
- basearch, red hat系列中有效
```
centos: x84_64, i686
```
###### GNU Software
- [All GNU Software](https://www.gnu.org/software/)
