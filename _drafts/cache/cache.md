<h1>缓存</h1>

# Redis vs. Memcache vs. Ehcache
## Redis
### 优点
- 数据结构丰富
- 支持持久化
- 主从同步、故障转移
- 数据保存在内存

### 确定
- 单线程、单核
- 

## Memcache
### 优点
- 简单
- 内存使用率比较高
- 多核处理，多线程

### 缺点
- 无法容灾
- 无法持久化

## Ehcache
### 优点
- 基于Java开发
- 基于JVM缓存
- 简单、轻巧、方便
### 缺点
- 不支持集群
- 不支持分布式

# 问题
## 单线程、单核
- 无法充分利用多核服务器的CPU
- 但是单核使用比较简单，不容易出错
- 多实例方式使用Redis

## Memcache vs. Memcache
- Redis不仅能做缓存还能够持久化，Memcache不支持持久化。
- Redis数据结构更加丰富，Memcache存储类型比较简单（String类型）。