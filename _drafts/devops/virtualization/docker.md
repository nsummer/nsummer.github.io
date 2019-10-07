<h1> Doker </h1>

<!-- TOC -->

- [1. Overview](#1-overview)
- [2. CLI](#2-cli)
  - [2.1. Common commands](#21-common-commands)
- [3. Dockerfile](#3-dockerfile)
  - [3.1. FROM](#31-from)
  - [3.2. LABEL(注释)](#32-label%e6%b3%a8%e9%87%8a)
  - [3.3. WORKDIR(设定当前工作目录，尽量使用绝对目录)](#33-workdir%e8%ae%be%e5%ae%9a%e5%bd%93%e5%89%8d%e5%b7%a5%e4%bd%9c%e7%9b%ae%e5%bd%95%e5%b0%bd%e9%87%8f%e4%bd%bf%e7%94%a8%e7%bb%9d%e5%af%b9%e7%9b%ae%e5%bd%95)
  - [3.4. Add files](#34-add-files)
    - [3.4.1. ADD(添加并可以解压缩)](#341-add%e6%b7%bb%e5%8a%a0%e5%b9%b6%e5%8f%af%e4%bb%a5%e8%a7%a3%e5%8e%8b%e7%bc%a9)
    - [3.4.2. COPY(大部分情况优于ADD)](#342-copy%e5%a4%a7%e9%83%a8%e5%88%86%e6%83%85%e5%86%b5%e4%bc%98%e4%ba%8eadd)
    - [3.4.3. 远程添加](#343-%e8%bf%9c%e7%a8%8b%e6%b7%bb%e5%8a%a0)
      - [3.4.3.1. curl](#3431-curl)
  - [3.5. ENV(设置常量)](#35-env%e8%ae%be%e7%bd%ae%e5%b8%b8%e9%87%8f)
  - [3.6. VOLUME](#36-volume)
  - [3.7. EXPOSE](#37-expose)
  - [3.8. 执行命令](#38-%e6%89%a7%e8%a1%8c%e5%91%bd%e4%bb%a4)
    - [3.8.1. RUN](#381-run)
    - [3.8.2. CMD](#382-cmd)
    - [3.8.3. ENTRYPOINT](#383-entrypoint)
- [4. Images](#4-images)
- [5. Container](#5-container)
- [6. Network](#6-network)
  - [6.1. Tools](#61-tools)
  - [6.2. namespace example](#62-namespace-example)
  - [6.3. Bridge](#63-bridge)
  - [6.4. Link](#64-link)
  - [6.5. Port mapping](#65-port-mapping)
  - [6.6. host & none](#66-host--none)
  - [6.7. Multimachine communication(多机器通信)](#67-multimachine-communication%e5%a4%9a%e6%9c%ba%e5%99%a8%e9%80%9a%e4%bf%a1)
    - [6.7.1. overlay](#671-overlay)
    - [6.7.2. underlay](#672-underlay)
  - [6.8. VXLAN](#68-vxlan)
- [7. Persistent storage/Data sharing](#7-persistent-storagedata-sharing)
- [8. Multi-container deployment(多容器部署)](#8-multi-container-deployment%e5%a4%9a%e5%ae%b9%e5%99%a8%e9%83%a8%e7%bd%b2)
- [9. 容器编排](#9-%e5%ae%b9%e5%99%a8%e7%bc%96%e6%8e%92)
  - [9.1. Swarm](#91-swarm)
  - [9.2. K8s](#92-k8s)
- [10. Cloud](#10-cloud)
- [11. Operations and monitoring(运维和监控)](#11-operations-and-monitoring%e8%bf%90%e7%bb%b4%e5%92%8c%e7%9b%91%e6%8e%a7)

<!-- /TOC -->

# 1. Overview

# 2. CLI

## 2.1. Common commands
```bash
docker container commit(docker commit)
docker image build( docker build)
docker image ls(docker images)
docker image rm(docker rmi)
```

# 3. Dockerfile

## 3.1. FROM

## 3.2. LABEL(注释)

## 3.3. WORKDIR(设定当前工作目录，尽量使用绝对目录)

## 3.4. Add files

### 3.4.1. ADD(添加并可以解压缩)

### 3.4.2. COPY(大部分情况优于ADD)

### 3.4.3. 远程添加

#### 3.4.3.1. curl

## 3.5. ENV(设置常量)

## 3.6. VOLUME

## 3.7. EXPOSE

## 3.8. 执行命令
- 执行命令有Shell和Exec两种格式，可以用，RUN、CMD、RUN、ENTRYPOINT三个命令。

### 3.8.1. RUN
- 执行命令并创建新的Image Layer

### 3.8.2. CMD
- 容器启动时运行的命令
- 如果docker run指定了其它的命令，CMD命令会被忽略
- 如果定义了多个CMD，只有最后一个会执行

### 3.8.3. ENTRYPOINT
- 容器启动后默认执行的命令和参数
- 让容器以应用程序或者服务的形式运行
- 不会被忽略，一定会执行

# 4. Images

# 5. Container

# 6. Network

## 6.1. Tools
- Ping:验证IP的可达性
- Telnet:验证服务的可用性

## 6.2. namespace example
```bash
$ sudo ip netns add test1
$ sudo ip netns list
$ sudo ip netns add test2
$ sudo ip netns list

$ sudo ip netns exec test1 ip a
$ sudo ip netns exec test1 ip link
$ sudo ip netns exec test1 ip link set dev lo up
$ sudo ip netns exec test1 ip link

$ sudo ip link add veth-test1 type veth peer name veth-test2

$ sudo ip link set veth-test1 netns test1
$ sudo ip link set veth-test2 netns test2

$ sudo ip netns exec test2 ip addr add 192.168.1.2/24 dev veth-test2

$ sudo ip netns exec test2 ip link set dev veth-test2 up
$ sudo ip netns exec test1 ip link set dev veth-test1 up

$ sudo ip netns exec test1 ip addr add 192.168.1.1/24 dev veth-test1

$ sudo ip netns exec test2 ip a
$ sudo ip netns exec test1 ip a
$ sudo ip netns exec test1 ping 192.168.1.2
$ sudo ip netns exec test2 ping 192.168.1.1
```

## 6.3. Bridge
```bash
$ docker network inspect bridge
$ sudo apt install bridge-utils -y
$ brctl show
$ sudo docker network create -d bridge my-bridge
$ docker run -d --name test3 --network my-bridge  busybox /bin/sh -c "while true; do sleep 3000; done"
$ docker network connect my-bridge test2
$ docker inspect my-bridge
```

## 6.4. Link

```bash
$ docker run -d --name test2 --link test1 busybox /bin/sh -c "while true; do sleep 3000; done"
```

## 6.5. Port mapping
```bash
$ docker run --name web -d -p 80:80 nginx
$ curl 127.0.0.1
```

## 6.6. host & none

## 6.7. Multimachine communication(多机器通信)

### 6.7.1. overlay

### 6.7.2. underlay

## 6.8. VXLAN

# 7. Persistent storage/Data sharing

# 8. Multi-container deployment(多容器部署)

# 9. 容器编排

## 9.1. Swarm

## 9.2. K8s

# 10. Cloud

# 11. Operations and monitoring(运维和监控)
