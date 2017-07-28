# Mysql Postgress


## Install $ Connection
### Install

| DB        | Windows | Ubuntu                               | Centos |
|-----------|---------|--------------------------------------|--------|
| Mysql     |         | $ sudo apt install -y mariadb-server |        |
| Postgress |         | $ sudo apt install -y postgresql     |        |

### Connection
| DB        | Command                               | Example                                     |
|-----------|---------------------------------------|---------------------------------------------|
| Mysql     | $ mysql -uUser -pPassword -DDB -hHost | $ mysql -uadmin -pmaxwit -Dmydb -hlocalhost |
| Postgress | $ mongo                               |                                             |

## 常用命令

## Databasse
### Mysql
#### Create
> create database dbname;

eg:
```
> create database mydb;
```

#### Select
> use dbname;

eg:
```
> use mydb;
```

#### Drop
> drop database [if exists] dbname

eg:
```
=> drop database if exists testdb;
```

### Postgress
#### Create
> create database dbname;

eg:
```
=> create database mydb;
```

#### Select
> \c dbname

eg:
```
=> \l
=> \c mydb
```

#### Drop
> drop database [if exists] dbname

eg:
```
=> drop database if exists testdb;
```

## User Management

## Data Types

## Table

## CURD
1. Create
1. Update
1. Query
1. Delete

##