<!-- TOC -->

- [MAVEN](#maven)
  - [环境变量](#环境变量)
  - [配置](#配置)
    - [仓库路径](#仓库路径)
    - [镜像地址](#镜像地址)

<!-- /TOC -->

<a id="markdown-maven" name="maven"></a>
# MAVEN

maven官网：http://maven.apache.org/

<a id="markdown-环境变量" name="环境变量"></a>
## 环境变量

```shell
mvn -version
```

<a id="markdown-配置" name="配置"></a>
## 配置


<a id="markdown-仓库路径" name="仓库路径"></a>
### 仓库路径
默认仓库的位置

```xml
<localRepository>D:\Maven\apache-maven-3.6.3\repository</localRepository>
```

<a id="markdown-镜像地址" name="镜像地址"></a>
### 镜像地址
配置阿里云镜像

```xml
  <mirrors>
	<mirror>
		<id>alimaven</id>
		<mirrorOf>central</mirrorOf>
		<name>aliyun maven</name>
		<url>http://maven.aliyun.com/nexus/content/groups/public/</url>
	</mirror>
  </mirrors>
```


---

参考引用：

[IDEA中Maven的安装和使用教程](https://blog.csdn.net/weixin_43794032/article/details/96459627)