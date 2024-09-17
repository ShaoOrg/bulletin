# Jenkins

###### pipeline中显示乱码`[31m2024-09-17 09:55:15 WARN:: -------docker.io-------(B[m`
- 安装AnsiColor Plugin
- pipeline中增加
```groovy
options {
  ansiColor('xterm')
}
```
