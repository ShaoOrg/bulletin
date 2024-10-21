# Jenkins

###### pipeline中显示乱码`[31m2024-09-17 09:55:15 WARN:: -------docker.io-------(B[m`
- 安装AnsiColor Plugin
- pipeline中增加
```groovy
options {
  ansiColor('xterm')
}
```

###### pipeline中pwsh显示乱码,但在vscode terminal中显示正常
- java的-jar前增加-Dfile.encoding=UTF-8,让jenkins agent也用UTF-8编码,否则它会使用系统的GBK编码

###### 添加windows agent
- 下载nssm(专门用于封装java -jar成windows service的工具, 用sc会有问题)
`choco install nssm -y`
- 添加de.vicp.net的公钥证书到java的keystore里,不然会报证书无法校验,keystore密钥是changeit
`keytool -import -alias jenkins -keystore $env:JAVA_HOME/lib/security/cacerts -file c:/usr/pfs/CA/sszRootCA.crt`
- nssm install jenkins-agent, 执行命令弹出对话框
 - Path里选择java.exe的路径, 它会把Directory也自动填上
 - Arguments里填从-jar开始的所有部分,注意url一定要改成57900(已经配置了可以通过websocket),因为57899(它是nas系统的nginx代理)不支持websocket
 - Arguments的-jar前增加-Dfile.encoding=UTF-8, 一定要在 -jar增加,让pwsh, jenkins agent都使用UTF-8
 - IO,里面Output填写一个日志文件路径,另外c:\jenkins目录的remoting也有同样的日志文件
 - Log On里一定要特写当前用户ssz, password里面填写2次登录密码
