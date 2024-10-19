#### chocolatey
- administrator下安装的choco如何在非administrator下使用(管理员权限被收回了)
```powershell
mkdir "$env:LOCALAPPDATA\Chocolatey"
$env:ChocolateyInstall = "$env:LOCALAPPDATA\Chocolatey"
[System.Environment]::SetEnvironmentVariable("ChocolateyInstall", $env:ChocolateyInstall, "User")
copy "C:\ProgramData\chocolatey\config\chocolatey.config" "$env:LOCALAPPDATA\Chocolatey\config\"
```
- 安装本地包
`choco install ssz.exercise -y --force --source="C:\usr\ssz\workspace\git\app\scm-chocolatey\win\chocolatey\exercise\ssz.exercise"`
