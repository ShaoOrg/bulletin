# Opt 命令行
eium
## `eium cli`


manage kinds of eium cli


### `--name version`
### `--name start`
### `--name stop`
### `--name stop-all`
### `--name restart`
### `--name ws-jmx`
### `--name map`
### `--name sync-files`
### `--name ftp`
### `--name remote-debug`
### `--name renew`
### `--name renew-certificate`
### `--name migratedb`
### `--name delegate-download`
### `--name loose-patch`
### `--name sync-license-from-snap`
### `--name sync-license-from-portal`
### `--name jdk`
- true -n, --name: tool alias

### `--eium-version 92`
### `--eium-version 91`
### `--eium-version 90`
### `--eium-version 92pirtp`
### `--eium-version 10`
### `--eium-version 1031`
### `--eium-version 92pi`
### `--eium-version 1091`
### `--eium-version 91ngr`
### `--eium-version 1072`
### `--eium-version 1071`
### `--eium-version 109`
### `--eium-version 108`
### `--eium-version 103`
### `--eium-version 105`
### `--eium-version 90roges`
### `--eium-version 104`
### `--eium-version 107`
### `--eium-version 106`
### `--eium-version 112`
### `--eium-version 113`
### `--eium-version 110`
### `--eium-version 111`
### `--eium-version 91verizon`
- option -i, --eium-version: version lists in eium
- false -b, --bool: boolean value, general purpose
## `eium start`


kill other ium instance to ensure unique instance running

- false -r, --need-restart: boolean, set is restart self

### `--eium-version 92`
### `--eium-version 91`
### `--eium-version 90`
### `--eium-version 92pirtp`
### `--eium-version 10`
### `--eium-version 1031`
### `--eium-version 92pi`
### `--eium-version 1091`
### `--eium-version 91ngr`
### `--eium-version 1072`
### `--eium-version 1071`
### `--eium-version 109`
### `--eium-version 108`
### `--eium-version 103`
### `--eium-version 105`
### `--eium-version 90roges`
### `--eium-version 104`
### `--eium-version 107`
### `--eium-version 106`
### `--eium-version 112`
### `--eium-version 113`
### `--eium-version 110`
### `--eium-version 111`
### `--eium-version 91verizon`
- true,* -i, --eium-version: version lists in eium
## `eium config`


[
  "load or save config for the special server",
  "the config file store folder is /app/eium/backup/config/{username}",
  "please ensure that config file name is same with server name"
]


### `--opt loadconfig`
### `--opt saveconfig`
- true -o, --opt: loadconfig/saveconfig

### `--eium-version 92`
### `--eium-version 91`
### `--eium-version 90`
### `--eium-version 92pirtp`
### `--eium-version 10`
### `--eium-version 1031`
### `--eium-version 92pi`
### `--eium-version 1091`
### `--eium-version 91ngr`
### `--eium-version 1072`
### `--eium-version 1071`
### `--eium-version 109`
### `--eium-version 108`
### `--eium-version 103`
### `--eium-version 105`
### `--eium-version 90roges`
### `--eium-version 104`
### `--eium-version 107`
### `--eium-version 106`
### `--eium-version 112`
### `--eium-version 113`
### `--eium-version 110`
### `--eium-version 111`
### `--eium-version 91verizon`
- true -i, --eium-version: version lists in eium

### `--server TestServerR249`
### `--server TestServerW249`
### `--server webappserver`
- true -s, --server: running server
## `eium tools`


install eium tools


### `--name test`
- true -n, --name: tool alias

### `--eium-version 92`
### `--eium-version 91`
### `--eium-version 90`
### `--eium-version 92pirtp`
### `--eium-version 10`
### `--eium-version 1031`
### `--eium-version 92pi`
### `--eium-version 1091`
### `--eium-version 91ngr`
### `--eium-version 1072`
### `--eium-version 1071`
### `--eium-version 109`
### `--eium-version 108`
### `--eium-version 103`
### `--eium-version 105`
### `--eium-version 90roges`
### `--eium-version 104`
### `--eium-version 107`
### `--eium-version 106`
### `--eium-version 112`
### `--eium-version 113`
### `--eium-version 110`
### `--eium-version 111`
### `--eium-version 91verizon`
- option -i, --eium-version: version lists in eium
- option -p, --patch: the patch id or alias
- option -d, --domain: domain name
- false -b, --b1: boolean value, general purpose
## `eium clean up`


uninstall clean up eium


### `--eium-version 92`
### `--eium-version 91`
### `--eium-version 90`
### `--eium-version 92pirtp`
### `--eium-version 10`
### `--eium-version 1031`
### `--eium-version 92pi`
### `--eium-version 1091`
### `--eium-version 91ngr`
### `--eium-version 1072`
### `--eium-version 1071`
### `--eium-version 109`
### `--eium-version 108`
### `--eium-version 103`
### `--eium-version 105`
### `--eium-version 90roges`
### `--eium-version 104`
### `--eium-version 107`
### `--eium-version 106`
### `--eium-version 112`
### `--eium-version 113`
### `--eium-version 110`
### `--eium-version 111`
### `--eium-version 91verizon`
- true -i, --eium-version: version lists in eium
eium dev
## `eium dev hello-world`


hello world for eium-dev

- option -v, --volume: volume name / iscsi iqn
## `eium dev clone-common`

## `eium dev clone-ium`

eium docker
## `eium docker app`


start app in docker


### `--image-version 10.0`
### `--image-version 10.3`
### `--image-version 10.4`
### `--image-version latest`
- true -i, --image-version: docker version lists in eium

### `--app snap-studio`
### `--app trace`
### `--app web-console`
### `--app rtc-studio-old`
### `--app rtc-studio-102`
### `--app rtc-studio`
### `--app pcf-studio`
### `--app rdm`
### `--app rt-cluster`
### `--app all-in-one`
### `--app nosc`
### `--app jds-cluster`
- option -p, --app: app lists
- option -s, --string: generic string type parameter
## `eium docker wiki`


deploy snap wiki in docker

- option -s, --string: generic string type parameter
## `eium docker mysql`


deploy snap mysql in docker


### `--app standard`
### `--app standalone`
### `--app ebike`
### `--app pcf`
### `--app aleph`
### `--app mysql`
### `--app iumgr4`
### `--app iumgr1`
### `--app iumgr2`
### `--app iumgr3`
### `--app iumgr`
### `--app chf`
### `--app ha`
### `--app test`
- true -p, --app: mysql app lists
- option -s, --string: generic string type parameter
## `eium docker bash`


image short name with tag

- option -i, --image: image tag name
- option -s, --string: generic string type parameter
## `eium docker image-build`


start app in docker


### `--eium-version 92`
### `--eium-version 91`
### `--eium-version 90`
### `--eium-version 92pirtp`
### `--eium-version 10`
### `--eium-version 1031`
### `--eium-version 92pi`
### `--eium-version 1091`
### `--eium-version 91ngr`
### `--eium-version 1072`
### `--eium-version 1071`
### `--eium-version 109`
### `--eium-version 108`
### `--eium-version 103`
### `--eium-version 105`
### `--eium-version 90roges`
### `--eium-version 104`
### `--eium-version 107`
### `--eium-version 106`
### `--eium-version 112`
### `--eium-version 113`
### `--eium-version 110`
### `--eium-version 111`
### `--eium-version 91verizon`
- option -i, --eium-version: version lists in eium

- option -l, --loose-patch: loose patch folder
- false -r, --mysqlrouter: build mysql router as co-located deployment
- option -t, --tag: image tag name
- option -s, --string: generic string type parameter
## `eium docker images`

- option -s, --string: generic string type parameter
## `eium docker image-base`

- option -s, --string: generic string type parameter
## `eium docker mpc`

- option -s, --string: generic string type parameter
## `eium docker mpc-project`

- option -s, --string: generic string type parameter
eium ems
## `eium ems update-license`


update license from snap_share


### `--eium-version 92`
### `--eium-version 91`
### `--eium-version 90`
### `--eium-version 92pirtp`
### `--eium-version 10`
### `--eium-version 1031`
### `--eium-version 92pi`
### `--eium-version 1091`
### `--eium-version 91ngr`
### `--eium-version 1072`
### `--eium-version 1071`
### `--eium-version 109`
### `--eium-version 108`
### `--eium-version 103`
### `--eium-version 105`
### `--eium-version 90roges`
### `--eium-version 104`
### `--eium-version 107`
### `--eium-version 106`
### `--eium-version 112`
### `--eium-version 113`
### `--eium-version 110`
### `--eium-version 111`
### `--eium-version 91verizon`
- true,* -i, --eium-version: version lists in eium
## `eium ems web-remote-debug`


append remote debug info into ini file if have no remote debug info


### `--eium-version 92`
### `--eium-version 91`
### `--eium-version 90`
### `--eium-version 92pirtp`
### `--eium-version 10`
### `--eium-version 1031`
### `--eium-version 92pi`
### `--eium-version 1091`
### `--eium-version 91ngr`
### `--eium-version 1072`
### `--eium-version 1071`
### `--eium-version 109`
### `--eium-version 108`
### `--eium-version 103`
### `--eium-version 105`
### `--eium-version 90roges`
### `--eium-version 104`
### `--eium-version 107`
### `--eium-version 106`
### `--eium-version 112`
### `--eium-version 113`
### `--eium-version 110`
### `--eium-version 111`
### `--eium-version 91verizon`
- true -i, --eium-version: version lists in eium

### `--app-server webappserver`
### `--app-server ManagementServer`
- true -s, --app-server: webappserver/ManagementServer
- true -p, --port: port num
## `eium ems hello-world`


hello world for eium-ems

- option -v, --volume: volume name / iscsi iqn
## `eium ems config-web`


change web xml to debug something


### `--eium-version 92`
### `--eium-version 91`
### `--eium-version 90`
### `--eium-version 92pirtp`
### `--eium-version 10`
### `--eium-version 1031`
### `--eium-version 92pi`
### `--eium-version 1091`
### `--eium-version 91ngr`
### `--eium-version 1072`
### `--eium-version 1071`
### `--eium-version 109`
### `--eium-version 108`
### `--eium-version 103`
### `--eium-version 105`
### `--eium-version 90roges`
### `--eium-version 104`
### `--eium-version 107`
### `--eium-version 106`
### `--eium-version 112`
### `--eium-version 113`
### `--eium-version 110`
### `--eium-version 111`
### `--eium-version 91verizon`
- true -i, --eium-version: version lists in eium

### `--web-server web-console`
### `--web-server cis-ui`
- true -s, --web-server: web-console/cis-ui
- true -t, --timeout: timeout minutes
## `eium ems sync-license`

## `eium ems rd-clear`

## `eium ems log-level`

eium env
## `eium env install`


[
  "install eium include the following step",
  "install package",
  "install patch",
  "activate"
]

- false -r, --reinstall: boolean, set is uninstall in first
- option -R, --rc: string, IC1/RC1, exists to use rc build instead of GA
- false -a, --noact: boolean, set is no activate it
- option -p, --patch: string, install selected patch instead of cpe patch
- option -z, --cs: string, config serverr fqdn, for example eium-9801.shao.sh
- false -e, --secure: boolean, secure mode
- false -c, --cis: boolean, cis in Bare/Standard
- false -f, --fips: boolean, enable fips install
- false -j, --jds: boolean, activate jds

### `--type Standard`
### `--type Standalone`
### `--type Bare`
- option -t, --type: string, Standard,Standalone or Bare 

### `--eium-version 92`
### `--eium-version 91`
### `--eium-version 90`
### `--eium-version 92pirtp`
### `--eium-version 10`
### `--eium-version 1031`
### `--eium-version 92pi`
### `--eium-version 1091`
### `--eium-version 91ngr`
### `--eium-version 1072`
### `--eium-version 1071`
### `--eium-version 109`
### `--eium-version 108`
### `--eium-version 103`
### `--eium-version 105`
### `--eium-version 90roges`
### `--eium-version 104`
### `--eium-version 107`
### `--eium-version 106`
### `--eium-version 112`
### `--eium-version 113`
### `--eium-version 110`
### `--eium-version 111`
### `--eium-version 91verizon`
- true,* -i, --eium-version: version lists in eium
## `eium env uninstall`


uninstall eium include the following step

- false -f, --force: boolean, set yes clean up if uninstall failure

### `--eium-version 92`
### `--eium-version 91`
### `--eium-version 90`
### `--eium-version 92pirtp`
### `--eium-version 10`
### `--eium-version 1031`
### `--eium-version 92pi`
### `--eium-version 1091`
### `--eium-version 91ngr`
### `--eium-version 1072`
### `--eium-version 1071`
### `--eium-version 109`
### `--eium-version 108`
### `--eium-version 103`
### `--eium-version 105`
### `--eium-version 90roges`
### `--eium-version 104`
### `--eium-version 107`
### `--eium-version 106`
### `--eium-version 112`
### `--eium-version 113`
### `--eium-version 110`
### `--eium-version 111`
### `--eium-version 91verizon`
- true -i, --eium-version: version lists in eium
## `eium env patch`


install patch


### `--eium-version 92`
### `--eium-version 91`
### `--eium-version 90`
### `--eium-version 92pirtp`
### `--eium-version 10`
### `--eium-version 1031`
### `--eium-version 92pi`
### `--eium-version 1091`
### `--eium-version 91ngr`
### `--eium-version 1072`
### `--eium-version 1071`
### `--eium-version 109`
### `--eium-version 108`
### `--eium-version 103`
### `--eium-version 105`
### `--eium-version 90roges`
### `--eium-version 104`
### `--eium-version 107`
### `--eium-version 106`
### `--eium-version 112`
### `--eium-version 113`
### `--eium-version 110`
### `--eium-version 111`
### `--eium-version 91verizon`
- true -i, --eium-version: version lists in eium

- option -l, --last-patch: last patch file, full path, empty means that use the latest patch

- option -p, --patch: full path, 91 or 92 only
## `eium env hello-world`


hello world for eium-env

- option -v, --volume: volume name / iscsi iqn
## `eium env sctp`

## `eium env act`

## `eium env vnc`

## `eium env xrdp`

## `eium env on-after`

eium integration
## `eium integration standard`


start case in standard vm


### `--case rds`
### `--case ct`
### `--case ngr-editor`
### `--case multi-deployment`
### `--case trace`
### `--case jds`
### `--case rt`
### `--case alarms`
### `--case dt-couchbase`
- true -c, --case: case alias

### `--eium-version 92`
### `--eium-version 91`
### `--eium-version 90`
### `--eium-version 92pirtp`
### `--eium-version 10`
### `--eium-version 1031`
### `--eium-version 92pi`
### `--eium-version 1091`
### `--eium-version 91ngr`
### `--eium-version 1072`
### `--eium-version 1071`
### `--eium-version 109`
### `--eium-version 108`
### `--eium-version 103`
### `--eium-version 105`
### `--eium-version 90roges`
### `--eium-version 104`
### `--eium-version 107`
### `--eium-version 106`
### `--eium-version 112`
### `--eium-version 113`
### `--eium-version 110`
### `--eium-version 111`
### `--eium-version 91verizon`
- option -i, --eium-version: version lists in eium
- false -b, --cb: case use config bundle
## `eium integration umbrella`


use case in k8s use umbrella chart


### `--case rds`
### `--case ct`
### `--case dt`
### `--case rt`
### `--case trace`
### `--case jds`
### `--case all`
### `--case ms`
### `--case mt`
### `--case ms-plugins`
### `--case iumgr`
- true -c, --case: case alias
- option -s, --namespace: namespace
- false -o, --one: use one chart by ssz
- false -b, --cb: case use config bundle
## `eium integration standalone`


start case in standalone vm


### `--case rds`
### `--case rds`
### `--case ct`
### `--case dt`
### `--case rt`
### `--case trace`
### `--case jds`
### `--case all`
### `--case grafana`
### `--case redis`
### `--case ms`
### `--case ms-plugins`
### `--case iumgr`
- true -c, --case: case alias
- false -b, --cb: case use config bundle
## `eium integration k8s`


use case in k8s


### `--case rds0`
### `--case rds`
### `--case ct`
### `--case dt`
### `--case rt`
### `--case trace`
### `--case jds`
### `--case all`
### `--case iumgr`
- true -c, --case: case alias
- option -s, --namespace: namespace
- false -b, --cb: case use config bundle
## `eium integration docker`


install kinds of script/config etc in integration test


### `--case rds`
### `--case ct`
### `--case dt`
### `--case init`
### `--case rt`
### `--case trace`
### `--case jds`
### `--case all`
### `--case iumgr`
- true -c, --case: case alias

### `--eium-version 92`
### `--eium-version 91`
### `--eium-version 90`
### `--eium-version 92pirtp`
### `--eium-version 10`
### `--eium-version 1031`
### `--eium-version 92pi`
### `--eium-version 1091`
### `--eium-version 91ngr`
### `--eium-version 1072`
### `--eium-version 1071`
### `--eium-version 109`
### `--eium-version 108`
### `--eium-version 103`
### `--eium-version 105`
### `--eium-version 90roges`
### `--eium-version 104`
### `--eium-version 107`
### `--eium-version 106`
### `--eium-version 112`
### `--eium-version 113`
### `--eium-version 110`
### `--eium-version 111`
### `--eium-version 91verizon`
- option -i, --eium-version: version lists in eium
- option -q, --mysql: mysql host:port, sample 127.0.0.1:3306
- false -s, --no-shell: disable shell
- false -b, --cb: case use config bundle
## `eium integration test`

- false -b, --cb: case use config bundle
## `eium integration rt`

- false -b, --cb: case use config bundle
## `eium integration all`

- false -b, --cb: case use config bundle
## `eium integration httpclient`

- false -b, --cb: case use config bundle
eium mgr
## `eium mgr monitor-kvm`


kvm agent to management kvm

- option -o, --node: monitor guest node, default is k8s-5i1-guest
## `eium mgr test`


hello world for eium-mgr

- option -s, --suffix: TestServer suffix, R means TestServerR
- false -c, --httpclient: use httpclient to test
- option -l, --loop: loop count
- option -b, --batchSize: batchSize, unit million
- option -i, --insertIndex: insertIndex, unit million
## `eium mgr boot`

## `eium mgr router`

## `eium mgr close-ro`

## `eium mgr ip-allow`

## `eium mgr cnf`

## `eium mgr database-init`

## `eium mgr ium-cfg`

## `eium mgr ium-checkin`

## `eium mgr wait-for-result`

## `eium mgr param`

## `eium mgr cluster-param`

## `eium mgr patch-mysqlrouter-image`

## `eium mgr k8s-log`

## `eium mgr helm-deploy`

## `eium mgr sql`

## `eium mgr httpclient`

## `eium mgr moco-dependency`

## `eium mgr moco-operator`

## `eium mgr moco-cluster`

eium ndb
## `eium ndb sql`


install ndb sql node

- false -t, --twice: twice node in single host
- false -s, --source: source node with replications
- false -r, --replics: replics node with replications
## `eium ndb data-sql`


install ndb data node

- false -m, --mt: use multipile thread instead single thread
- false -t, --twice: twice node in single host
- false -s, --source: source node with replications
- false -r, --replics: replics node with replications
## `eium ndb mgm`


install ndb mgm node

- false -k, --hdd: use hdd instead ssd as data node
- false -r, --replics: replics ndb cluster mgm node
## `eium ndb data`


install ndb data node

- false -m, --mt: use multipile thread instead single thread
## `eium ndb hello-world`


hello world for eium-ndb

- option -v, --volume: volume name / iscsi iqn
## `eium ndb client`

## `eium ndb mgm-start`

## `eium ndb database-init`

eium raw
## `eium raw hello-world`


hello world for eium-raw

- option -v, --volume: volume name / iscsi iqn
## `eium raw download`


[
  "download the latest patch in eium dashboard",
  "after session expired, please renew session id in backup.properites"
]


### `--eium-version 92`
### `--eium-version 91`
### `--eium-version 90`
### `--eium-version 92pirtp`
### `--eium-version 10`
### `--eium-version 1031`
### `--eium-version 92pi`
### `--eium-version 1091`
### `--eium-version 91ngr`
### `--eium-version 1072`
### `--eium-version 1071`
### `--eium-version 109`
### `--eium-version 108`
### `--eium-version 103`
### `--eium-version 105`
### `--eium-version 90roges`
### `--eium-version 104`
### `--eium-version 107`
### `--eium-version 106`
### `--eium-version 112`
### `--eium-version 113`
### `--eium-version 110`
### `--eium-version 111`
### `--eium-version 91verizon`
- true -i, --eium-version: version lists in eium
- false -r, --release: download from mpc release repo
- false -c, --components: download components from mpc release repo
- false -s, --skipbin: skip bin download in dev branch
- false -d, --doc: download documents from mpc release repo
## `eium raw delegate-download`

eium snapwiki
## `eium snapwiki hello-world`


hello world for eium-snapwiki

- option -v, --volume: volume name / iscsi iqn
## `eium snapwiki dev`

## `eium snapwiki kb`

exercise
## `exercise tools`


install exercise tools


### `--name hello-world`
### `--name traceroute`
- true -n, --name: tool alias
- option -s, --string: string type parameters
- false -b, --boolean: boolean type parameters
exercise btest
## `exercise btest cli`


manage kinds of eium cli


### `--name version`
### `--name vet`
### `--name but`
- true -n, --name: tool alias
- option -i, --eium-version: version lists in eium
- false -b, --bool: boolean value, general purpose
## `exercise btest hello-world`


hello world for exercise-btest

- option -v, --volume: volume name / iscsi iqn
## `exercise btest list`

## `exercise btest map`

## `exercise btest cli-opt`

## `exercise btest env`

## `exercise btest file`

## `exercise btest str`

## `exercise btest bash-completion`

## `exercise btest unit-test`

## `exercise btest jq`

## `exercise btest func`

## `exercise btest no-dep`

exercise docker
## `exercise docker hello-world`


hello world for exercise-docker

- option -v, --volume: volume name / iscsi iqn
## `exercise docker cp`

exercise file
## `exercise file hello-world`


hello world for exercise-file

- option -v, --volume: volume name / iscsi iqn
## `exercise file env-replace`

## `exercise file github-issues`

exercise file pipeline
## `exercise file pipeline hello-world`


hello world for exercise-file-pipeline

- option -v, --volume: volume name / iscsi iqn
exercise file txt
## `exercise file txt dollor`


dollor for exercise-file-txt

- option -v, --volume: volume name / iscsi iqn
## `exercise file txt hello-world`


hello world for exercise-file-txt

- option -v, --volume: volume name / iscsi iqn
exercise file txt read
## `exercise file txt read hello-world`


hello world for exercise-file-txt-read

- option -v, --volume: volume name / iscsi iqn
k8s
## `k8s label`


generate label in k8s

- option -n, --hostname: hostname
- option -l, --label: label low/medium/high
## `k8s gluster`


manage kinds of gluster


### `--name native-client`
### `--name nfs-client`
### `--name samba`
### `--name server`
### `--name heketi-storage`
- true -n, --name: tool alias
- option -a, --helm-ms-app: ms-app name
- option -d, --domain: domain name
## `k8s hello world`


hello world in k8s bundle

- false -o, --offline: use offline repo to install
## `k8s tools`


install k8s tools


### `--name hello-world`
### `--name secret`
### `--name podman`
### `--name docker`
### `--name helm`
### `--name docker-nginx`
### `--name repo-workaround`
### `--name plugins`
### `--name release-evict`
### `--name lvs`
- true -n, --name: tool alias
- option -a, --helm-ms-app: ms-app name
- option -d, --domain: domain name or ip
- false -b, --boolean: generic boolean parameters
- false -v, --ipv6: ipv6 only
k8s chartmuseum
## `k8s chartmuseum hello-world`


hello world for k8s-chartmuseum

- option -v, --volume: volume name / iscsi iqn
## `k8s chartmuseum env`

k8s docker
## `k8s docker hello-world`


hello world for k8s-docker-app

- option -v, --volume: volume name / iscsi iqn
## `k8s docker site-migration`

## `k8s docker repo-migrate`

## `k8s docker login`

## `k8s docker compose`

## `k8s docker proxy`

## `k8s docker certificate`

## `k8s docker guest-ip`

## `k8s docker prune`

k8s docker app
## `k8s docker app inst`


base on configurations to run docker container


### `--case minio`
### `--case ub-bionic`
### `--case fedora`
### `--case db-buster`
### `--case redis-test`
### `--case centos79`
### `--case nexus`
### `--case helm-chartmuseum`
### `--case shaoWiki`
### `--case emqx`
### `--case drawio`
### `--case ps-controller`
### `--case mqtt-simulator`
### `--case cellong-web`
### `--case geminiprochat`
### `--case shaoOrgWiki`
### `--case alpine`
### `--case jammy`
### `--case bionic`
### `--case nexus-test`
### `--case ub-focal`
### `--case non-storage`
### `--case github-runner-noble`
### `--case ruby`
### `--case n8n`
### `--case storage`
### `--case registry`
### `--case buster`
### `--case jira`
### `--case github-runner-jammy`
### `--case gitlab`
### `--case db-stretch`
### `--case stretch`
### `--case bash-nginx`
### `--case ub-noble`
### `--case mediawiki`
### `--case ium-license-portal`
### `--case focal`
### `--case bullseye`
### `--case ub-jammy`
### `--case bandersnatch`
### `--case gitlab-pages`
### `--case bookworm`
### `--case oiWiki`
### `--case nas234-nginx`
### `--case ft-web`
### `--case grafana-pcp`
### `--case centos82`
### `--case python`
### `--case jenkins`
- true -c, --case: case name in docker
- false -a, --await: wait for docker init complete
## `k8s docker app hello-world`


hello world for k8s-docker-app

- option -v, --volume: volume name / iscsi iqn
k8s docker raw
## `k8s docker raw update-plugins-image`


update the plugin images of k8s

- option -t, --type: want to update image type
## `k8s docker raw load-images`


load images from network

- false -c, --cache: use cache file to fast check
## `k8s docker raw hello-world`


hello world for k8s-docker-raw

- option -v, --volume: volume name / iscsi iqn
## `k8s docker raw update-latest-image`


update the images of k8s

- false -o, --offline: use offline repo to install
## `k8s docker raw elastic`

k8s docker standalone
## `k8s docker standalone emby`


create static nfs volume and bind to the special pvc

- option -v, --volume: volume name / iscsi iqn
## `k8s docker standalone hello-world`


hello world for k8s-docker-standalone

- option -v, --volume: volume name / iscsi iqn
## `k8s docker standalone nginx`

## `k8s docker standalone gluster`

## `k8s docker standalone yum`

## `k8s docker standalone heketi`

## `k8s docker standalone jaeger`

## `k8s docker standalone alpine-jdk`

k8s env
## `k8s env podman`


install podman

- false -f, --force: force install again
## `k8s env inst`


install k8s env

- false -m, --master: create master node

### `--cri crio`
### `--cri podman`
### `--cri docker`
- option -c, --cri: which CRI is used in k8s, default is podman
## `k8s env hello-world`


hello world for k8s-env

- option -v, --volume: volume name / iscsi iqn
## `k8s env crio`


install crio

- false -f, --force: force install again
## `k8s env token`


generate token in k8s

- false -d, --dashboard: dashboard access token
- false -k, --kubeconfig: dashboard kubeconfig file
## `k8s env docker`


install docker

- false -f, --force: force install again
## `k8s env uninstall`

## `k8s env rebind`

## `k8s env master`

## `k8s env master-init-cfg`

## `k8s env bastion`

## `k8s env pause`

## `k8s env kubectl`

## `k8s env upgrade`

## `k8s env show-local`

k8s ha
## `k8s ha lvs`


lvs for k8s-ha

- true -i, --vip: vip to expose
- true -i, --vip: vip to expose
## `k8s ha restart-pod`


restart pod for k8s-ha

- true -c, --component: restart pod in node, like kube-proxy
- true -i, --vip: vip to expose
## `k8s ha hello-world`


hello world for k8s-ha

- option -v, --volume: volume name / iscsi iqn
- true -i, --vip: vip to expose
## `k8s ha control-plane`

- true -i, --vip: vip to expose
## `k8s ha renew-apiserver`

- true -i, --vip: vip to expose
k8s harbor
## `k8s harbor hello-world`


hello world for k8s-harbor

- option -v, --volume: volume name / iscsi iqn
## `k8s harbor env`

## `k8s harbor prepare`

## `k8s harbor certificate`

## `k8s harbor cloud`

## `k8s harbor images`

## `k8s harbor images-convert`

## `k8s harbor upgrade-docker`

k8s helm
## `k8s helm ms`


helm install ms cluster


### `--helm-ms-app ms-registry`
### `--helm-ms-app ms-manager`
### `--helm-ms-app ms-metrics`
### `--helm-ms-app ms-sso`
### `--helm-ms-app ms-persist`
### `--helm-ms-app ms-service`
### `--helm-ms-app ms-schedule`
### `--helm-ms-app ms-ssoweb`
### `--helm-ms-app ms-rpcweb`
### `--helm-ms-app ms-ws`
### `--helm-ms-app ms-sample`
### `--helm-ms-app ms-foo`
### `--helm-ms-app ms-testcase`
- option -a, --helm-ms-app: ms-app name
- option -s, --sleep: sleep seconds
## `k8s helm unms`


helm uninstall ms cluster

- option -a, --helm-ms-app: ms-app name
## `k8s helm snapdev`


helm install snapdev in mediawiki

- true -u, --user: mysql user name
- true -p, --password: mysql password
## `k8s helm env`

## `k8s helm repo`

## `k8s helm upgrade`

k8s infrastructure
## `k8s infrastructure plugins`


create pod for plugins

- false -u, --username: mysql username
## `k8s infrastructure plugins-persist`


init test environment for k8s-ms

- option -d, --domain: domain name or ip
- false -s, --static-pv: use static pv
- false -m, --multi-host: multipile host deploy, use virtual ip for load balancer
- false -v, --ipv6: ipv6 only
## `k8s infrastructure hello-world`


hello world for k8s-infrastructure

- option -v, --volume: volume name / iscsi iqn
## `k8s infrastructure dashboard`


create pod for dashboard

- false -o, --offline: use offline repo to install
## `k8s infrastructure local-volume`

## `k8s infrastructure plugins-with-yaml`

## `k8s infrastructure plugins-monitor`

## `k8s infrastructure plugins-persist-clickhouse`

## `k8s infrastructure plugins-persist-mongodb`

k8s infrastructure ingress
## `k8s infrastructure ingress hello-world`


hello world for k8s-infrastructure-ingress

- option -v, --volume: volume name / iscsi iqn
k8s infrastructure monitoring
## `k8s infrastructure monitoring hello-world`


hello world for k8s-infrastructure-monitoring

- option -v, --volume: volume name / iscsi iqn
## `k8s infrastructure monitoring grafana-storage`

## `k8s infrastructure monitoring kube-prometheus`

## `k8s infrastructure monitoring kube-prometheus-uninstall`

k8s maint
## `k8s maint hello world`


hello world for k8s-maint

- option -v, --volume: volume name / iscsi iqn
## `k8s maint upgrade`


upgrade k8s version


### `--version latest`
### `--version 1.22.4`
### `--version 1.23.0`
- true -v, --version: kubernetes version / latest
k8s ms
## `k8s ms env`


init test environment for k8s-ms

- option -d, --domain: domain name or ip
- false -s, --static-pv: use static pv
- false -m, --multi-host: multipile host deploy, use virtual ip for load balancer
- option -i, --image-path-with-version: image path with version, e.g. ms/ms-jdk17-dns-2021d4:1.1.0-SNAPSHOT
## `k8s ms cluster`


microservice cluster

- false -a, --apply: apply cmd
- option -s, --sleep: sleep seconds
- option -i, --image-path-with-version: image path with version, e.g. ms/ms-jdk17-dns-2021d4:1.1.0-SNAPSHOT
## `k8s ms hello-world`


hello world for k8s-ms

- option -v, --volume: volume name / iscsi iqn
- option -i, --image-path-with-version: image path with version, e.g. ms/ms-jdk17-dns-2021d4:1.1.0-SNAPSHOT
## `k8s ms restart`

- option -i, --image-path-with-version: image path with version, e.g. ms/ms-jdk17-dns-2021d4:1.1.0-SNAPSHOT
## `k8s ms image-build`

- option -i, --image-path-with-version: image path with version, e.g. ms/ms-jdk17-dns-2021d4:1.1.0-SNAPSHOT
## `k8s ms ft-image-build`

- option -i, --image-path-with-version: image path with version, e.g. ms/ms-jdk17-dns-2021d4:1.1.0-SNAPSHOT
## `k8s ms ps-image-build`

- option -i, --image-path-with-version: image path with version, e.g. ms/ms-jdk17-dns-2021d4:1.1.0-SNAPSHOT
## `k8s ms cellong-image-build`

- option -i, --image-path-with-version: image path with version, e.g. ms/ms-jdk17-dns-2021d4:1.1.0-SNAPSHOT
## `k8s ms mqtt-image-build`

- option -i, --image-path-with-version: image path with version, e.g. ms/ms-jdk17-dns-2021d4:1.1.0-SNAPSHOT
## `k8s ms node-selector`

- option -i, --image-path-with-version: image path with version, e.g. ms/ms-jdk17-dns-2021d4:1.1.0-SNAPSHOT
## `k8s ms debug`

- option -i, --image-path-with-version: image path with version, e.g. ms/ms-jdk17-dns-2021d4:1.1.0-SNAPSHOT
## `k8s ms patch-version`

- option -i, --image-path-with-version: image path with version, e.g. ms/ms-jdk17-dns-2021d4:1.1.0-SNAPSHOT
k8s ms vm
## `k8s ms vm hello-world`


hello world for k8s-ms-vm

- option -v, --volume: volume name / iscsi iqn
## `k8s ms vm deploy`

## `k8s ms vm foo`

## `k8s ms vm testcase`

## `k8s ms vm sample`

## `k8s ms vm ws`

## `k8s ms vm rpcweb`

## `k8s ms vm scheduler`

## `k8s ms vm management`

## `k8s ms vm registry`

## `k8s ms vm gui-rpcweb`

## `k8s ms vm ps-deploy`

## `k8s ms vm cellong-deploy`

## `k8s ms vm mqtt-deploy`

## `k8s ms vm cellong-web-deploy`

## `k8s ms vm ps`

## `k8s ms vm cellong`

## `k8s ms vm mqtt`

## `k8s ms vm ft`

## `k8s ms vm ft-web`

## `k8s ms vm ft-webpage`

k8s okd
## `k8s okd dns1-update`


dns update before bootstrap install completed

- true -c, --cluster: openshift cluster name
- true -b, --bootstrap: bootstrap node ip
- true -m, --master: master node ip
- option -w, --worker: worker node ip
- option -d, --dns: dns server ip
## `k8s okd env`


complete bootstrap installation

- option -c, --cluster: openshift cluster name
- option -m, --master: master node ip
## `k8s okd iso`


dns update before bootstrap install completed

- true -c, --cluster: openshift cluster name
- option -b, --bootstrap: boostrap node ip
- true -m, --master: master node ip
- option -w, --worker: worker node ip
- option -d, --dns: dns server ip
## `k8s okd iso-expand`


prepare iso for expand work

- true -o, --hostname: expand hostname name, not include cluster name
- true -w, --worker: expand ip
## `k8s okd wait-for-expand`


wait for expand successfully

- true -o, --hostname: expand hostname name, not include cluster name
## `k8s okd dns2-update`


dns update after bootstrap install completed

- true -c, --cluster: openshift cluster name
- true -m, --master: master node ip
- option -d, --dns: dns server ip
## `k8s okd iso-kvm`


start kvm instance after create iso in bastion

- option -c, --cluster: openshift cluster name
- option -b, --bastion: bastion server ip or fqdn
## `k8s okd expand-kvm`


expand node for cluster

- true -c, --cluster: openshift cluster name
- true -o, --hostname: expand hostname name, not include cluster name
- true -w, --worker: expand ip
## `k8s okd iso1`


dns update before bootstrap install completed

- true -c, --cluster: openshift cluster name
- option -b, --bootstrap: boostrap node ip
- true -m, --master: master node ip
- option -w, --worker: worker node ip
- option -d, --dns: dns server ip
## `k8s okd bastion`

## `k8s okd fcos-download`

## `k8s okd iso-software`

## `k8s okd iso1-kvm`

## `k8s okd mirror`

## `k8s okd info-bootstrap`

## `k8s okd info-master`

## `k8s okd info-etcd`

## `k8s okd patch-etcd`

## `k8s okd patch-operator`

## `k8s okd wait-for-patch`

## `k8s okd hpe-dns`

## `k8s okd producer`

## `k8s okd consumer`

## `k8s okd upload-extract`

## `k8s okd worker-kvm`

## `k8s okd upgrade`

## `k8s okd certificate`

## `k8s okd workaround-master`

k8s raw
## `k8s raw hello-world`


hello world for k8s-raw

- option -v, --volume: volume name / iscsi iqn
k8s rbac
## `k8s rbac create`


create a kubernetes client user in cluster

- true -u, --user: user name
- true -s, --namespace: namespace
## `k8s rbac hello-world`


hello world for k8s-rbac

- option -v, --volume: volume name / iscsi iqn
k8s snap
## `k8s snap env`


init test environment for k8s-snap

- option -d, --domain: domain name or ip
- false -s, --static-pv: use static pv
- false -m, --multi-host: multipile host deploy, use virtual ip for load balancer
- false -v, --ipv6: ipv6 only
## `k8s snap nginx-ingress`


install nginx-ingress for k8s-snap


### `--lb-suffix 26`
### `--lb-suffix 28`
- true -s, --lb-suffix: lb address suffix 26/28
## `k8s snap hello-world`


hello world for k8s-snap

- option -v, --volume: volume name / iscsi iqn
## `k8s snap multi-host`

k8s standalone
## `k8s standalone clone-grafana-database`


clone grafana database


### `--grafana-no 1012`
### `--grafana-no 1100`
- true -g, --grafana-no: grafana volume no
## `k8s standalone hello-world`


hello world for k8s-standalone

- option -v, --volume: volume name / iscsi iqn
## `k8s standalone lb-dns-update`

## `k8s standalone mounted-local-volumes`

k8s tanzu
## `k8s tanzu hello-world`


hello world for k8s-tanzu

- option -v, --volume: volume name / iscsi iqn
k8s volume
## `k8s volume iscsi`


create static iscsi volume and bind to the special pvc

- true -i, --iqn: iscsi iqn
- true -t, --target-host: iscsi target hostname
- true -p, --pvc: reserve bind pvc name
- true -s, --namespace: reserve bind pvc namespace
## `k8s volume pvc`


create pvc with storage class or static pv

- option -c, --sc: storage class name
- true -p, --pvc: reserve bind pvc name
- true -s, --namespace: reserve bind pvc namespace
## `k8s volume nfs`


create nfs volume and bind to the special pvc

- true -v, --volume: volume name
- true -p, --pvc: reserve bind pvc name
- true -s, --namespace: reserve bind pvc namespace
## `k8s volume glusterfs`

- true -p, --pvc: reserve bind pvc name
- true -s, --namespace: reserve bind pvc namespace
## `k8s volume local`

- true -p, --pvc: reserve bind pvc name
- true -s, --namespace: reserve bind pvc namespace
## `k8s volume cephfs`

- true -p, --pvc: reserve bind pvc name
- true -s, --namespace: reserve bind pvc namespace
kernal
## `rscp`


use rsync to transfer file by ssh protocol, check disconnection

## `hello world`


hell world in kernal


### `--image centos7base`
### `--image centos82withkey`
- true -m, --image: image lists in openstack

### `--eium-version 92`
### `--eium-version 91`
### `--eium-version 90`
### `--eium-version 92pirtp`
### `--eium-version 10`
### `--eium-version 1031`
### `--eium-version 92pi`
### `--eium-version 1091`
### `--eium-version 91ngr`
### `--eium-version 1072`
### `--eium-version 1071`
### `--eium-version 109`
### `--eium-version 108`
### `--eium-version 103`
### `--eium-version 105`
### `--eium-version 90roges`
### `--eium-version 104`
### `--eium-version 107`
### `--eium-version 106`
### `--eium-version 112`
### `--eium-version 113`
### `--eium-version 110`
### `--eium-version 111`
### `--eium-version 91verizon`
- true -i, --eium-version: version lists in eium
## `kernal host`


update host as local dns, and change the http proxy

- false -f, --force: don't check /etc/hosts to execute
## `kernal build grub`


build grub menu for boot

## `kernal sf`


manage kinds of kernal-sf


### `--name hello-world`
### `--name vsc-latest`
- true -n, --name: tool alias
## `repo`


update epel repo


### `--name base`
### `--name epel`
### `--name elrepo`
### `--name k8s`
### `--name openstack`
### `--name utilities`
### `--name gluster`
### `--name libcontainers`
### `--name crio-1.23`
### `--name crio-1.26`
- true -n, --name: repo collection name
- false -f, --force: force to update
- false -o, --offline: use offline repo
## `backend run`

## `kernal upgrade`


upgrade the kernal

## `kernal core`


manage kinds of kernal-core


### `--name hello-world`
### `--name update-bc`
### `--name setup-bash-completion`
### `--name markdown-help`
- true -n, --name: tool alias
## `alias rscp`


use rsync to transfer file by ssh protocol

## `kernal fqdn update`


update fqdn by hostname

- option -n, --hostname: hostname
- option -i, --ip: ip address, if empty, use local ip
- option -d, --dns: dns server host
- option -m, --domain: domain name
## `rate cpu`


[
  "rating cpu performace by 7zip, p7zip is in epel repo, please ensure enable the repo",
  "rating cpu performace by 7zip, p7zip is in epel repo, please ensure enable the repo"
]

- false -a, --always: always test, until ctrl+c
- false -s, --sysbench: use sysbench to test instead 7zip
- false -l, --all-core: use all core instead single single vCPU
## `kernal tools`


install kernal tools


### `--name x509-certificate`
### `--name vmware-certificate`
### `--name foo`
### `--name dns`
### `--name node-exporter`
### `--name memtester`
### `--name sensors`
### `--name power`
### `--name kernel`
### `--name ssh-public-key`
### `--name remove-unused-kernel`
### `--name timezone`
### `--name history-clear`
### `--name http-proxy`
### `--name no-http-proxy`
### `--name ip-changed`
### `--name download-centos`
### `--name download-softwares`
### `--name download-vscode-plugins`
### `--name sync-softwares-from-nas236`
### `--name openvpn-client`
### `--name xrdp`
### `--name trust-store`
### `--name trust-store-java`
### `--name known-host`
### `--name time-await`
### `--name tmpfs`
### `--name scan-disk`
### `--name enable-ipv6`
### `--name check-installation`
- true,a -n, --name: tool alias
- option -s, --sub-command: sub command
- option -d, --domain: domain
- false -b, --b1: boolean value, general purpose
## `kernal check`

## `kernal yumrepo offline`

## `rate disk`


rating disk performace

- option -s, --file-size: the test file size, Unit is MB, default is 1000MB
- false -e, --self: use current folder for test
- false -c, --cache: use cache providered by OS
- false -f, --fio: use fio as test engine
- false -i, --iops: test iops by 4k
- false -d, --hdd: test hdd iops by 4k, file size set to 100M
- option -m, --multipile: multipile number / 20KB
- false -w, --onlywrite: only test write skip read
- false -r, --noremove: don't remove test file
## `test`

## `kernal yumrepo sync`


[
  "sync yum repo to /app/backup/repository",
  "repo name from /etc/yum.repos.d"
]

- true -p, --repo: the repo name from /etc/yum.repos.d
## `kernal opt alias`

## `rate network`


rating network performace by scp

- option -s, --file-size: the test file size, Unit is MB, default is 1000MB

### `--remote-host lanxi`
### `--remote-host home`
### `--remote-host hpe`
### `--remote-host vps`
### `--remote-host shlg`
- option -r, --remote-host: remote host, hpe/home/lanxi/vps
## `kernal lvm`


install kernal tools


### `--name vg`
### `--name vdisk`
- true,a -n, --name: tool alias
- option -s, --sub-command: sub command
- option -t, --title: general name
- option -z, --size: generic integer
- false -b, --b1: boolean value, general purpose
kernal alinux
## `kernal alinux hello-world`


hello world for kernal-alinux

- option -v, --volume: volume name / iscsi iqn
## `kernal alinux upgrade-kernel`

kernal almalinux
## `kernal almalinux hello-world`


hello world for kernal-almalinux

- option -v, --volume: volume name / iscsi iqn
## `kernal almalinux yum-aliyun`

## `kernal almalinux upgrade-kernel`

kernal alpinelinux
## `kernal alpinelinux hello-world`


hello world for kernal-alpinelinux

- option -v, --volume: volume name / iscsi iqn
## `kernal alpinelinux apk-aliyun`

## `kernal alpinelinux upgrade-kernel`

kernal anolis
## `kernal anolis hello-world`


hello world for kernal-anolis

- option -v, --volume: volume name / iscsi iqn
## `kernal anolis upgrade-kernel`

kernal app
## `kernal app repo-sync`


sync linux software repositories

- false -r, --rhel: base rhel repo, centos, fedora, yum install
- false -u, --ubuntu: base ubuntu repo, apt install
- false -d, --debian: base debian repo, apt install
## `kernal app hello-world`


hello world for kernal-app-router

- option -v, --volume: volume name / iscsi iqn
## `kernal app hpe-route`

## `kernal app hpe-gateway`

## `kernal app firefox`

## `kernal app maven`

## `kernal app cockpit-cert`

## `kernal app private-key`

## `kernal app jmeter`

## `kernal app smart`

## `kernal app sh-service`

## `kernal app swap`

## `kernal app sync-ssz-share`

kernal app github
## `kernal app github runner`


manage kinds of kernal-app-github-runner


### `--name hello-world`
### `--name powershell`
### `--name env`
### `--name packer`
### `--name new`
### `--name update`
### `--name mono`
### `--name choco`
### `--name gradle`
### `--name gh`
### `--name restart`
- true -n, --name: tool alias
- true -t, --token: github runner token, expiration after an hour
- option -o, --no: github runner no
- option -w, --owner: github runner owner, ssz or user/repo
## `kernal app github commit`


commit file by webapi

- option -t, --token: github personal access token
- option -p, --file_path_with_repo: file path with repo, e.g. Shao/jenkins-pipeline/src/pipe-update-ssz-public-ip/public_ip.txt
- option -f, --raw_file: raw file, e.g. /root/.jenkins/xxx/src/pipe-update-ssz-public-ip/public_ip.txt
- option -b, --branch: branch name, e.g. master
- option -m, --commit_message: commit message, e.g. public ip
- false -c, --is_github_com: commit to github.com instead github.shao.sh, e.g. --is_github_com
## `kernal app github hello-world`


hello world for kernal-app-github

- option -v, --volume: volume name / iscsi iqn
## `kernal app github sync-all-webhooks`

## `kernal app github update-issues`

kernal app github_issues
## `kernal app github_issues hello-world`


hello world for kernal-app-github_issues

- option -v, --volume: volume name / iscsi iqn
kernal app gitlab
## `kernal app gitlab hello-world`


hello world for kernal-app-gitlab

- option -v, --volume: volume name / iscsi iqn
## `kernal app gitlab add-owner`

kernal app jenkins
## `kernal app jenkins hello-world`


hello world for kernal-app-jenkins

- option -v, --volume: volume name / iscsi iqn
## `kernal app jenkins agent-node`

kernal app ldap
## `kernal app ldap set-default-branch`


set default branch by following github.com

- true -u, --url: github.com repository url
- option -u, --url: github.com repository url
## `kernal app ldap commit`


commit to repository

- true -f, --raw_file: the file name to commit
- option -t, --token: the owner of PAT
- option -u, --url: github.com repository url
## `kernal app ldap update-rat-from-file`


update project about and topic, auto create ldap user

- true -f, --file: the file name contains about and topics content
- option -u, --url: github.com repository url
## `kernal app ldap fork-github-com`


fork a github.com repository, auto create ldap user

- true -u, --url: github.com repository url
- option -u, --url: github.com repository url
## `kernal app ldap hello-world`


hello world for kernal-app-ldap

- option -v, --volume: volume name / iscsi iqn
- option -u, --url: github.com repository url
## `kernal app ldap add-user`


add ldap user in the ldap server of de.vicp.net

- true -u, --user: ldap user name
- option -u, --url: github.com repository url
## `kernal app ldap update-repository-about-topic`


update project about and topic, auto create ldap user

- true -u, --url: github.com repository url
- option -u, --url: github.com repository url
## `kernal app ldap update-issues`

- option -u, --url: github.com repository url
kernal app metrics
## `kernal app metrics node-exporter`


check node exporter for kernal-app-metrics

- option -m, --master: master node name
- option -s, --string: generic string type
- false -b, --bool: generic bool type
## `kernal app metrics hello-world`


hello world for kernal-app-metrics

- option -v, --volume: volume name / iscsi iqn
- option -s, --string: generic string type
- false -b, --bool: generic bool type
## `kernal app metrics check-sites`

- option -s, --string: generic string type
- false -b, --bool: generic bool type
## `kernal app metrics ipinfo-io`

- option -s, --string: generic string type
- false -b, --bool: generic bool type
## `kernal app metrics restart-github`

- option -s, --string: generic string type
- false -b, --bool: generic bool type
kernal app net
## `kernal app net hello-world`


hello world for kernal-app-net

- option -v, --volume: volume name / iscsi iqn
## `kernal app net ipset`

## `kernal app net public-ip`

kernal app npm
## `kernal app npm hello-world`


hello world for kernal-app-npm

- option -v, --volume: volume name / iscsi iqn
## `kernal app npm env`

kernal app python
## `kernal app python hello-world`


hello world for kernal-app-python

- option -v, --volume: volume name / iscsi iqn
## `kernal app python env`

## `kernal app python cli`

## `kernal app python 3-9`

## `kernal app python pycli`

## `kernal app python scm-python`

kernal app router
## `kernal app router echo-route`


echo route for hpe vpn

- false -a, --all: route all cirs from hpe vpn, instead of snap cirs

### `--env lanxi`
### `--env home`
### `--env shlg`
- true -e, --env: route all cirs from hpe vpn, instead of snap cirs
## `kernal app router hpe-route`


set route for hpe vpn

- false -a, --all: route all cirs from hpe vpn, instead of snap cirs
## `kernal app router hello-world`


hello world for kernal-app-router

- option -v, --volume: volume name / iscsi iqn
## `kernal app router login`

## `kernal app router sync-fqdn`

## `kernal app router list-ingress`

## `kernal app router hpe_route`

kernal app vpn
## `kernal app vpn hpe`


connect hpe network by hpe vpn

- true -s, --session: session id
## `kernal app vpn hello-world`


hello world for kernal-app-vpn

- option -v, --volume: volume name / iscsi iqn
## `kernal app vpn sh`

## `kernal app vpn shlg`

## `kernal app vpn lanxi`

## `kernal app vpn openvpn-client`

## `kernal app vpn after-start`

## `kernal app vpn sh-monitor-on-shlg`

## `kernal app vpn shvpn-init`

## `kernal app vpn lanxivpn-init`

kernal auth
## `kernal auth password-init`


[
  "init password mask in /app/etc/password.properties",
  "use only for mask, please don't store important password in it"
]


### `--store-type nas236-auth`
### `--store-type nas236-iscsi`
### `--store-type qq-auth-code`
### `--store-type wechat-api-secret`
### `--store-type wechat-access-token`
### `--store-type dingtalk-access-token`
### `--store-type message-web-api`
### `--store-type shvpn`
### `--store-type lanxivpn`
### `--store-type bind-dn`
### `--store-type registry-ssh-password`
### `--store-type webdav-admin-password`
### `--store-type ldap-ldapadmin-password`
### `--store-type ldap-default-password`
### `--store-type gitlab-admin-person-access-token`
### `--store-type github-admin-person-access-token`
### `--store-type github-junit-person-access-token`
### `--store-type harbor-admin-password`
### `--store-type jenkins-admin-person-access-token`
### `--store-type jenkins-admin-approve-force-fetch-request-person-access-token`
### `--store-type jenkins-approve-force-fetch-request-trigger-token`
### `--store-type approve-wechat-access-token`
- true -s, --store-type: store key in /app/etc/password.properties
- true -p, --password: password to mask
## `kernal auth secret-init`


[
  "init secret mask in /app/etc/password.properties",
  "use only for mask, please don't store important password in it"
]

- true -t, --secret-name: store key in /app/etc/password.properties
- true -s, --secret: secret to mask
## `kernal auth nfs-white-list`


chanage white list 

- option -c, --consumer: initiator client hostname
## `kernal auth hello-world`

## `kernal auth nfs-clients`

## `kernal auth failure-connect-list`

kernal backup
## `kernal backup hello-world`


hello world for kernal-backup

- option -v, --volume: volume name / iscsi iqn
## `kernal backup bandersnatch`

## `kernal backup xfs-root`

## `kernal backup xfs-restore-root`

## `kernal backup webdav`

## `kernal backup smb`

## `kernal backup dns`

## `kernal backup lsyncd`

## `kernal backup smb-raid0`

## `kernal backup smb-tv`

## `kernal backup nfs`

## `kernal backup systemd-lv`

## `kernal backup systemd-sync-repo`

## `kernal backup systemd-sync-public-resources`

## `kernal backup systemd-sync-fqdn`

## `kernal backup systemd-sync-ntp`

## `kernal backup systemd-ipset-persistent`

## `kernal backup systemd-after-power`

## `kernal backup systemd-sync-camera`

## `kernal backup systemd-workaround-master`

## `kernal backup systemd-monitor-on-shlg`

kernal centos
## `kernal centos gui`


download the latest kernel

- false -m, --mainline: download mainline version
- option -v, --version: kernel version
## `kernal centos yum-sync`


sync yum from mirror url


### `--case fedora36`
### `--case fedora34`
### `--case fedora35`
### `--case fedora33`
### `--case centos7`
### `--case stream8`
### `--case centos8`
### `--case stream9`
### `--case rocky8`
### `--case fedora40`
### `--case stream10`
- true -c, --case: case alias
- option -r, --repository: repository alias
## `kernal centos hello-world`

## `kernal centos tools-sync`

## `kernal centos repo-link`

## `kernal centos correct-yum`

## `kernal centos pull-softwares`

## `kernal centos unset-proxy`

## `kernal centos mailx`

## `kernal centos test`

kernal centos stream
## `kernal centos stream hello-world`


hello world for kernal-centos-stream

- option -v, --volume: volume name / iscsi iqn
## `kernal centos stream yum-aliyun`

## `kernal centos stream upgrade-kernel`

kernal certificate
## `kernal certificate harbor`


public x509 certificate, for example de.vicp.net

- option -d, --domain: issue certifcate to it and *.it, used in harbor and ingress nginx
- false -p, --public: issue certifcate to use in external
## `kernal certificate hello-world`


hello world for kernal-certificate

- option -v, --volume: volume name / iscsi iqn
## `kernal certificate root-ca`

## `kernal certificate ca-crl`

kernal debian
## `kernal debian kernel-download`


download the latest kernel

- false -m, --mainline: download mainline version
- option -v, --version: kernel version
## `kernal debian kernel-upgrade`

## `kernal debian hello-world`

## `kernal debian apt-aliyun`

kernal fedora
## `kernal fedora kernel-download`


download the latest kernel

- false -m, --mainline: download mainline version
- option -v, --version: kernel version
## `kernal fedora kernel-upgrade`

## `kernal fedora xrdp`

kernal iscsi
## `kernal iscsi target`


create target in iscsi server

- true -c, --consumer: initiator client hostname
- false -d, --disable-chap: use white list to acsl, default is chap
## `kernal iscsi connect`

## `kernal iscsi ssz1`

kernal msg
## `kernal msg wechat-approve`


wechat approve by robot

- true -m, --message: message
- true -t, --wechat-access-token: wechat-access-token
## `kernal msg dingtalk`


message

- true -m, --message: message
## `kernal msg host-info`


host info

- option -t, --wechat-access-token: wechat-access-token
## `kernal msg hello-world`


hello world for kernal-msg

- option -v, --volume: volume name / iscsi iqn
## `kernal msg wechat`


message

- true -m, --message: message
## `kernal msg sms`

kernal net
## `kernal net hello-world`


hello world for kernal-net

- option -v, --volume: volume name / iscsi iqn
## `kernal net ipv6`

kernal rocky
## `kernal rocky hello-world`


hello world for kernal-rocky

- option -v, --volume: volume name / iscsi iqn
## `kernal rocky yum-aliyun`

## `kernal rocky upgrade-kernel`

kernal ubuntu
## `kernal ubuntu kernel-download`


download the latest kernel

- false -m, --mainline: download mainline version
- option -v, --version: kernel version
## `kernal ubuntu kernel-upgrade`

## `kernal ubuntu xrdp`

## `kernal ubuntu eclipse`

## `kernal ubuntu firefox248`

## `kernal ubuntu chrome`

kvm
## `kvm server restore`


restore an vm in kvm


### `--vcpus 1`
### `--vcpus 16`
- true -c, --vcpus: cpu size

### `--mem-size 512`
### `--mem-size 32768`
- true -m, --mem-size: memory size, unit MB

### `--volume 9ipv6.qcow2`
### `--volume al-9901.qcow2`
### `--volume ali-9801.qcow2`
### `--volume alp-9201.qcow2`
### `--volume alp-9202.qcow2`
### `--volume alp-9203.qcow2`
### `--volume an-9801.qcow2`
### `--volume an-9802.qcow2`
### `--volume cs-9801.qcow2`
### `--volume cs-9901.qcow2`
### `--volume cs-9a01.qcow2`
### `--volume eium-9801.qcow2`
### `--volume eium-9804.qcow2`
### `--volume fdr-9401.qcow2`
### `--volume k8s-9i1.qcow2`
### `--volume ndb-data-9803.qcow2`
### `--volume ndb-data-9804.qcow2`
### `--volume rhel-9801.qcow2`
### `--volume rhel-9901.qcow2`
### `--volume ub-9202.qcow2`
### `--volume ub-9203.qcow2`
### `--volume ub-9403.qcow2`
- true -v, --volume: volume name

### `--instance k8s-9i1`
### `--instance win-9002`
### `--instance ub-9201`
### `--instance win-9001`
- true -n, --instance: kvm name
## `kvm hello world`


the first function in kvm

- true -a, --apple banana: apple or banana
- option -c, --car trunck: car or trunck
## `kvm install`


install kvm components in centos

## `kvm tools`


install kvm tools


### `--name cloud-images`
### `--name release-guest-memory`
### `--name os-info`
### `--name cloudbase-init-win`
- true -n, --name: tool alias
- false -s, --nas234: cached in nas234
## `kvm server remove`


remove vm

- true -n, --name: server name
- false -s, --storeage: reserve storage
## `kvm server create`


create an vm in kvm


### `--vcpus 1`
### `--vcpus 16`
- true -c, --vcpus: cpu size

### `--mem-size 512`
### `--mem-size 32768`
- true -m, --mem-size: memory size, unit MB

### `--disk-size 10`
### `--disk-size 500`
- true -d, --disk-size: disk size, unit GB

### `--image alinux3-2408.qcow2`
### `--image almalinux9.qcow2`
### `--image alpinelinux3.20-3.qcow2`
### `--image anolisos80.qcow2`
### `--image anolisos8.qcow2`
### `--image centos79-2009.img`
### `--image centos81-1911.img`
### `--image centos82-2004.img`
### `--image centos83-2011.img`
### `--image centos84-2105.img`
### `--image crc-linux-amd64.tar.xz`
### `--image debian10-buster.img`
### `--image debian11-bullseye.img`
### `--image debian9-stretch.img`
### `--image dragonflybsd5.8.3.img`
### `--image fedora32.img`
### `--image fedora33.img`
### `--image fedora34.img`
### `--image fedora35.img`
### `--image fedora36.img`
### `--image fedora40.qcow2`
### `--image freebsd12.2.img`
### `--image gluster02-storage`
### `--image netbsd9.1.img`
### `--image openbsd6.8.img`
### `--image opensuse15.2.img`
### `--image openwrt-19.07.4-x86-64-combined-ext4.img`
### `--image rhel7.2.img`
### `--image rhel7.9.img`
### `--image rhel8.4.img`
### `--image rhel8.6.img`
### `--image rhel9.0.img`
### `--image rocky8-10-2405.qcow2`
### `--image rocky8.6.img`
### `--image rocky9-4-2406.qcow2`
### `--image stream10-2410.qcow2`
### `--image stream8-2406.qcow2`
### `--image stream9-2410.qcow2`
### `--image synoboot-102b.img`
### `--image synoboot-104b.img`
### `--image ubuntu18.04-bionic.img`
### `--image ubuntu20.04-focal.img`
### `--image ubuntu21.10-impish.img`
### `--image ubuntu22.04-jammy.img`
### `--image ubuntu24.04-noble.qcow2`
### `--image virtio-win-1.9.25.iso`
### `--image win10.img`
### `--image win11.qocw2`
- true -i, --image: image name

### `--instance k8s-9i1`
### `--instance win-9002`
### `--instance ub-9201`
### `--instance win-9001`
- true -n, --instance: kvm name

### `--hostdev gpu`
- option -e, --hostdev: device name passthrough
- false -p, --prealloc: preallocation falloc
- false -r, --raw: use raw disk type instead qcow2 for better performance
kvm app
## `kvm app backup`


backup kvm instance to the special folder, enforce shutdown them before backup

- false -a, --all: backup all instance to target folder
- false -s, --sparsify: need to virt-sparsify?
- option -i, --instance: kvm instance
## `kvm app restore`


restore an instance into kvm system

- true -f, --file: backup tar file name
- option -i, --instance: kvm instance
kvm app misc
## `kvm app misc hello-world`


hello world for kvm-app-misc

- option -v, --volume: volume name / iscsi iqn
kvm img
## `kvm img hello-world`


hello world for kvm-img

- option -v, --volume: volume name / iscsi iqn
## `kvm img dsm`

## `kvm img dsm-rr`

## `kvm img openwrt`

## `kvm img github`

kvm init
## `kvm init hello-world`


hello world for kvm-init

- option -v, --volume: volume name / iscsi iqn
## `kvm init qemu-img`

openstack
## `openstack install`


install openstack

- false -o, --offline: use offline repo to install
## `openstack server start all`

## `openstack tools`


install openstack tools


### `--name test`
### `--name uninstall`
- option -n, --name: tool alias
- option -a, --helm-ms-app: ms-app name
## `openstack image import`


import qcow2 file as image


- true -f, --file: file name
- true -m, --image: image name
## `openstack server create`


create instance in openstack

- true -m, --image: image lists in openstack
- true -n, --instance: instance name

### `--volume-size 1`
### `--volume-size 200`
- true -s, --volume-size: volume size, UNIT is GB
- true -t, --volume-type: volume type
- true -f, --flavor: flavor
## `openstack flavor change`


change flavor for created instance

- true -n, --instance: instance name
- true -f, --flavor: flavor
## `openstack network init`

## `openstack server delete`


delete instance in openstack

- true -n, --instance: instance name
- false -r, --reserve-volume: reserve volume after delete server
emby
## `emby tools`


install emby tools


### `--name hello-world`
### `--name smb238`
- true -n, --name: tool alias
- option -s, --string: string type parameters
- false -b, --boolean: boolean type parameters
