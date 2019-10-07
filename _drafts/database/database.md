<h1> Mysql </h1>
<!-- TOC -->

- [版本](#版本)
    - [升级与新特性](#升级与新特性)
    - [发行版](#发行版)
        - [Mysql](#mysql)
        - [Percona](#percona)
        - [MariaDB](#mariadb)
- [设计](#设计)
    - [设计规范](#设计规范)
    - [结构设计](#结构设计)
- [Client](#client)
    - [CLI](#cli)
        - [CRUD](#crud)
        - [联表查询](#联表查询)
    - [Mybatis Plus](#mybatis-plus)
- [执行计划(explain)分析](#执行计划explain分析)
- [用户管理/权限](#用户管理权限)
- [服务器配置](#服务器配置)
- [日志](#日志)
- [Cluster](#cluster)
    - [复制](#复制)
        - [主从复制](#主从复制)
        - [异步复制](#异步复制)
        - [半同步复制](#半同步复制)
        - [GTID和日志点复制](#gtid和日志点复制)
    - [分库分表](#分库分表)
    - [中间件](#中间件)
        - [Mycat](#mycat)
        - [Keepalived + LVS](#keepalived--lvs)
        - [Maxscale](#maxscale)
        - [ProxySQL](#proxysql)
    - [架构](#架构)
        - [MMM](#mmm)
        - [MHA](#mha)
        - [MGR](#mgr)
        - [PXC](#pxc)
- [存储引擎](#存储引擎)
    - [Innodb](#innodb)
    - [MylSAM](#mylsam)
    - [CSV](#csv)
    - [Archive](#archive)
    - [Memory](#memory)
    - [Federated](#federated)
- [管理](#管理)
- [管理及监控](#管理及监控)
    - [备份与恢复](#备份与恢复)
    - [故障处理](#故障处理)
    - [性能优化](#性能优化)
        - [硬件](#硬件)
        - [操作系统](#操作系统)
        - [软件](#软件)
            - [数据库结构优化](#数据库结构优化)
            - [索引优化](#索引优化)
            - [查询优化](#查询优化)
    - [基准测试](#基准测试)
        - [Tools](#tools)
            - [mysqlslap](#mysqlslap)
            - [sysbench](#sysbench)
    - [管理工具](#管理工具)
        - [mysqldump](#mysqldump)
        - [xtrabackup](#xtrabackup)

<!-- /TOC -->

# 1. 版本

## 1.1. 升级与新特性

## 1.2. 发行版

### 1.2.1. Mysql

### 1.2.2. Percona

### 1.2.3. MariaDB

# 2. 设计

## 2.1. 设计规范

## 2.2. 结构设计

# 3. Client

## 3.1. CLI

### 3.1.1. CRUD

### 3.1.2. 联表查询

## 3.2. Mybatis Plus

# 4. 执行计划(explain)分析

# 5. 用户管理/权限

# 6. 服务器配置

# 7. 日志

# 8. Cluster

## 8.1. 复制

### 8.1.1. 主从复制

### 8.1.2. 异步复制

### 8.1.3. 半同步复制

### 8.1.4. GTID和日志点复制

## 8.2. 分库分表

## 8.3. 中间件

### 8.3.1. Mycat

### 8.3.2. Keepalived + LVS

### 8.3.3. Maxscale

### 8.3.4. ProxySQL

## 8.4. 架构

### 8.4.1. MMM

### 8.4.2. MHA

### 8.4.3. MGR

### 8.4.4. PXC

# 9. 存储引擎

## 9.1. Innodb

## 9.2. MylSAM

## 9.3. CSV

## 9.4. Archive

## 9.5. Memory

## 9.6. Federated

# 10. 管理

# 11. 管理及监控

## 11.1. 备份与恢复

## 11.2. 故障处理

## 11.3. 性能优化

### 11.3.1. 硬件

### 11.3.2. 操作系统

### 11.3.3. 软件

#### 11.3.3.1. 数据库结构优化

#### 11.3.3.2. 索引优化

#### 11.3.3.3. 查询优化

## 11.4. 基准测试

### 11.4.1. Tools

#### 11.4.1.1. mysqlslap

#### 11.4.1.2. sysbench

## 11.5. 管理工具

### 11.5.1. mysqldump

### 11.5.2. xtrabackup