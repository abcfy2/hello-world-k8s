# 项目说明

本项目使用 [Micronaut](https://micronaut.io/) 编写的一个入门级范例演示，使用 Gitlab CI 实现持续集成，对接k8s发布产品环境。

需要使用 [Docker executor](https://docs.gitlab.com/runner/executors/docker.html) 运行 `.gitlab-ci.yml`。

使用的流水线:

```txt
编译shadowjar --> 自动化测试 --> 编译并推送docker镜像(仅中央仓库) --> 部署k8s(手动，仅中央仓库)
```

需要定义的环境变量如下:

| name                     | required | comment                                                                  |
| ------------------------ | -------- | ------------------------------------------------------------------------ |
| DOCKER_REGISTRY_USER     | true     | docker镜像仓库的登录用户名                                               |
| DOCKER_REGISTRY_PASSWORD | true     | docker镜像仓库的登录密码                                                 |
| KUBE_CONFIG_CONTENT      | false    | kubectl的配置文件内容，如使用Gitlab的kubenetes cluster配置则无需配置此项 |
