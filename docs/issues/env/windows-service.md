# 在 Windows 上创建服务

你要创建一个 **Windows
服务**，主要有几种常见方式，取决于你要运行的是什么程序（Java、.NET、可执行文件、脚本等）。我先给你介绍通用的方法：

------------------------------------------------------------------------

## 1. 用 `sc` 命令创建服务（最简单）

如果你有一个可执行程序（例如 `C:\myapp\myapp.exe`），可以直接用 `sc`：

``` powershell
sc create MyService binPath= "C:\myapp\myapp.exe" start= auto DisplayName= "My Custom Service"
```

参数说明： - `MyService` → 服务的内部名字（不能有空格）。 - `binPath` →
程序路径。 - `start= auto` → 开机自启动（也可用 `demand` 手动启动）。 -
`DisplayName` → 在服务管理器里显示的名字。

创建后可以用：

``` powershell
sc start MyService
sc stop MyService
sc delete MyService
```

------------------------------------------------------------------------

## 2. 用 `nssm`（推荐）

[`nssm`](https://nssm.cc/)（Non-Sucking Service
Manager）是一个开源工具，可以把任何程序变成 Windows 服务，比 `sc` 好用。

安装后执行：

``` powershell
nssm install MyService
```

会弹出一个 GUI，选择： - **Path** → 你的程序，例如
`C:\myapp\myapp.exe` - **Startup directory** → 程序目录 - **Arguments**
→ 启动参数（可选）

然后点 *Install service*。

------------------------------------------------------------------------

## 3. 用 PowerShell 注册服务

如果你要运行的是 PowerShell 脚本，可以先用 `pwsh.exe` 或
`powershell.exe` 包装：

``` powershell
New-Service -Name "MyService" `
    -BinaryPathName "C:\Program Files\PowerShell\7\pwsh.exe -File C:\myapp\script.ps1" `
    -DisplayName "My PowerShell Service" `
    -StartupType Automatic
```

------------------------------------------------------------------------

## 4. Java 程序

如果你是运行 Java（比如 Spring Boot 应用），推荐用 `winsw`（Windows
Service Wrapper）： 1. 下载 [WinSW](https://github.com/winsw/winsw)。 2.
写一个 XML 配置文件，指定 `java -jar yourapp.jar`。 3. 注册成服务。

------------------------------------------------------------------------

⚡ 问题是：你是要把 **现成的可执行文件** 注册成服务，还是要把 **Java
程序/脚本** 变成服务？

我可以针对你具体的场景写一个完整配置（例如 Spring Boot + WinSW 或者
Python 脚本 + nssm）。你是想运行什么程序作为服务呢？

## Example Vilink Monitor

```
nssm install VilinkMonitorService "C:\usr\ssz\workspace\git\app\scm-python\sh\bin\vilink.bat"
nssm set VilinkMonitorService AppDirectory "C:\usr\ssz\win-services\vilink-monitor"
nssm set VilinkMonitorService AppParameters "monitor -a runtime -r"
nssm set VilinkMonitorService ObjectName ".\ssz" "xxx"
```

## Example TODO
