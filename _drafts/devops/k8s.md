<h1> k8s </h1>

- [1. Overview](#1-overview)
- [2. install](#2-install)
- [3. User Interface](#3-user-interface)
  - [3.1. UI](#31-ui)
  - [3.2. CLI](#32-cli)
- [4. build](#4-build)
  - [4.1. Kubeadm](#41-kubeadm)
  - [4.2. Kops](#42-kops)
  - [4.3. Tectonic](#43-tectonic)
- [5. Image Registry](#5-image-registry)
- [6. Master Node](#6-master-node)
  - [6.1. API Server](#61-api-server)
  - [6.2. Scheduler](#62-scheduler)
  - [6.3. Controller](#63-controller)
  - [6.4. etcd](#64-etcd)
- [7. Worker Node](#7-worker-node)
  - [7.1. Pod](#71-pod)
  - [7.2. Docker](#72-docker)
  - [7.3. Kube-proxy](#73-kube-proxy)
  - [7.4. Fluentd](#74-fluentd)
- [8. Kubelet](#8-kubelet)
- [9. Deployments](#9-deployments)
- [10. Services](#10-services)
  - [10.1. ClusterIP](#101-clusterip)
  - [10.2. NodePort](#102-nodeport)
  - [10.3. LoadBalancer](#103-loadbalancer)

# 1. Overview

# 2. install
```shell
 Sorry, Kubernetes v1.18.0 requires conntrack to be installed in root's path
root@nubu:~# sudo apt install conntrack
$ minikube start --vm-driver=none --registry-mirror=https://registry.docker-cn.com --image-repository=registry.cn-hangzhou.aliyuncs.com/google_containers
```

# 3. User Interface

## 3.1. UI

## 3.2. CLI

# 4. build

## 4.1. Kubeadm

## 4.2. Kops

## 4.3. Tectonic

# 5. Image Registry

# 6. Master Node

## 6.1. API Server

## 6.2. Scheduler

## 6.3. Controller

## 6.4. etcd

# 7. Worker Node

## 7.1. Pod

- 最小调度单位

- 最小调度单位

- 共享一个存储、网络namespace

## 7.2. Docker

## 7.3. Kube-proxy

## 7.4. Fluentd

# 8. Kubelet

# 9. Deployments

# 10. Services

## 10.1. ClusterIP

## 10.2. NodePort

## 10.3. LoadBalancer