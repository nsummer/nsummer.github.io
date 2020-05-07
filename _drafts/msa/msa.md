<h1>MSA</h1>

- [1. Dubbo](#1-dubbo)
- [2. Spring Cloud](#2-spring-cloud)
  - [2.1. Zuul](#21-zuul)
  - [2.2. Eureka](#22-eureka)
    - [2.2.1. 简介](#221-%e7%ae%80%e4%bb%8b)
    - [2.2.2. 核心特性](#222-%e6%a0%b8%e5%bf%83%e7%89%b9%e6%80%a7)
      - [2.2.2.1. 服务注册](#2221-%e6%9c%8d%e5%8a%a1%e6%b3%a8%e5%86%8c)
      - [2.2.2.2. 服务续约](#2222-%e6%9c%8d%e5%8a%a1%e7%bb%ad%e7%ba%a6)
      - [2.2.2.3. 服务下线](#2223-%e6%9c%8d%e5%8a%a1%e4%b8%8b%e7%ba%bf)
      - [2.2.2.4. 获取注册列表信息](#2224-%e8%8e%b7%e5%8f%96%e6%b3%a8%e5%86%8c%e5%88%97%e8%a1%a8%e4%bf%a1%e6%81%af)
      - [2.2.2.5. 自我保护](#2225-%e8%87%aa%e6%88%91%e4%bf%9d%e6%8a%a4)
    - [2.2.3. 问题](#223-%e9%97%ae%e9%a2%98)
      - [2.2.3.1. 注册慢](#2231-%e6%b3%a8%e5%86%8c%e6%85%a2)
    - [2.2.4. Server](#224-server)
    - [2.2.5. Client](#225-client)
  - [Ribbon](#ribbon)
  - [Feign](#feign)
    - [简介](#%e7%ae%80%e4%bb%8b)
    - [特性](#%e7%89%b9%e6%80%a7)
    - [整合](#%e6%95%b4%e5%90%88)
      - [Ribbon](#ribbon-1)
      - [Hystrix](#hystrix)
    - [问题](#%e9%97%ae%e9%a2%98)
  - [2.3. config](#23-config)
  - [2.4. Hystrix](#24-hystrix)
    - [简介](#%e7%ae%80%e4%bb%8b-1)
  - [2.5. Sleuth/Zipkin](#25-sleuthzipkin)
  - [2.6. Stream](#26-stream)

# 1. Dubbo

# 2. Spring Cloud

## 2.1. Zuul

## 2.2. Eureka
  
### 2.2.1. 简介
- （图）
- Spring Cloud Netflix核心子模块
- 包含：Eureka Server、Eureka Client
- Server提供服务注册服务，存储所有可用服务节点。
- Client用于简化与Server通讯复杂度
  
### 2.2.2. 核心特性

#### 2.2.2.1. 服务注册
- Client在第一次心跳是向Server注册
- 注册时Client向Server报告自身元数据：主机名、端口号、健康指标、URL等

#### 2.2.2.2. 服务续约
- Client通过发送心跳进行续约
- 默认情况下每30秒发送一次心跳
- 90秒内Server未收到续约，会剔除服务

#### 2.2.2.3. 服务下线
- Client优雅退出时会发送cancel命令
- Server收到cancel命令后会删除该节点（类似用字段标记服务不可用）

#### 2.2.2.4. 获取注册列表信息
- Client会缓存由Server获取的注册表信息
- Client会定期更新注册表信息（默认30秒）
- Client会处理注册表的合并、修改、删除等内容


#### 2.2.2.5. 自我保护
- Server会自动更新续约、更新阈值
- Server续约更新频率低于阈值时，进入保护模式
- 自我保护模式下Server不会剔除任何注册信息

### 2.2.3. 问题

#### 2.2.3.1. 注册慢
- 根本原因：AP特性
- Client延迟注册，默认30秒
- Server响应缓存，默认30秒
- Server缓存刷新，默认30秒

### 2.2.4. Server
- Single
- Cluster

### 2.2.5. Client
- HttpClient
- Ribbon
- Feign

## Ribbon
- 客户端负载均衡
- 服务发现
- 服务选择规则
- 服务监听

## Feign
### 简介
- Feign本身时HTTP Client
- 包含了多种HTTP的调用形式
- 可以整合Ribbon、Hystrix
- 提供多种HTTP底层支持

### 特性
- 实现可插拔注解支持
- 支持可插拔HTTP编码器和解码器
- 支持HTTP请求和响应压缩

### 整合
#### Ribbon
#### Hystrix
- 实现命令封装、业务降级

### 问题


## 2.3. config

## 2.4. Hystrix
### 简介
- 处理延迟和容错的开源库
- 避免级联故障，提高系统弹性
- 解决扇出导致的雪崩效应
- 核心是隔离和熔断机制



## 2.5. Sleuth/Zipkin

## 2.6. Stream