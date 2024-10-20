# Gitlab
###### GitLab Runners
-[官方文档](https://docs.gitlab.com/ee/ci/runners/runners_scope.html)
- [instance runner](https://de.vicp.net:58443/admin/runners)
###### New Repository
- Create a new repository
```
git clone git@de.vicp.net:SszOrg/ci-cd-demo.git
cd ci-cd-demo
git switch --create main
touch README.md
git add README.md
git commit -m "add README"
git push --set-upstream origin main
```
- Push an existing folder
```
cd existing_folder
git init --initial-branch=main
git remote add origin git@de.vicp.net:SszOrg/ci-cd-demo.git
git add .
git commit -m "Initial commit"
git push --set-upstream origin main
```
- Push an existing Git repository
```
cd existing_repo
git remote rename origin old-origin
git remote add origin git@de.vicp.net:SszOrg/ci-cd-demo.git
git push --set-upstream origin --all
git push --set-upstream origin --tags
```
###### Variable
- 企业级, 不支持
- [组织级](https://de.vicp.net:58443/groups/SszOrg/-/settings/ci_cd)
- [仓库级](https://de.vicp.net:58443/SszOrg/ci-cd-demo/-/settings/ci_cd)
- CI级,定义在ci/cd文件的variables里
