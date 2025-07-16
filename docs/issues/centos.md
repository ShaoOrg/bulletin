## centos

###### centos-stream 8
- dnf upgrade -y 出错
```
error: /var/cache/dnf/base-4b13e13a5655ccc5/packages/glibc-gconv-extra-2.28-241.el8.x86_64.rpm: signature hdr data: BAD, no. of bytes(141872) out of range
The downloaded packages were saved in cache until the next successful transaction.
You can remove cached packages by executing 'dnf clean packages'.
Error: error reading package header: '/var/cache/dnf/base-4b13e13a5655ccc5/packages/glibc-gconv-extra-2.28-241.el8.x86_64.rpm'
```
[解决方案](https://stackoverflow.com/questions/77365313/signature-hdr-data-bad-no-of-bytes9168-out-of-range)
```
dnf update rpm -y
dnf upgrade -y
```
###### upgrade default jdk version
```
alternatives --install /usr/bin/java java /usr/java/jdk-17/bin/java 3
alternatives --install /usr/bin/javac javac /usr/java/jdk-17/bin/javac 3
alternatives --set java /usr/java/jdk-17/bin/java
alternatives --set javac /usr/java/jdk-17/bin/javac
```