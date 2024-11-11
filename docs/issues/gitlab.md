# Gitlab 
![400px,1000px](../tips/mindmap/gitlab_ci_cd.km)
###### GitLab Runners
-[官方文档](https://docs.gitlab.com/ee/ci/runners/runners_scope.html)
- [instance runner](https://de.vicp.net:58443/admin/runners)
- [runner缺省的shell类型](https://docs.gitlab.com/ee/ci/variables/#using-the-ci-variables-in-your-job-scripts), 定义在config.toml
- [runner supportted shell](https://docs.gitlab.com/runner/shells/index.html#shell-profile-loading)

###### Gitlab Pages
- [官方文档](https://docs.gitlab.com/ee/administration/pages/)
- 同域 ![400px,1000px](../tips/mindmap/gitlab-pages.km)

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
- [企业级](https://de.vicp.net:58443/admin/application_settings/ci_cd)
- [组织级](https://de.vicp.net:58443/groups/SszOrg/-/settings/ci_cd)
- [仓库级](https://de.vicp.net:58443/SszOrg/ci-cd-demo/-/settings/ci_cd)
- CI级,定义在ci/cd文件的variables里
###### Release
- [通过API Release](https://docs.gitlab.com/ee/api/releases)
- [已有的Release增加Link]()
```
curl "https://de.vicp.net:58443/api/v4/projects/353/releases/v0.3.3/assets/links" --header 'Content-Type: application/json' --request POST --header "PRIVATE-TOKEN: person-access-token" \
--data @- <<EOF
{
  "name": "hello-public.sh",
  "link_type": "other",
  "url": "https://de.vicp.net:9000/gitlab.package/demo/hello.sh?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=Q0WiPPNdHXSiFoCftsF2%2F20241023%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20241023T001646Z&X-Amz-Expires=604800&X-Amz-SignedHeaders=host&X-Amz-Signature=df3e54943dc375255e6ba4adc547ebd58b98858bc8027597cc4644ba5db902d0"
}
EOF
```
###### Job Rules
- if里不能用`${变量}`,只能用`$变量`,否则会报错
- [必须在repo的setting里设置protected tag(例如v*)](https://www.reddit.com/r/gitlab/comments/1ah7eq3/how_to_get_gitlabrunner_to_run_not_get_stuck_when/), 这样提交git push origin --tags(git push --follow-tags)时候,这个pipeline才不会stuck
