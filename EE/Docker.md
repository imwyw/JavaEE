<!-- TOC -->

- [Docker](#docker)
  - [环境及配置](#环境及配置)

<!-- /TOC -->

<a id="markdown-docker" name="docker"></a>
# Docker

<a id="markdown-环境及配置" name="环境及配置"></a>
## 环境及配置

[安装Linux并设置静态ip教程](https://blog.csdn.net/m0_37487097/article/details/81084844)

修改ip地址，文件：【/etc/sysconfig/network-scripts/ifcfg-eth0】，配置网卡信息：

```bash
DEVICE="eth0"
#BOOTPROTO="dhcp"
BOOTPROTO="static"
HWADDR="00:0C:29:29:70:68"
IPV6INIT="yes"
NM_CONTROLLED="yes"
ONBOOT="yes"
TYPE="Ethernet"
UUID="cb5146ed-010a-4964-91d4-7d5e927ba8ee"
IPADDR=192.168.217.100
GATEWAY=192.168.217.2
NETMASK=255.255.255.0
DNS1=192.168.217.2
DNS2=114.114.114.114
```


增加DNS的配置，会自动生成`nameserver`配置【/etc/resolv.conf】

```bash
# Generated by NetworkManager
nameserver 192.168.217.2
nameserver 114.114.114.114
```


---

参考引用：
