# Github
###### Github Self Runners
- 企业级别的runner可以share给组织,但不能share给个人
- [企业用的runners](https://github.shao.sh/enterprises/ssz/settings/actions/runners)和[官方文档](https://docs.github.com/zh/enterprise-server@3.14/actions/hosting-your-own-runners/managing-self-hosted-runners/adding-self-hosted-runners)
- Organization里可以看到Runner,但Repository里却看不到
检查[Repository Access](https://github.shao.sh/organizations/SszOrg/settings/actions/runner-groups/3),它可以限制哪些repository可以使用这个Runner Group, 会导致repository看不到所属的Runner
###### 变量
- 企业级,不支持
- [组织级](https://github.shao.sh/organizations/SszOrg/settings/variables/actions)
- [仓库级](https://github.shao.sh/SszOrg/ci-cd-demo/settings/environments/23313/edit)
- 工作流级别,定义在env 或 defaults.env中
- [上下文](https://docs.github.com/zh/enterprise-server@3.14/actions/writing-workflows/choosing-what-your-workflow-does/accessing-contextual-information-about-workflow-runs#vars-context)
