<h1> SOA vs MSA </h1>
<!-- TOC -->autoauto- [1. CAP](#1-cap)auto- [2. 注册中心](#2-注册中心)auto- [3. MSA](#3-msa)auto    - [3.1. 优点](#31-优点)auto    - [3.2. 缺点](#32-缺点)auto    - [3.3. 微服务基本术语](#33-微服务基本术语)autoauto<!-- /TOC -->
# 1. CAP
- 一致性（Consistency）:强一直性、弱一致性
- 可用性(Availability)
- 分区容错(Partition Tolerance)

# 2. 注册中心
- 常见注册中心：Zookeeper、Eureka、Redis等
- Eureka主要保证AP特性
- ZK是典型CP特性

# 3. MSA

## 3.1. 优点
- 组件化、去中心化
- 分散服务、数据治理
- 业务单一、弱化业务耦合度
- 容错设计、资源合理分配

## 3.2. 缺点
- 对人员技能素质要求较高
- 团队协调性要求较高
- 粒度决定扩展难度和维护难度
- 回归冒烟等测试难度大

## 3.3. 微服务基本术语
- 服务提供者：业务实现者，封装业务接口同时提供业务实现逻辑
- 业务调用者，调用服务提供者对外暴露的接口
- 注册中心：为服务提供者、消费者提供公共的相互发现中心
- 服务治理：服务拆分以后各种问题和解决方案的集合
- 负载均衡：同一个服务的多个服务提供者分摊请求处理