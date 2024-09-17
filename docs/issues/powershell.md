# Powershell

|描述|地址|
|  ----  | ----  |
|windows 10安装windows terminal|[windows store](https://apps.microsoft.com/detail/9n0dx20hk701?rtc=1&hl=zh-cn&gl=CN)|
|windows 10安装powershell 7|[github powershell 7](https://github.com/PowerShell/PowerShell/releases)|
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
