
## Windows

- 重启nginx
powersell -> stop-service nginx -> start-service nginx 或 restart-service nginx
- windows 11 自带截屏 WIN + Shift + S
- windows 11 下有时候输入法切换失效了, 重启电脑或kill explorer->启动explorer
- windows 11 域管理员设置了不能设置环境变量
```powershell
[System.Environment]::SetEnvironmentVariable("变量名", "变量值", "User")
```
