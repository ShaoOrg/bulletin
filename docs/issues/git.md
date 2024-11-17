# Git

###### Git 2.47.0
- [git clone hands on](https://stackoverflow.com/questions/11941175/git-fetch-pull-clone-hangs-on-receiving-objects)
[This issue](https://github.com/git-for-windows/git/issues/5199) confirms that there is a bug in Git for Windows v2.47.0. This merged PR with this dinky little fix fixes it. – 
Gabriel Staples
 Commentedyesterday
Downgraded from 2.47 to the previous 2.42 on my windows machine & that fixed it for me – 
Jason De Arte

###### 权限
- 提交到服务器上的没有执行权限
`git update-index --chmod +x .\generate_md.sh`
- 检查git的执行权限
`git ls-files --state .\generate_md.sh`
