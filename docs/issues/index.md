# ISSUES

---

## VPN

|描述|地址|
|  ----  | ----  |
|Vpn 局域网内无法获取Client IP|[修改hosts中de.vicp.net的解析IP为192.168.50.236](https://de.vicp.net:6586/browse/KS-371)|
|VPN OpenVPN卡住|[mssfix 1200 选项通过调整数据包的最大段大小](https://de.vicp.net:6586/browse/KS-361)|
---

## VSCODE

|描述|地址|
|  ----  | ----  |
|Vscode 调试自定义插件|[Vscode 调试自定义插件](https://de.vicp.net:6586/browse/KS-188)|
|Ctrl + K V 如何输入|先同时按下Ctrl + K, 然后同时松开, 再次按下V|
|Vscode中打开的pom文件看上去已格式化好,但在idea中确实没对其好|用noteplus打开后格式化好就可以了|
---

## WIKI

|描述|地址|
|  ----  | ----  |
|jekyll-theme-chirpy 可以search的jekyll|[ssz-dev](https://github.shao.sh/ShaoOrg/jekyll-theme-chirpy/tree/ssz-dev)|
|mkdocs-material 可以search的mkdocs|[main](https://github.shao.sh/ShaoOrg/bulletin)|
---

## Bash

|描述|地址|
|  ----  | ----  |
|无论子进程内函数是否执行成功都退出|`(syno_cli_git_force_mirror_handler;exit 0) && exit 0`|
|无论子进程内函数是否执行成功都`echo 2`|`(syno_cli_git_force_mirror_handler;exit 1) && exit 0 \|\| echo 2`|
|mount nas234上的资源|`opt kernal backup smb-raid0`|
|bash获取一个文件所有奇数行的第一个字段|`awk 'NR % 2 == 1 { print $1 }' /tmp/plugin_cache/plugin_cache_file`|
|bash获取一个文件所有奇数行的第一个字段|`sed -n '1~2p' /tmp/plugin_cache/plugin_cache_file \| cut -d ':' -f 1`|
|pipeline affect 命令的错误码|`foo_str=$(aaffsf) \|\| echo 1`,可以执行 `foo_str=$(aaffsf\| grep running \| awk '{print $2}') \|\| echo 1`,不会执行|
|ssh远程curl文件到本机|`ssh jenkins-8m2-docker 'curl -ks -L http://nas246.shao.sh:39002/tools/linux/core/bash-completion-2.14.0.tar.xz' > bc.tar.xz`|
|ssh远程curl文件到本机tar|`ssh jenkins-8m2-docker 'curl -ks -L http://nas246.shao.sh:39002/tools/linux/core/bash-completion-2.14.0.tar.xz' \| tar -xJf - -C /tmp`|
|子shell代码块不改变当前context,包括当前路径|`(cd /sh/private/; ls -d */ \| sed 's/\///';)`|
|代码块,改变当前context,包括当前路径,{}必须跟换行|`{`<br>`cd /sh/private/; ls -d */ \| sed 's/\///';`<br>`}`|
---

## Powershell

|描述|地址|
|  ----  | ----  |
|奇妙的"" empty '', ```"" -like '-*'```,无论前面加-not 或不加一直是$false, 只有```-not ("" -like '-*')```逻辑才正常|```"" -like '-*';-not  "" -like '-*' ```|
|powershell 5.1版本中的-不能被补全,升级到7.4解决了|```winget install --id Microsoft.Powershell --source winget```|
|powershell初始化一个变量为null|```$currentCommandInfo=$null```|
|powershell中变量一定要设初始值,否则逻辑不可控制|```$currentCommandInfo; $currentCommandInfo = [CommandInfo]::new(@{})``|
|在 PowerShell 中，如果你想在字符串中引用变量的属性或方法（如 $argList.Length），你可以使用双引号字符串插值的方式|```"$($argList.Length)"```|
|HashSet.Add方法会打印True或False在Console,通过强转到`[void]`来规避|```[void]$hashset.Add('xxx')```|
|Import-Module 打印2个True在Console,通过Out-Null来规避,但导入过程中所有的输出都没有了|```Import-Module "C:\usr\ssz\workspace\git\app\scm-chocolatey\win\chocolatey\base\ssz.helper.extension\extensions\ssz.helper.psm1" -Force \|Out-Null```|
|Powershell版本号, 可以按Tab自动补全|```$PsVersionTable```|
|警告: 有些导入的命令名包含一个或多个以下受限字符: ```# , ( ) {{ }} [ ] & - / \ $ ^ ; : " ' < > \| ? @ ` * % + = ~```|函数名只允许出现一个'-',```function Write-Log-Debug {```|
|表达式或语句中包含意外的标记“}”|检查所有中文注释,删除它,特别是Chat GPT生成的 或者 升级到powershell 7.4|
|Vscode中Power Shell Extension的Profile|C:\Users\ssz\Documents\WindowsPowerShell\Microsoft.VSCode_profile.ps1|
|Vscode中Power Shell的Profile, 等同于Win Terminal|C:\Users\ssz\Documents\WindowsPowerShell\Microsoft.PowerShell_profile.ps1|
||[Approved Verbs For Powershell](https://learn.microsoft.com/en-us/powershell/scripting/developer/cmdlet/approved-verbs-for-windows-powershell-commands?view=powershell-7.4)|
---

## Docker

|描述|地址|
|  ----  | ----  |
|docker --entrypoint xxx.sh报错exec xxx.sh找不到|检查xxx.sh中的第一行是否`#!/bin/sh`|
---

## Idea

|描述|地址|
|  ----  | ----  |
|命令行太长|启动配置里->缩短命令行->java -cp classpath.jar|
---

## Windows

|描述|地址|
|  ----  | ----  |
|重启nginx|powersell -> stop-service nginx -> start-service nginx 或 restart-service nginx|
---

## Code

|描述|地址|
|  ----  | ----  |
|修改rtc|增强branch chf-2.2.1-release|
---

## Python

|描述|地址|
|  ----  | ----  |
|Pycli中不支持arg type description|```@cli_invoker(arg_type_desc="generic_maven_tempalte_type_hander_arg_definition,common,common")```|
|Pycli中不支持arggreation|```@cli_invoker(arggreation=lambda: [{}]```|
|Pycli中不支持int等类型转化|```@cli_invoker(arg_data_type="ptest=int")```|
|逻辑错误,index=-1,此时if还是为True,返回`[:-1]`,最终少了一个字符|`index = long_option.find("=");long_option[:index] if index else long_option`|
---

## Npm Package的版本号

|符号|描述|示例|示例描述|
| ---- | ---- | ---- | ---- |
|>	|大于某个版本	|>1.2.1	|大于1.2.1版本|
|>= 	|大于等于某个版本	|>=1.2.1	|大于等于1.2.1版本|
|<	|小于某个版本 	|<1.2.1	|小于1.2.1版本|
|<= 	|小于等于某个版本 	|<=1.2.1	|小于等于1.2.1版本|
|- 	|介于两个版本之间 	|1.2.1 - 1.4.5	|介于1.2.1和1.4.5之间|
| x	|不固定的版本号 	|1.3.x	|只要保证主版本号是1，次版本号是3即可|
|~	|补丁版本号可增	|~1.3.4	|保证主版本号是1，次版本号是3，补丁版本号大于等于4|
|^	|此版本和补丁版本可增	|^1.3.4	|保证主版本号是1，次版本号可以大于等于3，补丁版本号可以大于等于4|
|*	|最新版本 	|*	|始终安装最新版本|
---
