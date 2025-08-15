# Windows 环境
介绍如何创建Windows环境, 使用gpg来加解密
z15@de.vicp.net.secret.gpg
tempestwin@163.com.secret.gpg
这2个文件需要自己备份和恢复

## Credential
~目录下有.env, .npmrc, config, .gitconfig
- .env 用于gradle, chocolatey等保存密码
- .npmrc 用于nodejs保存密码
- config 用于kubernet保存密钥
- .gitconfig 用于git保存密码

### 备份
使用python的batch子命令, 命令脚本定义在win-8001/batch.install.runtime.yaml
```
deploy batch credential
```
如果遇到gpg公钥到期,需要用(key 1是必须的否则报公钥无效)
```
gpg --edit-key longid
gpg# key 1
gpg# expire
gpg# save
```
提交备份到git
```
vilink check-git-commit --commit
```

去renew 它(私钥在本机)
### 恢复
```
choco install -y env.ssz.auth
```