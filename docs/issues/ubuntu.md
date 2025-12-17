# Ubuntu

## 远程桌面
二、Ubuntu 24.04 端设置（控制端）
方式一（强烈推荐）：Remmina（GUI，最稳定）
1️⃣ 安装 Remmina
sudo apt update
sudo apt install -y remmina remmina-plugin-rdp

## 解决Windows自带OpenSSH服务器无法实现免密登录

https://zhuanlan.zhihu.com/p/592296884
```
如题所述，新版Windows中提供了内置的OpenSSH客户端与OpenSSH服务器。但是，不正确的配置会造成无法使用公私钥进行免密登录。

如果正确生成了加密密钥对并且配置好了SSH服务器的authorized_keys文件之后仍然需要输入密码使用ssh，那么需要进行以下三个步骤的检查：

■ 第一步：Win键+R键，输入并运行services.msc，打开服务列表，检查OpenSSH Authentication Agent服务是否正常运行。没有运行的话需要启动改服务。

■ 第二步：打开文件资源管理器，进入C:\ProgramData\ssh文件夹（建议直接输入路径进入，一般情况下ProgramData是隐藏文件夹），打开sshd_config文件，检查以下内容是否被正确注释掉：（修改该文件需要管理员权限）

# Match Group administrators
#        AuthorizedKeysFile __PROGRAMDATA__/ssh/administrators_authorized_keys
■ 第三步：（最重要）进入C:\Users\用户名\.ssh文件夹，检查authorized_keys文件的权限，按照以下步骤进行：

右键authorized_keys，选择属性->安全->高级->（左下角）禁用继承
弹框选择“将已继承的权限转换为此对象的显式权限。”
在权限条目中删除除了SYSTEM和当前用户外的所有权限，然后应用并退出。如下图所示：

https://gitee.com/decbe/idcops#https://gitee.com/link?target=https%3A%2F%2Fidcops.yuzekeji.cn%2Fdocs%2F

```