
# pycli 命令行

## code test

code sample

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format
- boolean -e, --explorer: route to explorer
- string -, --passwd: undefined argument

## code hpe-proxy

在HPE内网的机器设置代理，包括npm, git(ssh)
HPE的代理自动band一些域名包括de.vicp.net,所以需要每隔一段时间同步一下
set git and npm proxy in hpe network

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format
- string -i, --ip: the ip of de.vicp.net, if none, auto detect it

## code gitsave

show the committed files

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format
- string -c, --commit_id: parse change file in commit id
- string -c, --commit-id: parse change file in commit id

## code gitlog

git log to search keyword

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format
- string -k, --keyword: search keyword use git log
- string -u, --until: until date use git log
- boolean -i, --ignore: ignore case
- boolean -s, --summary: compact summary
- string -a, --author: by author

## code vscode

同步本地编译的vscode插件到运行时
相关配置
SH_HOME: 环境变量用来确认git\app的路径,从而找到vscode plugin源代码路径
sync vscode plugin to .vscode extends

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format
- string -n, --name: extension name, [shell,ium]

## code autonum

auto generate text into file

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format
- string -, --num: undefined argument

## code charts

在周浦和兰溪,可用通过设置网关的路由来解决,不需要这个命令, 只应用于临港
相关配置文件
sample.yaml:    sh/etc/install.sample.yaml
runtime.yaml:   ${hostname}/etc/charts.install.runtime.yaml
create a helm charts project, please add --created for workaround to identity external charts

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format
- string -n, --name: short name
- string -p, --namespace: namespace
- string -l, --lifecycle: lifecycle [preinstall,predelete,postinstall,postdelete,test]
- boolean -c, --config: have init config
- boolean -s, --storage: have storage
- boolean -t, --tcp: have tcp port
- boolean -o, --hostPath: have hostPath
- boolean -, --created: undefined argument

## code log

generate log configuration

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format

## code show

print shortcut lists in console

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format

## code print

print shortcut lists in console

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format

## code cat

print shortcut lists in console

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format

## code more

print shortcut lists in console

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format

## code list

print shortcut lists in console

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format

## code route

explorer full_path or console full_path

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format
- string -n, --name: short name
- boolean -e, --explorer: route to explorer
- boolean -g, --greedy: match more key

## code python-plugin

create new plugin project for python extension

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format
- string -n, --remote: remote host folder, e.g. /sh/private
- string -n, --name: plugin name

## code linux-plugin

生成linux plugin文件
相关配置文件
sample.yaml:    sh/etc/linux.template.sample.yaml
runtime.yaml:   ${hostname}/etc/linux.template.runtime.yaml
create new plugin project for linux extension, please cd linux lib folder(k8s,kernal)

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format
- string -n, --name: plugin name, in plugin or cli for linux entension, use simple name, e.g. "plugin1"

## code linux-lib

create new lib project for linux extension

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format
- string -n, --name: plugin name, in plugin or cli for linux entension, use simple name, e.g. "plugin1"

## code linux-cli

create new cli project for linux extension, please ensure the folder to create extension

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format
- string -n, --name: plugin name, in plugin or cli for linux entension, use simple name, e.g. "plugin1"

## code npmrc

create npmrc

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format
- string -n, --name: npmrc type [ssz,snap], e.g. ssz

## code ps-sql2java

ddl sql to java files
相关配置文件
sample.yaml:    sh/etc/java.template.sample.yaml
runtime.yaml:   ${hostname}/etc/java.template.runtime.yaml
generate java datamodel from DDL sql

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format
- boolean -l, --local_template: use local doc-template to replace http
- boolean -l, --local-template: use local doc-template to replace http

## code ps-yaml2java

ddl sql to java files
相关配置文件
sample.yaml:    sh/etc/java.template.sample.yaml
runtime.yaml:   ${hostname}/etc/java.template.runtime.yaml
generate java datamodel from DDL sql

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format
- boolean -l, --local_template: use local doc-template to replace http
- boolean -l, --local-template: use local doc-template to replace http

## code ps-db2sql

database scripts to ddl sql
相关配置文件
sample.yaml:    sh/etc/db.install.sample.yaml
runtime.yaml:   ${hostname}/etc/db.install.runtime.yaml
generate DDL sql from database script from power designer

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format
- boolean -l, --local_template: use local doc-template to replace http
- boolean -l, --local-template: use local doc-template to replace http

## code maven

创建maven project
相关配置文件
sample.yaml:    sh/etc/maven.template.sample.yaml
runtime.yaml:   ${hostname}/etc/maven.template.runtime.yaml
generate maven project

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format
- string -t, --type: type[common/no-dependence, common/bo, common/protocol, common/client, common/server, common/dao, common/dao-jdbc-base, common/bo-pmapi, common/app-module-base-service, common/rest-simulator-base]
- boolean -l, --local_template: use local doc-template to replace http
- boolean -l, --local-template: use local doc-template to replace http
- string -a, --package: package name, e.g. com.nn.ps.datamodel
- string -s, --solution_package: solution package name, e.g. com.nn.ps
- string -s, --solution-package: solution package name, e.g. com.nn.ps
- string -p, --project: project name, e.g. bo-mqtt

## code maven-new-release

update pom.xml to release product, the change should been commit to git repository
the version information is stored in release.maven.version_pom_file
相关配置文件
scm.yaml:       ${WORKSPACE}/build/scm.yaml
sample.yaml:    sh/etc/maven.template.sample.yaml
runtime.yaml:   ${hostname}/etc/maven.template.runtime.yaml
release maven project, remove snapshot then deploy

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format
- boolean -m, --major: inc major version
- boolean -i, --minor: inc minor version
- boolean -p, --patch: inc patch version

## code maven-update-release-version

update pom.xml to release product, the change should not been commit to git repository
the version information is stored in release.maven.version_pom_file
相关配置文件
scm.yaml:       ${WORKSPACE}/build/scm.yaml
sample.yaml:    sh/etc/maven.template.sample.yaml
runtime.yaml:   ${hostname}/etc/maven.template.runtime.yaml
release maven project, remove snapshot then deploy

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format

## code maven-get-release-version

print version, it is used to interact with bash

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format

## code maven-update-deploy-management

the updated pom files is stored in deploy.maven.projects
相关配置文件
scm.yaml:       ${WORKSPACE}/build/scm.yaml
sample.yaml:    sh/etc/maven.template.sample.yaml
runtime.yaml:   ${hostname}/etc/maven.template.runtime.yaml
update deploy information in pom.xml

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format
- boolean -m, --modules: update deploy plugin in modules pom xml

## code maven-invoke-deploy

the deployed pom files is stored in deploy.maven.projects
相关配置文件
scm.yaml:       ${WORKSPACE}/build/scm.yaml
sample.yaml:    sh/etc/maven.template.sample.yaml
runtime.yaml:   ${hostname}/etc/maven.template.runtime.yaml
invoke maven deploy

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format

## code maven-jupiter-test

更新pom文件
相关配置文件
sample.yaml:    sh/etc/maven.template.sample.yaml
runtime.yaml:   ${hostname}/etc/maven.template.runtime.yaml
update maven dependencies for jupiter test

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format

## code maven-log4j-scope-compile

检查需要部署的进程项目,确保log4j的scope是compile,默认是test
相关配置文件
sample.yaml:    sh/etc/maven.template.sample.yaml
runtime.yaml:   ${hostname}/etc/maven.template.runtime.yaml
update log4j scope to compile, it is used in runtime project

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format

## code solution

创建solution
相关配置文件
sample.yaml:    sh/etc/maven.template.sample.yaml
runtime.yaml:   ${hostname}/etc/maven.template.runtime.yaml
generate a solution

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format
- string -t, --type: type[db]
- boolean -l, --local_template: use local doc-template to replace http
- boolean -l, --local-template: use local doc-template to replace http
- string -p, --package: solution package name, e.g. com.nn.ps
- string -n, --name: solution name, e.g. power station
- string -a, --abbreviation: solution abbreviation name, e.g. ps

## code misc

创建其它Meta Info
相关配置文件
sample.yaml:    sh/etc/maven.template.sample.yaml
runtime.yaml:   ${hostname}/etc/maven.template.runtime.yaml
generate misc information

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format
- string -t, --type: type[solution/foo, solution/meta, solution/mkdoc]
- boolean -l, --local_template: use local doc-template to replace http
- boolean -l, --local-template: use local doc-template to replace http

## code react

创建solution
相关配置文件
sample.yaml:    sh/etc/maven.template.sample.yaml
runtime.yaml:   ${hostname}/etc/maven.template.runtime.yaml
generate a react project

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format
- string -t, --type: type[demo, studio-web, node-ts-module]
- boolean -l, --local_template: use local doc-template to replace http
- boolean -l, --local-template: use local doc-template to replace http
- string -a, --abbreviation: solution abbreviation name, e.g. ps
- string -d, --desc: project desc

## code json2java

database scripts to ddl sql
相关配置文件
sample.yaml:    sh/etc/db.install.sample.yaml
runtime.yaml:   ${hostname}/etc/db.install.runtime.yaml
generate java code from json format data, include DDL

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format
- string -, --branch: undefined argument

## code chocolatey

生成chocolate package
相关配置文件
sample.yaml:    sh/etc/nuget.template.sample.yaml
runtime.yaml:   ${hostname}/etc/nuget.template.runtime.yaml
generate nuget chocolate package

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format
- string -t, --template: template[lifecycle,simple]
- string -n, --name: package name, e.g. ssz.idea64
- string -m, --module: module name [base,dev,env], e.g. base
- boolean -, --current_folder: undefined argument

## code only-diff

remove all same files, only persist diff files

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format
- string -s, --src: src foler name
- string -t, --target: target folder name

## deploy hello

please put entry function into top, and hello function in the top 1
generate eclipse projecct for ops, please sure the current folder is web-console

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format
- boolean -d, --debug: enable/disable debug, boolean type sample
- string -n, --name: foo name, data passed sample
- string -n, --name-type: foo name, data passed sample

## deploy mvn

编译mvn项目
相关配置文件
sample.yaml:    sh/etc/build.install.sample.yaml
runtime.yaml:   ${hostname}/etc/build.install.runtime.yaml
build project use mvn

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format
- boolean -s, --source: source:jar
- boolean -j, --jdk8: use jdk8 to build
- boolean -b, --nobuild: skip build
- string -p, --pom: -f pom.xml

## deploy ium

build project use ant for ium, current folder must be in siu or it's sub folder

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format
- boolean -d, --dry_run: dry run
- boolean -d, --dry-run: dry run
- boolean -d, --norun: dry run
- string -r, --branch: branch 90_cpe, build which branch
- string -t, --target: ant target[package.plugin]

## deploy opsclear

clear the unused class for ops console

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format
- string -r, --branch: branch 90_cpe, build which branch

## deploy opswar

build war for ops console, current folder must be in siu or it's sub folder

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format
- boolean -d, --dry_run: dry run
- boolean -d, --dry-run: dry run
- boolean -d, --norun: dry run
- boolean -t, --git: back to git repo and deploy to cloud
- string -r, --branch: branch 90_cpe, build which branch

## deploy pushopswar

after build war for ops console, push war to remote server

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format
- string -r, --branch: branch 90_cpe, build which branch
- string -u, --user: user name in remote
- string -n, --host: hostname or ip

## deploy ciswar

build war for cis ui, current folder must be in siu or it's sub folder

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format
- boolean -d, --dry_run: dry run
- boolean -d, --dry-run: dry run
- boolean -d, --norun: dry run
- boolean -t, --git: back to git repo and deploy to cloud
- string -r, --branch: branch 90_cpe, build which branch

## deploy pushciswar

after build war for ops console, push war to remote server

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format
- string -r, --branch: branch 90_cpe, build which branch
- string -u, --user: user name in remote
- string -n, --host: hostname or ip

## deploy gwt

build gwt sdk, current folder don't care, read from install.runtime.yaml

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format
- string -r, --branch: which gwt branch to compile, [2.9.0,master]

## deploy plugins

build ium plugins for ops cloud poc, current folder must be in siu or it's sub folder

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format
- boolean -t, --git: back to git repo and deploy to cloud
- string -r, --branch: branch 90_cpe, build which branch

## deploy only

just deploy file skip build

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format

## deploy demo

just demo, present the args

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format
- string -r, --branch: demo branch,any char
- string -, --total_type: demo total,any char
- string -, --total: demo total,any char
- string -, --total-type: demo total,any char
- string -m, --module: demo module,any char

## deploy npmlink

sync yaml-antd* module to studio-web/node_modules

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format
- boolean -l, --npmlink: use npmlink or js
- string -v, --version: version like 10.1
- string -m, --module: module name like rtc
- string -r, --branch: sync which npm package like antd

## deploy rtp

build rtp studio and deploy, git=True means to deploy to colud

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format

## deploy rtc

build rtc studio and deploy, git=True means to deploy to colud

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format
- boolean -b, --nobuild: skip build
- boolean -l, --npmlink: use npmlink or js
- string -v, --version: version like 10.1
- string -m, --module: module name like rtc
- boolean -w, --web: build react web
- boolean -k, --backend: build total backend for dependency
- boolean -t, --git: back to git repo and deploy to cloud

## deploy dns

reset dns in home

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format

## deploy hpe

在周浦和兰溪,可用通过设置网关的路由来解决,不需要这个命令, 只应用于临港
相关配置文件
sample.yaml:    sh/etc/install.sample.yaml
runtime.yaml:   ${hostname}/etc/install.runtime.yaml
set the route to hpe

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format
- boolean -p, --pulse: use pulse as client, limit localhost to access hpe network
- string -e, --env: special the env key workd,[hpe,hpe-private,home,shlg,lanxi], limit localhost to access hpe network

## deploy arp-ingress

set static arp for ingress in multiple server

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format
- string -e, --env: special the env key workd,[hpe,hpe-private,home,shlg,lanxi], limit localhost to access hpe network

## deploy sync

sync file between src and target

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format
- string -s, --src: src folder
- string -t, --target: target folder
- string -i, --include: include sync folder/file template
- string -e, --exclude: exclude sync folder/file template
- boolean -r, --recursive: search all child folder
- boolean -v, --verbose: show detail infomation
- boolean -m, --mirror: target mirror src

## deploy pushiumcli

from ~/.ium folder to parse B.xxx.yaml, and bundle ium cli xml file and load to nginx server

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format

## deploy patch

patch to SIU installation, name=src, branch=91/92/103/104

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format
- string -r, --branch: branch 90_cpe, build which branch

## deploy clone

git clone from exist repo, minium disk usage""

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format
- string -r, --branch: new branch name
- string -n, --reponame: by git repo name
- string -, --repo_name: undefined argument

## deploy batch

run scripts in some servers, params must include ""

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format
- string -p, --params: additional parameters in scripts
- string -n, --name: by name

### deploy batch rtc10 build

build rtc 10

- --PCFVER: 2.0.1
- --SNAPRELINFO: PCF-2.0.1-1
- --RTC_HOME: C:\github\next-10
- --MVN_CMD: mvn clean install -Dmaven.test.skip=true -Dproject.release.info="SNAP-RTC-10.0.0-1" -Dbundle.version="10.0.0"

### deploy batch pcf201 build

build rtc 10

- --PCFVER: 2.0.1
- --SNAPRELINFO: PCF-${PCFVER}-1
- --RTC_HOME: ${CURRENT_BRANCH}
- --RTC_HOME1: C:\github\next-pcrf-2.0
- --MVN_CMD: mvn clean install -Dmaven.test.skip=true -Dproject.release.info="${SNAPRELINFO}" -Dbundle.version="${PCFVER}"

### deploy batch credential

use gpg to encrypt creditial files

- --disableErrorExit: true
- --credentialStoredFolder: C:\usr\ssz\workspace\git\app\credential\ssz
- --pathBasename: ::func os.path.basename src

### deploy batch restore env

restore env

- --disableErrorExit: true

### deploy batch backup env

backup env of some software, for example openssh

- --disableErrorExit: true
- --scmProfile: C:\usr\ssz\workspace\git\app\scm-backup
- --backupLevel: 10

### deploy batch backup ide

backup config of some software, for example secureCRT

- --disableErrorExit: true
- --gitProfile: D:\git\SynologyDrive
- --scmProfile: C:\usr\ssz\workspace\git\app\scm-backup
- --remote: notexists
- --backupLevel: 10

### deploy batch enable root

enable root user in remote, --params "remote=ip" is mandatory

- --scriptFolder: D:/usr/codes/git/common/build/installation/sh/runtime/snap/ssz.host/kernal
- --remote: notexists

### deploy batch git checkout

from old branch checkout to new branch, all untagged file will be removed

- --bn: None

### deploy batch sync rpm files

sync rpm files between ssz1 and nas246

- --repoFolder: /app/backup/repository
- --repo: elrepo-kernel-archive
- --tmpFolder: D:\usr\tmp\rpmRepo

### deploy batch sync ops files

sync eium install file between ssz1 and nas246

- --pluginFolder: C:\git\next-10.5-dev\siu\plugins\com.hp.usage.opsmodel\build
- --jarFolder: C:\git\next-10.5-dev\siu\apps\web\ops-ui\build

### deploy batch sync tools

sync tools between ssz1 and nas246

- --localFolder: D:\usr\cache\unused
- --remoteFolder: /app/backup/repository/tools
- --file: helm-push_0.8.1_linux_amd64.tar.gz

### deploy batch sync eium files

sync eium install file between ssz1 and nas246

- --srcRemote: 10.43.173.40
- --targetRemote: 192.168.50.246

### deploy batch migrate charts

update selected chart into registry

- --worker: D:\usr\tmp
- --ver: 0.2.3
- --usr: ******
- --pw: ******
- --pn: moco
- --cp: hpe
- --registry: registry.shao.sh
- --registryHPE: router-k2p01.asiapacific.hpqcorp.net

### deploy batch push charts

update selected chart into registry

- --worker: D:\usr\tmp
- --ver: 0.1.0
- --usr: ******
- --pw: ******
- --pn: eium-mysql
- --cp: google_containers
- --tar: true
- --chartmuseum: registry.shao.sh:38080
- --registry: registry.shao.sh
- --registryLanxi: registry.shao.lx
- --registryShlg: registry.shao.shlg
- --registryHPE: router-k2p01.asiapacific.hpqcorp.net

### deploy batch public helm charts

update kubernetes-dashboard to latest version

- --worker: C:\usr\ssz\workspace\git\app\scm\unknown\charts
- --ver: 4.0.0
- --pn: kubernetes-dashboard
- --cp: kubernetesui
- --repo: kubernetes-dashboard
- --subPath: a\b\c
- --from: external
- --basename: ::func os.path.basename subPath
- --url: https://kubernetes.github.io/dashboard/
- --flow: repo

### deploy batch kube-prometheus

update jaeger to latest version

- --pn: ssz-kube-prometheus-manifests
- --folder: C:\usr\ssz\workspace\git\pub\kube-prometheus

### deploy batch jaeger

update jaeger to latest version

- --ver: 0.46.5
- --pn: jaeger
- --cp: jaegertracing
- --flow: repo
- --repo: jaegertracing
- --url: https://jaegertracing.github.io/helm-charts

### deploy batch jaeger operator

update jaeger to latest version

- --ver: 2.23.0
- --pn: jaeger-operator
- --cp: jaegertracing
- --flow: repo
- --repo: jaegertracing
- --url: https://jaegertracing.github.io/helm-charts

### deploy batch nfs-subdir-external-provisioner

update nfs-subdir-external-provisioner to latest version

- --ver: 4.0.16
- --pn: nfs-subdir-external-provisioner
- --cp: google_containers
- --flow: curl
- --url: https://github.com/kubernetes-sigs/nfs-subdir-external-provisioner/releases/download/nfs-subdir-external-provisioner-${ver}/nfs-subdir-external-provisioner-${ver}.tgz

### deploy batch kubernetes-dashboard

update kubernetes-dashboard to latest version

- --ver: 6.0.7
- --pn: kubernetes-dashboard
- --cp: kubernetesui
- --repo: kubernetes-dashboard
- --flow: repo
- --url: https://kubernetes.github.io/dashboard/

### deploy batch helm elastic

update elastic helm charts to latest version

- --worker: C:\usr\ssz\workspace\git\app\scm\unknown\charts
- --ver: 7.17.3
- --pn: elasticsearch
- --cp: docker.io
- --repo: elastic
- --proxy: http://16.153.99.11:8080
- --url: https://github.com/elastic/helm-charts/archive/refs/tags/v${ver}.tar.gz

### deploy batch bitnami-redis

redis to latest version

- --ver: 12.7.4
- --pn: redis
- --cp: bitnami
- --flow: repo
- --repo: bitnami
- --url: https://charts.bitnami.com/bitnami

### deploy batch local-static-provisioner

update local-static-provisioner to latest version

- --worker: C:\usr\ssz\workspace\github
- --ver: 2.5.0
- --pn: local-static-provisioner
- --cp: google_containers
- --flow: git
- --subPath: sig-storage-local-static-provisioner\helm\provisioner
- --url: https://github.com/kubernetes-sigs/sig-storage-local-static-provisioner.git

### deploy batch nfs-subdir-external-provisioner3

update ingress-nginx to latest version

- --worker: D:\usr\tmp
- --image: k8s.gcr.io/ingress-nginx/controller:v0.44.0
- --hpe: 10.43.173.10
- --home: 192.168.50.15
- --ver: 4.0.12
- --usr: ******
- --pw: ******
- --pn: nfs-subdir-external-provisioner
- --registry: registry.shao.sh
- --registryHPE: router-k2p01.asiapacific.hpqcorp.net

### deploy batch ingress nginx

update ingress-nginx to latest version

- --pn: ingress-nginx
- --cp: google_containers
- --ver: 4.6.1
- --flow: curl
- --url: https://github.com/kubernetes/ingress-nginx/releases/download/helm-chart-${ver}/ingress-nginx-${ver}.tgz

### deploy batch mysql ndb operator

update mysql-ndb-operator to latest version

- --ver: 0.2.0
- --pn: ndb-operator
- --cp: hpe
- --flow: repo
- --repo: hpe
- --url: https://mysql.github.io/mysql-ndb-operator/

### deploy batch mysql operator

update kubernetes-dashboard to latest version

- --ver: 2.0.4
- --pn: mysql-operator
- --cp: hpe
- --flow: repo
- --repo: hpe
- --url: https://mysql.github.io/mysql-operator/

### deploy batch mysql innodbcluster

update mysql innodbcluster to latest version

- --ver: 2.0.4
- --pn: mysql-innodbcluster
- --cp: hpe
- --flow: repo
- --repo: hpe
- --url: https://mysql.github.io/mysql-operator/

### deploy batch mysql moco

update mysql moco to latest version

- --ver: 0.2.3
- --pn: moco
- --cp: hpe
- --flow: repo
- --repo: hpe
- --url: https://cybozu-go.github.io/moco/

### deploy batch scp test

scp image into local disk

- --imagesFolder: D:\usr\codes\git\common\build\installation\sh\runtime\ssz1\app-backup-images
- --image: mysql:latest

### deploy batch wlnmp

scp image into local disk

- --worker: D:\usr\tmp
- --folder: /volume1/shared/repository/8
- --repo: wlnmp
- --target: /app/backup/repository/8

### deploy batch docker pull images

docker pull images in resources and upload to nas246

- --imagesFolder: D:\usr\codes\git\common\build\installation\sh\runtime\snap\ssz1\app-backup-images
- --image: nginx:latest
- --linuxTarFile: ::func docker_linux_tar_file

### deploy batch sync eium images

sync k8s images in resources.asiapacific.hpqcorp.net and upload to nas246.shao.sh

- --registry: mpc-docker.gre.hpecorp.net/eium

### deploy batch sync k8s images

sync k8s images in ssz1 and upload to nas246

- --registry: registry.shao.sh/google_containers

### deploy batch sync k8s plugins

sync k8s dashboard images in ssz1 and upload to nas246


### deploy batch sync secret

sync ms cluster secret to bastion or k8s master

- --srcFolder: C:\usr\ssz\workspace\git\app\common\build\installation\sh\runtime\linux-bash\common\k8s\secret\home
- --remote: /sh/private/k8s/secret
- --host: k8s-9m1.shao.sh

### deploy batch sync webapp charts

sync eium umbrella chart to bastion or k8s master

- --chartFolder: C:\git\eium-cloudnative\helm\example\charts
- --host: k8s-4i1.shao.sh

### deploy batch sync one charts

sync eium one umbrella chart to bastion or k8s master

- --chartFolder: C:\usr\ssz\workspace\git\app\scm\unknown\charts\eium-solutions
- --host: k8s-9i1.shao.sh

### deploy batch push promethus-community charts

cm push the following charts into registry.shao.sh, charts from https://github.com/prometheus-community/helm-charts.git

- --chartFolder: C:\usr\ssz\workspace\git\github\promethus-community-helm-charts\charts

### deploy batch push mongodb-community charts

cm push the following charts into registry.shao.sh, charts from https://github.com/mongodb/helm-charts.git

- --chartFolder: C:\usr\ssz\workspace\git\github\mongodb-helm-charts\charts

### deploy batch sync ssz charts

sync ssz umbrella chart to bastion or k8s master

- --chartFolder: C:\usr\ssz\workspace\git\app\scm\unknown\charts\ssz-solutions
- --host: k8s-9i1.shao.sh

### deploy batch push plugin charts

push plugin for ms cluster into harbo

- --chartFolder: C:\usr\ssz\workspace\git\app\scm\unknown\charts

### deploy batch git reset after release

reset integration branch after release with check out and no commit

- --worker: D:\usr\tmp

### deploy batch sync okd secret

sync okd secret files into bastion

- --secretFolder: D:\git\SynologyDrive\shared\software\job\okd
- --type: ocp
- --host: ocp4-1i1.shao.shlg

### deploy batch ksar

copy ca root private key to /tmp/ca in host and publish certificates

- --folder: C:\usr\ssz\workspace\git\app\github\ksar
- --deployFolder: C:\usr\pfs\kSar-5.0.6
- --host: nas234.shao.lx

### deploy batch publish certificates by ca key

copy ca root private key to /tmp/ca in host and publish certificates

- --caFolder: D:\git\CloudStation\shared\software\certificate\ssz
- --host: nas234.shao.lx

### deploy batch install okd

install okd from bastion and kvm

- --kvm: ssz2.ssz.hpqcorp.net
- --cluster: ocp4-5i1
- --type: ocp
- --master: 192.168.58.17
- --domain: ::func domain kvm
- --bastion: ${cluster}.${domain}

### deploy batch pull dashboard kubeconfig

pull dashboard kubeconfig from bastion or k8s master

- --kubeconfigFolder: D:\git\SynologyDrive\shared\backup\k8s
- --host: k8s-4ipv6.shao.sh

### deploy batch power

change bare metal power save mode

- --user: root
- --eco: 0

### deploy batch local volumn

set local volumn in host

- --user: root
- --eco: 0

### deploy batch push license portal

deploy license portal

- --password: eIUM-123
- --src: C:\git\ium-license-site\docroot
- --remote: eium@eiumlicense.gre.hpecorp.net:/home/eium/test
- --pathDirname: ::func os.path.dirname folder

### deploy batch license portal

deploy license portal

- --password: eIUM-123
- --src: C:\git\ium-license-site\docroot
- --remote: eium@eiumlicense.gre.hpecorp.net:/home/eium/test
- --pathDirname: ::func os.path.dirname folder

### deploy batch build and push

build plugin and push to server

- --pluginFolder: C:\git\ium-dev\siu\plugins\com.hp.usage.jds
- --host: root@${server}:/opt/SIU_snap/plugins/com.hp.usage.jds_10.7.0
- --format: jds.jar
- --target: none

### deploy batch build patch

build plugin and push to server

- --host: nas246.shao.sh
- --IUM_CODE: C:\git\ium-dev
- --remote: /tmp/loose_patch
- --pluginVersion: 10.7.0
- --target: package.plugin

### deploy batch vilink snap

build plugin and push to server

- --scriptsFolder: C:\usr\ssz\workspace\git\app\common\build\installation\sh\runtime\linux-bash\common
- --host: root@${server}:/opt/SIU_snap/plugins/com.hp.usage.jds_10.7.0
- --format: jds.jar
- --target: none

### deploy batch nexus jar

deploy jar to nexus

- --repo: deploy-releases
- --group: com.mysql.ndb
- --file: clusterj-8.0.29.jar
- --artifact: clusterj
- --ver: 8.0.29
- --url: http://de.vicp.net:58081/repository/maven-releases/
- --settings: C:\usr\ssz\workspace\git\app\common\build\installation\SHAOSHU1\etc\maven\settings.xml

### deploy batch sync ps cfg

sync ps cfg

- --from: C:\usr\ssz\workspace\git\app\power-station\sourcecode\applications\ps-controller\src\main\resources
- --to: C:\usr\ssz\workspace\git\app\scm\snap\ssz1\app-eium-backup-config\toShared\app\ps

### deploy batch sync dsm nginx conf

sync dsm nginx conf

- --to: C:\tools\nginx-1.27.1\conf\conf.d

### deploy batch github upgrade

upgrade github enterprise server to new release

- --crack: C:\usr\ssz\workspace\git\app\scm\..\scm-shared\snap\ssz1\app-eium-backup-config\toShared\app\github\crack
- --domain: github.shao.sh

### deploy batch test func

function unit test

- --kvm: nas249.shao.sh
- --enabled: False
- --cluster: ocp4-9i1
- --subPath: a\b\c
- --type: ocp
- --master: 192.168.50.17
- --worker: 192.168.58.22
- --domain: ::func domain kvm
- --bastion: ${cluster}.${domain}
- --pathDirname: ::func os.path.dirname subPath
- --pathBasename: ::func os.path.basename subPath
- --userProfile: C:\Users\ssz

### deploy batch foreach func

foreach unit test

- --from: C:\usr\ssz\workspace\git\app\power-station\sourcecode\applications\ps-controller\src\main\resources
- --to: C:\usr\ssz\workspace\git\app\scm\snap\ssz1\app-eium-backup-config\toShared\app\ps

## deploy fingerprint

delete fingerprint in known_hosts

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format
- string -n, --host: hostname or ip

## eclipse hello

first extension for eclipse, do some investigation

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format
- string -r, --branch: which branch, sample branch [90/91/92/103/104/105]
- string -a, --alias: the project name of eclipse
- string -m, --meta: relative meta folder

## eclipse ops

创建ops console Dev Meta info for eclipse
相关配置文件
sample.yaml:    sh/etc/eclipse.sample.yaml
runtime.yaml:   ${hostname}/etc/eclipse.runtime.yaml
generate eclipse projecct for ops, please sure the current folder is web-console

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format
- string -r, --branch: which branch, sample branch [90/91/92/103/104/105]
- string -a, --alias: the project name of eclipse
- string -m, --meta: relative meta folder

## eclipse cis

generate eclipse projecct for cis, please sure the current folder is vnfm-ui

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format
- string -r, --branch: which branch, sample branch [90/91/92/103/104/105]
- string -a, --alias: the project name of eclipse
- string -m, --meta: relative meta folder

## eclipse ide.eclipse

generate eclipse projecct for plugins or core, please sure the current folder is web-console

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format
- string -r, --branch: which branch, sample branch [90/91/92/103/104/105]
- string -m, --module_type: module type, enum core or plugins
- string -m, --module-type: module type, enum core or plugins
- string -m, --module: module type, enum core or plugins
- boolean -s, --single_project: single project
- boolean -s, --single-project: single project
- boolean -s, --single: single project

## eclipse opsdebug

use compatible gwt file to replace product, or checkout

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format
- string -r, --branch: which branch, sample branch [90/91/92/103/104/105]
- boolean -d, --debug: copy debug to product, or checkout --

## eclipse license-portal-debug

use compatible gwt file to replace product, or checkout

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format
- boolean -d, --debug: copy debug to product, or checkout --

## eclipse externalium

从远程服务器下载相关的配置信息到c:/delegates, 主要是SIU.ini
相关配置文件
sample.yaml:    sh/etc/eclipse.sample.yaml
runtime.yaml:   ${hostname}/etc/eclipse.runtime.yaml
change config in D disk to connect to external IUM, support EIUM 9.0+

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format
- string -r, --branch: which branch, sample branch [90/91/92/103/104/105]
- string -i, --install_root: local siu install home
- string -i, --install-root: local siu install home
- string -i, --siu-install-root: local siu install home
- string -n, --hostname: ssh hostname, default is eium-5888.ssz.hpqcorp.net
- string -u, --user: ssh user, default is snap[snap,snap90,snap90rogers,snap91,snap91ngr,snap92,snap105,snap106,snap107]
- string -p, --password: ssh password, default is snap

## eclipse ei

从远程服务器下载相关的配置信息到c:/delegates, 主要是SIU.ini
相关配置文件
sample.yaml:    sh/etc/eclipse.sample.yaml
runtime.yaml:   ${hostname}/etc/eclipse.runtime.yaml
change config in D disk to connect to external IUM, support EIUM 9.0+

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format
- string -r, --branch: which branch, sample branch [90/91/92/103/104/105]
- string -i, --install_root: local siu install home
- string -i, --install-root: local siu install home
- string -i, --siu-install-root: local siu install home
- string -t, --app_type: app type,[ops,cis]
- string -t, --app-type: app type,[ops,cis]
- string -t, --web-app-type: app type,[ops,cis]
- string -n, --hostname: ssh hostname, default is eium-5888.ssz.hpqcorp.net
- string -u, --user: ssh user, default is snap[snap,snap90,snap90rogers,snap91,snap91ngr,snap92,snap105,snap106,snap107]
- string -p, --password: ssh password, default is snap

## eclipse runtime

从远程服务器下载相关的配置信息到c:/usr/cache/ium-lib, 主要是LIB目录下的jar
相关配置文件
sample.yaml:    sh/etc/eclipse.sample.yaml
runtime.yaml:   ${hostname}/etc/eclipse.runtime.yaml
sync runtime SIU_LIB from remote ium server, support EIUM 9.0+

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format
- string -r, --branch: which branch, sample branch [90/91/92/103/104/105]
- string -n, --hostname: ssh hostname, default is eium-5888.ssz.hpqcorp.net
- string -u, --user: ssh user, default is snap[snap,snap90,snap90rogers,snap91,snap91ngr,snap92,snap105,snap106,snap107]
- string -p, --password: ssh password, default is snap

## eclipse ri

从远程服务器下载相关的配置信息到c:/usr/cache/ium-lib, 主要是LIB目录下的jar
相关配置文件
sample.yaml:    sh/etc/eclipse.sample.yaml
runtime.yaml:   ${hostname}/etc/eclipse.runtime.yaml
sync runtime SIU_LIB from remote ium server, support EIUM 9.0+

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format
- string -r, --branch: which branch, sample branch [90/91/92/103/104/105]
- string -n, --hostname: ssh hostname, default is eium-5888.ssz.hpqcorp.net
- string -u, --user: ssh user, default is snap[snap,snap90,snap90rogers,snap91,snap91ngr,snap92,snap105,snap106,snap107]
- string -p, --password: ssh password, default is snap

## eclipse test

eclipse test

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format

## eclipse workaround

创建ops console Dev Meta info for eclipse
相关配置文件
sample.yaml:    sh/etc/eclipse.template.sample.yaml
runtime.yaml:   ${hostname}/etc/eclipse.template.runtime.yaml
generate eclipse projecct for ops, please sure the current folder is web-console

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format
- string -t, --type: workaround type,[notest/junit]
- string -t, --workaround-type: workaround type,[notest/junit]
- boolean -r, --recursive: Recursively workaround

## edu hello

please put entry function into top, and hello function in the top 1
generate eclipse projecct for ops, please sure the current folder is web-console

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format
- boolean -d, --debug: enable/disable debug, boolean type sample
- string -n, --name: foo name, data passed sample

## edu prime-factor

素因数分解出题
generate the statement for prime factorization

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format
- string -, --limit: undefined argument
- string -, --count: undefined argument
- string -, --primes: undefined argument

## edu delta-original-core

原分数
generate the original score

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format
- string -, --limit: undefined argument
- string -, --count: undefined argument

## edu commutative-with-core

乘法交换律分数混合计算
generate commutative the with score

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format
- string -, --limit: undefined argument
- string -, --count: undefined argument

## edu sum-original-core

原分数
generate the original score

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format
- string -, --limit: undefined argument
- string -, --count: undefined argument

## edu disjunction

裂项
generate the disjunction score

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format
- string -, --limit: undefined argument
- string -, --count: undefined argument
- string -, --items: undefined argument

## edu with-score-calc

带分数出题
latex占位 https://wenku.baidu.com/view/4cc39f5c59cfa1c7aa00b52acfc789eb172d9ee0.html
generate the statement with score calculation

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format
- string -, --limit: undefined argument
- string -, --demoniate_limit: undefined argument
- string -, --multiple: undefined argument
- string -, --count: undefined argument
- string -, --items: undefined argument
- boolean -, --x: undefined argument

## edu math-to-md

generate the statement with score calculation

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format

## exercise hello-world

hell world for exercise
debug: bool
name: str

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format
- boolean -d, --debug: enable/disable debug, boolean type sample
- string -n, --name: foo name, data passed sample

## exercise log4j



- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format

## exercise ast

ast sample

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format

## exercise cli-long-options



- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format
- boolean -l, --local-template: foo to use local template
- boolean -l, --local_template: foo to use local template
- string -b, --branch: foo branch name

## exercise new-features

please put entry function into top, and hello function in the top 1
generate eclipse projecct for ops, please sure the current folder is web-console

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format

## exercise eval

please put entry function into top, and hello function in the top 1
generate eclipse projecct for ops, please sure the current folder is web-console

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format

## exercise str

generate eclipse projecct for ops, please sure the current folder is web-console

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format

## exercise list

generate eclipse projecct for ops, please sure the current folder is web-console

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format

## exercise dict

generate eclipse projecct for ops, please sure the current folder is web-console

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format

## exercise os

generate eclipse projecct for ops, please sure the current folder is web-console

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format

## exercise type

@dataclass
class Question:
    key_word: str
    statements: str
    question_func: function
generate eclipse projecct for ops, please sure the current folder is web-console

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format

## exercise regexp

generate eclipse projecct for ops, please sure the current folder is web-console

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format

## exercise lib-sql2java

unit test for sql2java

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format

## exercise lib-tssh

generate eclipse projecct for ops, please sure the current folder is web-console

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format

## exercise lib-thpe

generate eclipse projecct for ops, please sure the current folder is web-console

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format

## exercise lib-context

generate eclipse projecct for ops, please sure the current folder is web-console

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format

## exercise lib-ttemplate

junit test for lib ttemplate

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format

## exercise lib-webapp

generate eclipse projecct for ops, please sure the current folder is web-console

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format

## exercise lib-vilink

generate eclipse projecct for ops, please sure the current folder is web-console

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format

## exercise lib-diff

diff test suitcases

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format

## exercise lib-tfile

tfile test suitcases

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format

## exercise lib-code-maven

code-maven test suitcases

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format

## exercise lib-gitlab-api

gitlab-api test suitcases

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format

## exercise lib-cli-opt

cli-opt test suitcases

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format

## exercise cli-undefined-argument

cli undefined argument test suitcases

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format
- string -, --ptest: undefined argument
- string -, --vparam: undefined argument
- boolean -, --bparam: undefined argument

## exercise aggregation

aggregation test suitcases, the name and params are required

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format
- string -p, --params: additional parameters in scripts
- string -n, --name: by name

## exercise func-decorator

cli-opt test suitcases

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format

## exercise unit-test

cli-opt test suitcases

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format

## host show

print hosts file in console

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format

## host print

print hosts file in console

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format

## host cat

print hosts file in console

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format

## host more

print hosts file in console

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format

## host test

print hosts file in console

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format
- string -n, --host: hostname
- string -b, --branch: branch 90_cpe
- boolean -r, --force: force to update

## host enable

ts.pipeline('dir . /s')
add/update a route in hosts

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format
- string -n, --host: hostname
- string -i, --ip: ip

## host disable

disable a route in hosts

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format
- string -n, --host: hostname

## host vscode

生成vscode的相关文件,例如project manager配置
相关配置文件
sample.yaml:    sh/etc/vscode.template.sample.yaml
runtime.yaml:   ${hostname}/etc/vscode.template.runtime.yaml
vscode cfg

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format
- string -b, --branch: branch 90_cpe
- boolean -r, --force: force to update

## host npm

npm install

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format

## host python

python plugins install

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format

## idea hello

first extension for eclipse, do some investigation

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format
- string -r, --branch: which branch, sample branch [90/91/92/103/104/105]
- string -a, --alias: the project name of idea
- string -m, --meta: relative meta folder

## idea module

创建module for idea, 每个workspace都要修改
相关配置文件
sample.yaml:    sh/etc/ide.template.sample.yaml
runtime.yaml:   ${hostname}/etc/ide.template.runtime.yaml
generate idea module file

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format

## idea settings-color

创建color settings for idea, 全局
相关配置文件
sample.yaml:    sh/etc/ide.template.sample.yaml
runtime.yaml:   ${hostname}/etc/ide.template.runtime.yaml
set idea color

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format

## idea settings-keymaps

创建keymaps settings for idea, 全局
相关配置文件
sample.yaml:    sh/etc/ide.template.sample.yaml
runtime.yaml:   ${hostname}/etc/ide.template.runtime.yaml
set idea color

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format

## idea workspace-maven

创建maven settings for idea, 每个workspace都要修改
相关配置文件
sample.yaml:    sh/etc/ide.template.sample.yaml
runtime.yaml:   ${hostname}/etc/ide.template.runtime.yaml
set idea maven in the workspace

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format

## image test

print hosts file in console

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format
- string -n, --host: hostname
- string -b, --branch: branch 90_cpe

## linux hello

please put entry function into top, and hello function in the top 1
generate eclipse projecct for ops, please sure the current folder is web-console

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format
- boolean -d, --debug: enable/disable debug, boolean type sample
- string -n, --name: foo name, data passed sample

## linux new-release

sock = sctp.sctpsocket_tcp(socket.AF_INET)
delete harbor artifacts

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format

## linux update-release-version

release project, remove snapshot then deploy

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format

## linux harbor

delete harbor artifacts

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format
- string -p, --project: project name in harbor, like ms
- string -r, --repository: repository name in harbor, like ms-jdk14-dns-2021d2

## sshcli put

remote: root@ssz1:/root
如果需要目标是文件夹需要设置-r参数,否则会报Permission Error
put file to remote server

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format
- string -l, --local: local path or file
- string -n, --remote: remote path, for example: snap91@ssz1://home/snap91
- boolean -r, --recursive: include sub path
- string -p, --port: remote port, default is 22
- string -, --passwd: password
- string -, --password: password
- string -, --pass-word: password

## sshcli get

get file from remote server

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format
- string -l, --local: local path or file
- string -n, --remote: remote path, for example: snap91@ssz1://home/snap91
- boolean -r, --recursive: include sub path
- string -p, --port: remote port, default is 22
- string -, --passwd: password
- string -, --password: password
- string -, --pass-word: password

## sshcli ssh

ssh cmd in remote server

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format
- string -n, --host: remote server
- boolean -x, --exit: exit 1 if output is not empty
- string -p, --port: remote port, default is 22
- string -u, --usr: user name, default is root
- string -c, --cmd: remote cmd, for example: ls -l /
- string -, --passwd: password
- string -, --password: password
- string -, --pass-word: password

## sshcli test

sample only for test

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format
- string -m, --module: demo module,any char

## vilink monitor

monitor current folder, if file change, vilink push the changed file to remote

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format
- boolean -r, --recursive: recursive if sub folder exists
- string -a, --alias: association name

## vilink push

push file to remote host

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format
- boolean -r, --recursive: recursive if sub folder exists
- string -a, --alias: association name

## vilink push-umbrella

push umbrella chart to remote host

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format
- string -n, --host: -n root@192.168.50.238:/app

## vilink push-file

push file to remote host

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format
- string -n, --host: -n root@192.168.50.238:/app
- string -e, --format: match file extension name

## vilink pull

pull file from remote host

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format
- boolean -r, --recursive: recursive if sub folder exists
- string -a, --alias: association name

## vilink init

create vi link to remote host, use scp to sync file, if the vilink exists, print the detail

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format
- string -n, --host: -n root@192.168.50.238:/app
- string -p, --port: -p 22
- string -i, --identity_file: -i deg-dev-aws.pem
- string -r, --root: -r <root path>
- string -e, --format: match file extension name

## vilink add

add vi link to remote host, use scp to sync file, if the vilink exists, print the detail

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format
- string -e, --format: match file extension name

## vilink remove

remove vi link to remote host, use scp to sync file, if the vilink exists, print the detail

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format
- string -e, --format: match file extension name

## vilink github

clone or update from github

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format
- string -u, --url: https url

## vilink redo

redo the last vilink opteration

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format

## vilink schedule

monitor current folder, if file change, vilink push the changed file to remote

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format
- boolean -d, --daemon: daemon running
- string -o, --host: using the specified host

## vilink check-git-commit

check all repo defined in vilink/job, if have uncommit, commit it

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format
- boolean -c, --commit: automatically commit

## vilink append-content

启动一个python process来执行检查哪些repo的文件里缺少内容,然后补全
相关配置文件
sample.yaml:    sh/etc/install.sample.yaml
runtime.yaml:   ${hostname}/etc/vilink.install.runtime.yaml
check all repo defined in vilink/job, if not include in it, append it

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format
- string -p, --pattern: 模板内容
- string -t, --target: 文件名称

## vilink file-to-utf8

convert file to utf8 encoding, the encoding of original file will be detected automatically

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format
- string -t, --target: 文件名称
- string -e, --encoding: 文件编码

## vilink file-encoding

to detect file encoding

- boolean -h, --help: print help information
- boolean -, --quiet: no log
- string -f, --file: the context file by yaml format
- string -t, --target: 文件名称
