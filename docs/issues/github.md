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
systemd-run --unit=actions-runner-tempestwin-bulletin bash -c "source /app/etc/github_runner_env.sh; /root/actions-runner-tempestwin-bulletin/run.sh"
```
###### 变量
- 企业级,不支持
- [组织级](https://github.shao.sh/organizations/SszOrg/settings/variables/actions)
- [仓库级](https://github.shao.sh/SszOrg/ci-cd-demo/settings/environments/23313/edit)
- 工作流级别,定义在env 或 defaults.env中
- [上下文](https://docs.github.com/zh/enterprise-server@3.14/actions/writing-workflows/choosing-what-your-workflow-does/accessing-contextual-information-about-workflow-runs#vars-context)
- branch触发的env
```
GITHUB_WORKSPACE=/root/actions-runner/_work/ci-cd-demo/ci-cd-demo
NODE_TLS_REJECT_UNAUTHORIZED=0
NVM_INC=/root/.nvm/versions/node/v20.18.0/include/node
no_proxy=localhost,shao.sh,shao.shlg,shao.lx,github.shao.sh,aliyun.com,tuna.tsinghua.edu.cn
WORKFLOW_VAR=the variable value from workflow
GITHUB_PATH=/root/actions-runner/_work/_temp/_runner_file_commands/add_path_8a871f5d-e34e-4dae-b164-334608569619
GITHUB_ACTION=__run_2
GITHUB_RUN_NUMBER=25
RUNNER_NAME=ub-9201
GITHUB_REPOSITORY_OWNER_ID=168
GITHUB_TRIGGERING_ACTOR=ssz
GITHUB_REF_TYPE=branch
env_var=
***
GITHUB_REPOSITORY_ID=377
GITHUB_ACTIONS=true
SYSTEMD_EXEC_PID=668417
GITHUB_SHA=cb06150c86731a4d7005ea47e500184168ca9b8a
GITHUB_WORKFLOW_REF=SszOrg/ci-cd-demo/.github/workflows/ci.yml@refs/heads/main
RUNNER_ENVIRONMENT=self-hosted
BASH=/usr/bin/bash
GITHUB_REF=refs/heads/main
RUNNER_OS=Linux
GITHUB_REF_PROTECTED=false
HOME=/root
GITHUB_API_URL=https://github.shao.sh/api/v3
LANG=C.UTF-8
RUNNER_TRACKING_ID=github_488a18b8-3e1d-4f3d-abc4-61679b1a10bf
RUNNER_ARCH=X64
RUNNER_TEMP=/root/actions-runner/_work/_temp
GITHUB_STATE=/root/actions-runner/_work/_temp/_runner_file_commands/save_state_8a871f5d-e34e-4dae-b164-334608569619
https_proxy=http://192.168.50.34:10811
GITHUB_ENV=/root/actions-runner/_work/_temp/_runner_file_commands/set_env_8a871f5d-e34e-4dae-b164-334608569619
GITHUB_EVENT_PATH=/root/actions-runner/_work/_temp/_github_workflow/event.json
INVOCATION_ID=f7a2df63ee124a32a108ce098b2c3f6f
GITHUB_EVENT_NAME=push
GITHUB_RUN_ID=128919
GITHUB_STEP_SUMMARY=/root/actions-runner/_work/_temp/_runner_file_commands/step_summary_8a871f5d-e34e-4dae-b164-334608569619
GITHUB_ACTOR=ssz
NVM_DIR=/root/.nvm
GITHUB_RUN_ATTEMPT=1
GITHUB_GRAPHQL_URL=https://github.shao.sh/api/graphql
NO_PROXY=localhost,shao.sh,shao.shlg,shao.lx,github.shao.sh,aliyun.com,tuna.tsinghua.edu.cn
RUNNER_ALLOW_RUNASROOT=1
GITHUB_SERVER_URL=https://github.shao.sh
SHLVL=3
NVM_CD_FLAGS=
HTTPS_PROXY=http://192.168.50.34:10811
HTTP_PROXY=http://192.168.50.34:10811
GITHUB_ACTOR_ID=4
RUNNER_TOOL_CACHE=/root/actions-runner/_work/_tool
http_proxy=http://192.168.50.34:10811
GITHUB_WORKFLOW_SHA=cb06150c86731a4d7005ea47e500184168ca9b8a
GITHUB_REF_NAME=main
GITHUB_JOB=build
GITHUB_REPOSITORY=SszOrg/ci-cd-demo
GITHUB_RETENTION_DAYS=90
JOURNAL_STREAM=8:2152258
RUNNER_WORKSPACE=/root/actions-runner/_work/ci-cd-demo
XDG_DATA_DIRS=/usr/local/share:/usr/share:/var/lib/snapd/desktop
GITHUB_ACTION_REPOSITORY=
PATH=/root/.nvm/versions/node/v20.18.0/bin:/usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/bin:/snap/bin
GITHUB_BASE_REF=
CI=true
ImageOS=ubuntu20
GITHUB_REPOSITORY_OWNER=SszOrg
GITHUB_HEAD_REF=
NVM_BIN=/root/.nvm/versions/node/v20.18.0/bin
GITHUB_ACTION_REF=
GITHUB_WORKFLOW=CI
GITHUB_OUTPUT=/root/actions-runner/_work/_temp/_runner_file_commands/set_output_8a871f5d-e34e-4dae-b164-334608569619
```
- tag触发的env
```
GITHUB_WORKSPACE=/root/actions-runner/_work/ci-cd-demo/ci-cd-demo
NODE_TLS_REJECT_UNAUTHORIZED=0
NVM_INC=/root/.nvm/versions/node/v20.18.0/include/node
no_proxy=localhost,shao.sh,shao.shlg,shao.lx,github.shao.sh,aliyun.com,tuna.tsinghua.edu.cn
WORKFLOW_VAR=the variable value from workflow
GITHUB_PATH=/root/actions-runner/_work/_temp/_runner_file_commands/add_path_419e58a1-8d99-45fe-bcbd-14e1bb941c65
GITHUB_ACTION=__run_2
GITHUB_RUN_NUMBER=26
RUNNER_NAME=ub-9201
GITHUB_REPOSITORY_OWNER_ID=168
GITHUB_TRIGGERING_ACTOR=ssz
GITHUB_REF_TYPE=tag
env_var=
***
GITHUB_REPOSITORY_ID=377
GITHUB_ACTIONS=true
SYSTEMD_EXEC_PID=668417
GITHUB_SHA=dcae11c8d75ac66ad49c9aa2a27d1ff43a345987
GITHUB_WORKFLOW_REF=SszOrg/ci-cd-demo/.github/workflows/ci.yml@refs/tags/v0.2.0
RUNNER_ENVIRONMENT=self-hosted
BASH=/usr/bin/bash
GITHUB_REF=refs/tags/v0.2.0
RUNNER_OS=Linux
GITHUB_REF_PROTECTED=false
HOME=/root
GITHUB_API_URL=https://github.shao.sh/api/v3
LANG=C.UTF-8
RUNNER_TRACKING_ID=github_aae91ee7-25fe-4c1d-b4e8-75bb8ce1d1f6
RUNNER_ARCH=X64
RUNNER_TEMP=/root/actions-runner/_work/_temp
GITHUB_STATE=/root/actions-runner/_work/_temp/_runner_file_commands/save_state_419e58a1-8d99-45fe-bcbd-14e1bb941c65
https_proxy=http://192.168.50.34:10811
GITHUB_ENV=/root/actions-runner/_work/_temp/_runner_file_commands/set_env_419e58a1-8d99-45fe-bcbd-14e1bb941c65
GITHUB_EVENT_PATH=/root/actions-runner/_work/_temp/_github_workflow/event.json
INVOCATION_ID=f7a2df63ee124a32a108ce098b2c3f6f
GITHUB_EVENT_NAME=workflow_dispatch
GITHUB_RUN_ID=128929
GITHUB_STEP_SUMMARY=/root/actions-runner/_work/_temp/_runner_file_commands/step_summary_419e58a1-8d99-45fe-bcbd-14e1bb941c65
GITHUB_ACTOR=ssz
NVM_DIR=/root/.nvm
GITHUB_RUN_ATTEMPT=1
GITHUB_GRAPHQL_URL=https://github.shao.sh/api/graphql
NO_PROXY=localhost,shao.sh,shao.shlg,shao.lx,github.shao.sh,aliyun.com,tuna.tsinghua.edu.cn
RUNNER_ALLOW_RUNASROOT=1
GITHUB_SERVER_URL=https://github.shao.sh
SHLVL=3
NVM_CD_FLAGS=
HTTPS_PROXY=http://192.168.50.34:10811
HTTP_PROXY=http://192.168.50.34:10811
GITHUB_ACTOR_ID=4
RUNNER_TOOL_CACHE=/root/actions-runner/_work/_tool
http_proxy=http://192.168.50.34:10811
GITHUB_WORKFLOW_SHA=dcae11c8d75ac66ad49c9aa2a27d1ff43a345987
GITHUB_REF_NAME=v0.2.0
GITHUB_JOB=build
GITHUB_REPOSITORY=SszOrg/ci-cd-demo
GITHUB_RETENTION_DAYS=90
JOURNAL_STREAM=8:2152258
RUNNER_WORKSPACE=/root/actions-runner/_work/ci-cd-demo
XDG_DATA_DIRS=/usr/local/share:/usr/share:/var/lib/snapd/desktop
GITHUB_ACTION_REPOSITORY=
PATH=/root/.nvm/versions/node/v20.18.0/bin:/usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/bin:/snap/bin
GITHUB_BASE_REF=
CI=true
ImageOS=ubuntu20
GITHUB_REPOSITORY_OWNER=SszOrg
GITHUB_HEAD_REF=
NVM_BIN=/root/.nvm/versions/node/v20.18.0/bin
GITHUB_ACTION_REF=
GITHUB_WORKFLOW=CI
GITHUB_OUTPUT=/root/actions-runner/_work/_temp/_runner_file_commands/set_output_419e58a1-8d99-45fe-bcbd-14e1bb941c65
```
