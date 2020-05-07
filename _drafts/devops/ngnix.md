<h1>Nginx</h1>

# 反向代理

# nginx.conf配置结构
| command  | description  |
|---|---|
| main  | 全局配置  |
| event | 配置工作模式以及连接数 |
| http | http模块相关配置 |
| server | 虚拟主机配置，可以多个 |
| location | 路由规则，表达式 |
| upstream | 集群，内网服务器 |

