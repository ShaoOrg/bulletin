## 证书过期了

## Master Node
```
kubeadm certs renew all
systemctl restart kubelet
reboot # 重启是必须要的
```

## Client
复制master的admin.conf到.kube/config
```
cp -iy /etc/kubernetes/admin.conf /root/.kube/config
```
