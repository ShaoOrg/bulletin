# Openvpn Client V3安装
介绍安装步骤

## centos9 stream
- Step1: 安装epel, 需要检查是否/etc/yum.repos.d/epel.repo文件大小为0, 主要是为了安装jsoncpp, tinyxml2
```
dnf reinstall -y https://dl.fedoraproject.org/pub/epel/epel-release-latest-9.noarch.rpm
```
- Step2: 安装Openvpn Client
```
dnf install -y https://packages.openvpn.net/openvpn-openvpn3-epel-repo-1-1.noarch.rpm
dnf copr enable dsommers/openvpn3
dnf install openvpn3-client
```
