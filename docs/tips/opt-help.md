# Opt 命令行

## `kernal alinux`

manage kinds of docker container

```bash
kernal alinux [options]
```

- hello-world
- option -v, --volume: volume name / iscsi iqn
- upgrade-kernel
- true -n, --name: tool alias

## `kernal almalinux`

manage kinds of docker container

```bash
kernal almalinux [options]
```

- hello-world
- option -v, --volume: volume name / iscsi iqn
- yum-aliyun
- upgrade-kernel
- true -n, --name: tool alias

## `kernal alpinelinux`

manage kinds of docker container

```bash
kernal alpinelinux [options]
```

- hello-world
- option -v, --volume: volume name / iscsi iqn
- apk-aliyun
- upgrade-kernel
- true -n, --name: tool alias

## `kernal anolis`

manage kinds of docker container

```bash
kernal anolis [options]
```

- hello-world
- option -v, --volume: volume name / iscsi iqn
- upgrade-kernel
- true -n, --name: tool alias

## `kernal app`

manage kinds of app

```bash
kernal app [options]
```

- hello-world
- option -v, --volume: volume name / iscsi iqn
- hpe-route
- hpe-gateway
- firefox
- maven
- cockpit-cert
- private-key
- repo-sync
- false -r, --rhel: base rhel repo, centos, fedora, yum install
- false -u, --ubuntu: base ubuntu repo, apt install
- false -d, --debian: base debian repo, apt install
- jmeter
- smart
- sh-service
- swap
- sync-ssz-share
- true -n, --name: tool alias

## `kernal app github`

manage kinds of docker container

```bash
kernal app github [options]
```

- hello-world
- option -v, --volume: volume name / iscsi iqn
- commit
- option -t, --token: github personal access token
- option -p, --file_path_with_repo: file path with repo, e.g. Shao/jenkins-pipeline/src/pipe-update-ssz-public-ip/public_ip.txt
- option -f, --raw_file: raw file, e.g. /root/.jenkins/xxx/src/pipe-update-ssz-public-ip/public_ip.txt
- option -b, --branch: branch name, e.g. master
- option -m, --commit_message: commit message, e.g. public ip
- false -c, --is_github_com: commit to github.com instead github.shao.sh, e.g. --is_github_com
- sync-all-webhooks
- update-issues
- runner
- true -n, --name: tool alias
- true -t, --token: github runner token, expiration after an hour
- option -o, --no: github runner no
- option -w, --owner: github runner owner, ssz or user/repo
- true -n, --name: tool alias

## `kernal app github_issues`

manage kinds of docker container

```bash
kernal app github_issues [options]
```

- hello-world
- option -v, --volume: volume name / iscsi iqn
- true -n, --name: tool alias

## `kernal app gitlab`

manage kinds of docker container

```bash
kernal app gitlab [options]
```

- hello-world
- option -v, --volume: volume name / iscsi iqn
- add-owner
- true -n, --name: tool alias

## `kernal app jenkins`

manage kinds of docker container

```bash
kernal app jenkins [options]
```

- hello-world
- option -v, --volume: volume name / iscsi iqn
- agent-node
- true -n, --name: tool alias

## `kernal app ldap`

manage kinds of docker container

```bash
kernal app ldap [options]
```

- hello-world
- option -v, --volume: volume name / iscsi iqn
- add-user
- true -u, --user: ldap user name
- fork-github-com
- true -u, --url: github.com repository url
- update-repository-about-topic
- true -u, --url: github.com repository url
- update-rat-from-file
- true -f, --file: the file name contains about and topics content
- set-default-branch
- true -u, --url: github.com repository url
- update-issues
- commit
- true -f, --raw_file: the file name to commit
- option -t, --token: the owner of PAT
- true -n, --name: tool alias
- option -u, --url: github.com repository url

## `kernal app metrics`

manage kinds of docker container

```bash
kernal app metrics [options]
```

- hello-world
- option -v, --volume: volume name / iscsi iqn
- node-exporter
- option -m, --master: master node name
- check-sites
- ipinfo-io
- restart-github
- true -n, --name: tool alias
- option -s, --string: generic string type
- false -b, --bool: generic bool type

## `kernal app net`

manage kinds of docker container

```bash
kernal app net [options]
```

- hello-world
- option -v, --volume: volume name / iscsi iqn
- ipset
- public-ip
- true -n, --name: tool alias

## `kernal app npm`

manage kinds of docker container

```bash
kernal app npm [options]
```

- hello-world
- option -v, --volume: volume name / iscsi iqn
- env
- true -n, --name: tool alias

## `kernal app python`

manage kinds of docker container

```bash
kernal app python [options]
```

- hello-world
- option -v, --volume: volume name / iscsi iqn
- env
- cli
- 3-9
- pycli
- scm-python
- true -n, --name: tool alias

## `kernal app router`

manage kinds of docker container

```bash
kernal app router [options]
```

- hello-world
- option -v, --volume: volume name / iscsi iqn
- login
- sync-fqdn
- list-ingress
- hpe_route
- echo-route
- false -a, --all: route all cirs from hpe vpn, instead of snap cirs
- true -e, --env: route all cirs from hpe vpn, instead of snap cirs
- true -n, --name: tool alias

## `kernal app vpn`

manage kinds of docker container

```bash
kernal app vpn [options]
```

- hello-world
- option -v, --volume: volume name / iscsi iqn
- hpe
- true -s, --session: session id
- sh
- shlg
- lanxi
- openvpn-client
- after-start
- sh-monitor-on-shlg
- shvpn-init
- lanxivpn-init
- true -n, --name: tool alias

## `kernal auth`

manage auth in linux host

```bash
kernal auth [options]
```

- hello-world
- nfs-clients
- nfs-white-list
- option -c, --consumer: initiator client hostname
- password-init
- true -s, --store-type: store key in /app/etc/password.properties
- true -p, --password: password to mask
- secret-init
- true -t, --secret-name: store key in /app/etc/password.properties
- true -s, --secret: secret to mask
- failure-connect-list
- true -n, --name: tool alias

## `kernal backup`

manage kinds of docker container

```bash
kernal backup [options]
```

- hello-world
- option -v, --volume: volume name / iscsi iqn
- bandersnatch
- xfs-root
- xfs-restore-root
- webdav
- smb
- dns
- lsyncd
- smb-raid0
- smb-tv
- nfs
- systemd-lv
- systemd-sync-repo
- systemd-sync-public-resources
- systemd-sync-fqdn
- systemd-sync-ntp
- systemd-ipset-persistent
- systemd-after-power
- systemd-sync-camera
- systemd-workaround-master
- systemd-monitor-on-shlg
- true -n, --name: tool alias

## `kernal centos`

manage kinds of centos

```bash
kernal centos [options]
```

- hello-world
- gui
- false -m, --mainline: download mainline version
- option -v, --version: kernel version
- yum-sync
- true -c, --case: case alias
- option -r, --repository: repository alias
- tools-sync
- repo-link
- correct-yum
- pull-softwares
- unset-proxy
- mailx
- test
- true -n, --name: tool alias

## `kernal centos stream`

manage kinds of docker container

```bash
kernal centos stream [options]
```

- hello-world
- option -v, --volume: volume name / iscsi iqn
- yum-aliyun
- upgrade-kernel
- true -n, --name: tool alias

## `kernal certificate`

manage kinds of docker container

```bash
kernal certificate [options]
```

- hello-world
- option -v, --volume: volume name / iscsi iqn
- harbor
- option -d, --domain: issue certifcate to it and *.it, used in harbor and ingress nginx
- false -p, --public: issue certifcate to use in external
- root-ca
- ca-crl
- true -n, --name: tool alias

## `kernal debian`

manage kinds of debian

```bash
kernal debian [options]
```

- kernel-download
- false -m, --mainline: download mainline version
- option -v, --version: kernel version
- kernel-upgrade
- hello-world
- apt-aliyun
- true -n, --name: tool alias

## `kernal fedora`

manage kinds of fedora

```bash
kernal fedora [options]
```

- kernel-upgrade
- xrdp
- true -n, --name: tool alias

## `kernal iscsi`

manage kinds of docker container

```bash
kernal iscsi [options]
```

- connect
- target
- true -c, --consumer: initiator client hostname
- false -d, --disable-chap: use white list to acsl, default is chap
- ssz1
- true -n, --name: tool alias

## `kernal msg`

manage kinds of docker container

```bash
kernal msg [options]
```

- hello-world
- option -v, --volume: volume name / iscsi iqn
- wechat
- true -m, --message: message
- wechat-approve
- true -m, --message: message
- true -t, --wechat-access-token: wechat-access-token
- dingtalk
- true -m, --message: message
- host-info
- option -t, --wechat-access-token: wechat-access-token
- sms
- true -n, --name: tool alias

## `kernal net`

manage kinds of docker container

```bash
kernal net [options]
```

- hello-world
- option -v, --volume: volume name / iscsi iqn
- ipv6
- true -n, --name: tool alias

## `kernal rocky`

manage kinds of docker container

```bash
kernal rocky [options]
```

- hello-world
- option -v, --volume: volume name / iscsi iqn
- yum-aliyun
- upgrade-kernel
- true -n, --name: tool alias

## `kernal ubuntu`

manage kinds of ubuntu

```bash
kernal ubuntu [options]
```

- kernel-download
- false -m, --mainline: download mainline version
- option -v, --version: kernel version
- kernel-upgrade
- xrdp
- eclipse
- firefox248
- chrome
- true -n, --name: tool alias

## `eium dev`

manage kinds of docker container

```bash
eium dev [options]
```

- hello-world
- option -v, --volume: volume name / iscsi iqn
- clone-common
- clone-ium
- true -n, --name: tool alias

## `eium docker`

manage kinds of docker container in eium

```bash
eium docker [options]
```

- wiki
- mysql
- true -p, --app: mysql app lists
- app
- true -i, --image-version: docker version lists in eium
- option -p, --app: app lists
- image-build
- option -i, --eium-version: version lists in eium
- option -l, --loose-patch: loose patch folder
- false -r, --mysqlrouter: build mysql router as co-located deployment
- option -t, --tag: image tag name
- images
- image-base
- bash
- option -i, --image: image tag name
- mpc
- mpc-project
- true -n, --name: tool alias
- option -s, --string: generic string type parameter

## `eium ems`

manage kinds of docker container

```bash
eium ems [options]
```

- hello-world
- option -v, --volume: volume name / iscsi iqn
- update-license
- true,* -i, --eium-version: version lists in eium
- sync-license
- web-remote-debug
- true -i, --eium-version: version lists in eium
- true -s, --app-server: webappserver/ManagementServer
- true -p, --port: port num
- rd-clear
- log-level
- config-web
- true -i, --eium-version: version lists in eium
- true -s, --web-server: web-console/cis-ui
- true -t, --timeout: timeout minutes
- true -n, --name: tool alias

## `eium env`

manage kinds of docker container

```bash
eium env [options]
```

- hello-world
- option -v, --volume: volume name / iscsi iqn
- sctp
- install
- false -r, --reinstall: boolean, set is uninstall in first
- option -R, --rc: string, IC1/RC1, exists to use rc build instead of GA
- false -a, --noact: boolean, set is no activate it
- option -p, --patch: string, install selected patch instead of cpe patch
- option -z, --cs: string, config serverr fqdn, for example eium-9801.shao.sh
- false -e, --secure: boolean, secure mode
- false -c, --cis: boolean, cis in Bare/Standard
- false -f, --fips: boolean, enable fips install
- false -j, --jds: boolean, activate jds
- option -t, --type: string, Standard,Standalone or Bare 
- true,* -i, --eium-version: version lists in eium
- uninstall
- false -f, --force: boolean, set yes clean up if uninstall failure
- true -i, --eium-version: version lists in eium
- act
- vnc
- xrdp
- patch
- true -i, --eium-version: version lists in eium
- option -l, --last-patch: last patch file, full path, empty means that use the latest patch
- option -p, --patch: full path, 91 or 92 only
- on-after
- true -n, --name: tool alias

## `eium integration`

manage kinds of integration case in eium

```bash
eium integration [options]
```

- k8s
- true -c, --case: case alias
- option -s, --namespace: namespace
- docker
- true -c, --case: case alias
- option -i, --eium-version: version lists in eium
- option -q, --mysql: mysql host:port, sample 127.0.0.1:3306
- false -s, --no-shell: disable shell
- standalone
- true -c, --case: case alias
- standard
- true -c, --case: case alias
- option -i, --eium-version: version lists in eium
- umbrella
- true -c, --case: case alias
- option -s, --namespace: namespace
- false -o, --one: use one chart by ssz
- test
- rt
- all
- httpclient
- true -n, --name: tool alias
- false -b, --cb: case use config bundle

## `eium mgr`

manage kinds of docker container

```bash
eium mgr [options]
```

- boot
- router
- close-ro
- ip-allow
- cnf
- database-init
- ium-cfg
- ium-checkin
- test
- option -s, --suffix: TestServer suffix, R means TestServerR
- false -c, --httpclient: use httpclient to test
- option -l, --loop: loop count
- option -b, --batchSize: batchSize, unit million
- option -i, --insertIndex: insertIndex, unit million
- wait-for-result
- param
- cluster-param
- patch-mysqlrouter-image
- k8s-log
- helm-deploy
- sql
- httpclient
- moco-dependency
- moco-operator
- moco-cluster
- monitor-kvm
- option -o, --node: monitor guest node, default is k8s-5i1-guest
- true -n, --name: tool alias

## `eium ndb`

manage kinds of docker container

```bash
eium ndb [options]
```

- hello-world
- option -v, --volume: volume name / iscsi iqn
- data
- false -m, --mt: use multipile thread instead single thread
- sql
- false -t, --twice: twice node in single host
- false -s, --source: source node with replications
- false -r, --replics: replics node with replications
- mgm
- false -k, --hdd: use hdd instead ssd as data node
- false -r, --replics: replics ndb cluster mgm node
- client
- data-sql
- false -m, --mt: use multipile thread instead single thread
- false -t, --twice: twice node in single host
- false -s, --source: source node with replications
- false -r, --replics: replics node with replications
- mgm-start
- database-init
- true -n, --name: tool alias

## `eium raw`

manage kinds of docker container

```bash
eium raw [options]
```

- hello-world
- option -v, --volume: volume name / iscsi iqn
- download
- true -i, --eium-version: version lists in eium
- false -r, --release: download from mpc release repo
- false -c, --components: download components from mpc release repo
- false -s, --skipbin: skip bin download in dev branch
- false -d, --doc: download documents from mpc release repo
- delegate-download
- true -n, --name: tool alias

## `eium snapwiki`

manage kinds of docker container

```bash
eium snapwiki [options]
```

- hello-world
- option -v, --volume: volume name / iscsi iqn
- dev
- kb
- true -n, --name: tool alias

## `exercise btest`

manage kinds of docker container

```bash
exercise btest [options]
```

- hello-world
- option -v, --volume: volume name / iscsi iqn
- list
- map
- cli-opt
- cli
- true -n, --name: tool alias
- option -i, --eium-version: version lists in eium
- false -b, --bool: boolean value, general purpose
- env
- file
- str
- bash-completion
- unit-test
- jq
- func
- no-dep
- true -n, --name: tool alias

## `exercise docker`

manage kinds of docker container

```bash
exercise docker [options]
```

- hello-world
- option -v, --volume: volume name / iscsi iqn
- cp
- true -n, --name: tool alias

## `exercise file`

manage kinds of docker container

```bash
exercise file [options]
```

- hello-world
- option -v, --volume: volume name / iscsi iqn
- env-replace
- github-issues
- true -n, --name: tool alias

## `exercise file pipeline`

manage kinds of docker container

```bash
exercise file pipeline [options]
```

- hello-world
- option -v, --volume: volume name / iscsi iqn
- true -n, --name: tool alias

## `exercise file txt`

manage kinds of docker container

```bash
exercise file txt [options]
```

- hello-world
- option -v, --volume: volume name / iscsi iqn
- dollor
- option -v, --volume: volume name / iscsi iqn
- true -n, --name: tool alias

## `exercise file txt read`

manage kinds of docker container

```bash
exercise file txt read [options]
```

- hello-world
- option -v, --volume: volume name / iscsi iqn
- true -n, --name: tool alias

## `k8s chartmuseum`

manage kinds of docker container

```bash
k8s chartmuseum [options]
```

- hello-world
- option -v, --volume: volume name / iscsi iqn
- env
- true -n, --name: tool alias

## `k8s docker`

manage kinds of docker container

```bash
k8s docker [options]
```

- site-migration
- repo-migrate
- hello-world
- option -v, --volume: volume name / iscsi iqn
- login
- compose
- proxy
- certificate
- guest-ip
- prune
- true -n, --name: tool alias

## `k8s docker app`

manage kinds of docker container

```bash
k8s docker app [options]
```

- hello-world
- option -v, --volume: volume name / iscsi iqn
- inst
- true -c, --case: case name in docker
- false -a, --await: wait for docker init complete
- true -n, --name: tool alias

## `k8s docker raw`

manage kinds of docker container

```bash
k8s docker raw [options]
```

- hello-world
- option -v, --volume: volume name / iscsi iqn
- load-images
- false -c, --cache: use cache file to fast check
- images
- elastic
- true -n, --name: tool alias

## `k8s docker standalone`

manage kinds of docker container

```bash
k8s docker standalone [options]
```

- hello-world
- option -v, --volume: volume name / iscsi iqn
- emby
- option -v, --volume: volume name / iscsi iqn
- nginx
- gluster
- yum
- heketi
- jaeger
- alpine-jdk
- true -n, --name: tool alias

## `k8s env`

manage kinds of docker container

```bash
k8s env [options]
```

- hello-world
- option -v, --volume: volume name / iscsi iqn
- uninstall
- rebind
- master
- master-init-cfg
- bastion
- pause
- kubectl
- upgrade
- token
- false -d, --dashboard: dashboard access token
- false -k, --kubeconfig: dashboard kubeconfig file
- inst
- false -m, --master: create master node
- option -c, --cri: which CRI is used in k8s, default is podman
- docker
- false -f, --force: force install again
- podman
- false -f, --force: force install again
- crio
- false -f, --force: force install again
- show-local
- true -n, --name: tool alias

## `k8s ha`

manage kinds of docker container

```bash
k8s ha [options]
```

- hello-world
- option -v, --volume: volume name / iscsi iqn
- lvs
- true -i, --vip: vip to expose
- control-plane
- restart-pod
- true -c, --component: restart pod in node, like kube-proxy
- renew-apiserver
- true -n, --name: tool alias
- true -i, --vip: vip to expose

## `k8s harbor`

manage kinds of docker container

```bash
k8s harbor [options]
```

- hello-world
- option -v, --volume: volume name / iscsi iqn
- env
- prepare
- certificate
- cloud
- images
- images-convert
- upgrade-docker
- true -n, --name: tool alias

## `k8s helm`

manage kinds of helm features

```bash
k8s helm [options]
```

- env
- ms
- option -a, --helm-ms-app: ms-app name
- option -s, --sleep: sleep seconds
- unms
- option -a, --helm-ms-app: ms-app name
- repo
- upgrade
- snapdev
- true -u, --user: mysql user name
- true -p, --password: mysql password
- true -n, --name: tool alias

## `k8s infrastructure`

manage kinds of docker container

```bash
k8s infrastructure [options]
```

- hello-world
- option -v, --volume: volume name / iscsi iqn
- local-volume
- plugins-with-yaml
- plugins
- false -u, --username: mysql username
- plugins-monitor
- plugins-persist
- option -d, --domain: domain name or ip
- false -s, --static-pv: use static pv
- false -m, --multi-host: multipile host deploy, use virtual ip for load balancer
- false -v, --ipv6: ipv6 only
- plugins-persist-clickhouse
- plugins-persist-mongodb
- true -n, --name: tool alias

## `k8s infrastructure ingress`

manage kinds of docker container

```bash
k8s infrastructure ingress [options]
```

- hello-world
- option -v, --volume: volume name / iscsi iqn
- true -n, --name: tool alias

## `k8s infrastructure monitoring`

manage kinds of docker container

```bash
k8s infrastructure monitoring [options]
```

- hello-world
- option -v, --volume: volume name / iscsi iqn
- grafana-storage
- kube-prometheus
- kube-prometheus-uninstall
- true -n, --name: tool alias

## `k8s maint`

manage kinds of docker container

```bash
k8s maint [options]
```

- hello-world
- upgrade
- true -v, --version: kubernetes version / latest
- true -n, --name: tool alias

## `k8s ms`

manage kinds of docker container

```bash
k8s ms [options]
```

- hello-world
- option -v, --volume: volume name / iscsi iqn
- env
- option -d, --domain: domain name or ip
- false -s, --static-pv: use static pv
- false -m, --multi-host: multipile host deploy, use virtual ip for load balancer
- cluster
- false -a, --apply: apply cmd
- option -s, --sleep: sleep seconds
- restart
- image-build
- ft-image-build
- ps-image-build
- cellong-image-build
- mqtt-image-build
- node-selector
- debug
- patch-version
- true -n, --name: tool alias
- option -i, --image-path-with-version: image path with version, e.g. ms/ms-jdk17-dns-2021d4:1.1.0-SNAPSHOT

## `k8s ms vm`

manage kinds of docker container

```bash
k8s ms vm [options]
```

- hello-world
- option -v, --volume: volume name / iscsi iqn
- deploy
- foo
- testcase
- sample
- ws
- rpcweb
- scheduler
- management
- registry
- gui-rpcweb
- ps-deploy
- cellong-deploy
- mqtt-deploy
- cellong-web-deploy
- ps
- cellong
- mqtt
- ft
- ft-web
- ft-webpage
- true -n, --name: tool alias

## `k8s okd`

manage kinds of okd application

```bash
k8s okd [options]
```

- bastion
- dns1-update
- true -c, --cluster: openshift cluster name
- true -b, --bootstrap: bootstrap node ip
- true -m, --master: master node ip
- option -w, --worker: worker node ip
- option -d, --dns: dns server ip
- dns2-update
- true -c, --cluster: openshift cluster name
- true -m, --master: master node ip
- option -d, --dns: dns server ip
- fcos-download
- iso
- true -c, --cluster: openshift cluster name
- option -b, --bootstrap: boostrap node ip
- true -m, --master: master node ip
- option -w, --worker: worker node ip
- option -d, --dns: dns server ip
- iso1
- true -c, --cluster: openshift cluster name
- option -b, --bootstrap: boostrap node ip
- true -m, --master: master node ip
- option -w, --worker: worker node ip
- option -d, --dns: dns server ip
- iso-software
- iso-expand
- true -o, --hostname: expand hostname name, not include cluster name
- true -w, --worker: expand ip
- iso-kvm
- option -c, --cluster: openshift cluster name
- option -b, --bastion: bastion server ip or fqdn
- expand-kvm
- true -c, --cluster: openshift cluster name
- true -o, --hostname: expand hostname name, not include cluster name
- true -w, --worker: expand ip
- iso1-kvm
- mirror
- info-bootstrap
- info-master
- info-etcd
- patch-etcd
- patch-operator
- wait-for-patch
- wait-for-expand
- true -o, --hostname: expand hostname name, not include cluster name
- hpe-dns
- env
- option -c, --cluster: openshift cluster name
- option -m, --master: master node ip
- producer
- consumer
- upload-extract
- worker-kvm
- upgrade
- certificate
- workaround-master
- true -n, --name: tool alias

## `k8s raw`

manage kinds of docker container

```bash
k8s raw [options]
```

- hello-world
- option -v, --volume: volume name / iscsi iqn
- true -n, --name: tool alias

## `k8s rbac`

manage kinds of docker container

```bash
k8s rbac [options]
```

- hello-world
- option -v, --volume: volume name / iscsi iqn
- create
- true -u, --user: user name
- true -s, --namespace: namespace
- true -n, --name: tool alias

## `k8s snap`

manage kinds of docker container

```bash
k8s snap [options]
```

- hello-world
- option -v, --volume: volume name / iscsi iqn
- env
- option -d, --domain: domain name or ip
- false -s, --static-pv: use static pv
- false -m, --multi-host: multipile host deploy, use virtual ip for load balancer
- false -v, --ipv6: ipv6 only
- multi-host
- nginx-ingress
- true -s, --lb-suffix: lb address suffix 26/28
- true -n, --name: tool alias

## `k8s standalone`

manage kinds of docker container

```bash
k8s standalone [options]
```

- hello-world
- option -v, --volume: volume name / iscsi iqn
- lb-dns-update
- mounted-local-volumes
- true -n, --name: tool alias

## `k8s tanzu`

manage kinds of docker container

```bash
k8s tanzu [options]
```

- hello-world
- option -v, --volume: volume name / iscsi iqn
- true -n, --name: tool alias

## `k8s volume`

manage kinds of static volume

```bash
k8s volume [options]
```

- nfs
- true -v, --volume: volume name
- iscsi
- true -i, --iqn: iscsi iqn
- true -t, --target-host: iscsi target hostname
- glusterfs
- local
- cephfs
- pvc
- option -c, --sc: storage class name
- true -n, --name: tool alias
- true -p, --pvc: reserve bind pvc name
- true -s, --namespace: reserve bind pvc namespace

## `kvm app`

manage kinds of kvm app

```bash
kvm app [options]
```

- option -i, --instance: kvm instance
- backup
- false -a, --all: backup all instance to target folder
- false -s, --sparsify: need to virt-sparsify?
- restore
- true -f, --file: backup tar file name
- clear
- sync-images
- network-unbuntu
- renew-win
- true -n, --name: tool alias

## `kvm app misc`

manage kinds of docker container

```bash
kvm app misc [options]
```

- hello-world
- option -v, --volume: volume name / iscsi iqn
- true -n, --name: tool alias

## `kvm img`

manage kinds of docker container

```bash
kvm img [options]
```

- hello-world
- option -v, --volume: volume name / iscsi iqn
- dsm
- dsm-rr
- openwrt
- github
- true -n, --name: tool alias

## `kvm init`

manage kinds of docker container

```bash
kvm init [options]
```

- hello-world
- option -v, --volume: volume name / iscsi iqn
- qemu-img
- true -n, --name: tool alias

