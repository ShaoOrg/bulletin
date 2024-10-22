# Github
###### Github Self Runners
- 企业级别的runner可以share给组织,但不能share给个人
- [企业用的runners](https://github.shao.sh/enterprises/ssz/settings/actions/runners)和[官方文档](https://docs.github.com/zh/enterprise-server@3.14/actions/hosting-your-own-runners/managing-self-hosted-runners/adding-self-hosted-runners)
- Organization里可以看到Runner,但Repository里却看不到
检查[Repository Access](https://github.shao.sh/organizations/SszOrg/settings/actions/runner-groups/3),它可以限制哪些repository可以使用这个Runner Group, 会导致repository看不到所属的Runner
- 启动runner,一个runner只能同时运行一个job,但同一台机器可以安装多个runner
  - export RUNNER_ALLOW_RUNASROOT=1, 解决必须要sudo问题
  - export NODE_TLS_REJECT_UNAUTHORIZED=0, 解决 https://github.shao.sh/api/v3/meta failed, reason: self-signed certificate in certificate chain
  - [runner no_proxy不能使用ip,不能以.开头](https://docs.github.com/en/actions/hosting-your-own-runners/managing-self-hosted-runners/using-a-proxy-server-with-self-hosted-runners)
```
systemd-run --unit=actions-runner bash -c "source /app/etc/github_runner_env.sh;/root/actions-runner/run.sh"
systemd-run --unit=actions-runner-2 bash -c "source /app/etc/github_runner_env.sh; /root/actions-runner-2/run.sh"
```
###### 变量
- 企业级,不支持
- [组织级](https://github.shao.sh/organizations/SszOrg/settings/variables/actions)
- [仓库级](https://github.shao.sh/SszOrg/ci-cd-demo/settings/environments/23313/edit)
- 工作流级别,定义在env 或 defaults.env中
- [上下文](https://docs.github.com/zh/enterprise-server@3.14/actions/writing-workflows/choosing-what-your-workflow-does/accessing-contextual-information-about-workflow-runs#vars-context)
