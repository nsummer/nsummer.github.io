<h1>Mysql .VS. PostgreSQL</h1>

<!-- TOC -->

- [1. Install & Connect](#1-install--connect)
    - [1.1. Install](#11-install)
    - [1.2. Connection](#12-connection)
- [2. CLI Commands](#2-cli-commands)
- [3. Databasse](#3-databasse)
    - [3.1. Mysql](#31-mysql)
        - [3.1.1. Create](#311-create)
        - [3.1.2. Select](#312-select)
        - [3.1.3. Drop](#313-drop)
    - [3.2. PostgreSQL](#32-postgresql)
        - [3.2.1. Create](#321-create)
        - [3.2.2. Select](#322-select)
        - [3.2.3. Drop](#323-drop)
- [4. User Management](#4-user-management)
- [5. Data Types](#5-data-types)
    - [5.1. Msql](#51-msql)
    - [5.2. PostgreSQL](#52-postgresql)
- [6. Table(CURD)](#6-tablecurd)
    - [6.1. Msql](#61-msql)
        - [6.1.1. Create](#611-create)
        - [6.1.2. Alter](#612-alter)
        - [6.1.3. Read](#613-read)
        - [6.1.4. Drop](#614-drop)
    - [6.2. PostgreSQL](#62-postgresql)
        - [6.2.1. Create](#621-create)
        - [6.2.2. Update](#622-update)
        - [6.2.3. Read](#623-read)
        - [6.2.4. Delete](#624-delete)
- [6. Data(CURD)](#6-datacurd)
    - [6.1. Msql](#61-msql-1)
        - [Insert](#insert)
        - [6.1.2. Update](#612-update)
        - [6.1.3. Select](#613-select)
        - [6.1.4. Delete](#614-delete)
    - [6.2. PostgreSQL](#62-postgresql-1)
        - [6.2.1. Create](#621-create-1)
        - [6.2.2. Update](#622-update-1)
        - [6.2.3. Query](#623-query)
        - [6.2.4. Delete](#624-delete-1)

<!-- /TOC -->
# 1. Install & Connect
## 1.1. Install

| DB         | Windows | Ubuntu                               | Centos |
|------------|---------|--------------------------------------|--------|
| Mysql      |         | $ sudo apt install -y mariadb-server |        |
| PostgreSQL |         | $ sudo apt install -y postgresql     |        |

## 1.2. Connection
| DB         | Command                               | Example                                     |
|------------|---------------------------------------|---------------------------------------------|
| Mysql      | $ mysql -uUser -pPassword -DDB -hHost | $ mysql -uadmin -pmaxwit -Dmydb -hlocalhost |
| PostgreSQL | $ mongo                               |                                             |

# 2. CLI Commands

# 3. Databasse
## 3.1. Mysql
### 3.1.1. Create
> create database dbname;

eg:
```
> create database mydb;
```

### 3.1.2. Select
> use dbname;

eg:
```
> use mydb;
```

### 3.1.3. Drop
> drop database [if exists] dbname

eg:
```
=> drop database if exists testdb;
```

## 3.2. PostgreSQL
### 3.2.1. Create
> create database dbname;

eg:
```
=> create database mydb;
```

### 3.2.2. Select
> \c dbname

eg:
```
=> \l
=> \c mydb
```

### 3.2.3. Drop
> drop database [if exists] dbname

eg:
```
=> drop database if exists testdb;
```

# 4. User Management

# 5. Data Types
## 5.1. Msql
| Data Type   | Byte |
|-------------|------|
| tinyint     | 1    |
| smallint    | 2    |
| mediumint   | 3    |
| int/Integer | 4    |
| bigint      | 8    |
| float       | 4    |
| double      | 8    |
| char        | 1    |
| varchar     | 2    |
| text        | 2    |
| tinytext    | 1    |
| longtext    | 4    |
| date        | 3    |
| year        | 1    |
| datetime    | 8    |
| time        | 3    |
| timestamp   | 4    |

## 5.2. PostgreSQL


# 6. Table(CURD)
## 6.1. Msql
### 6.1.1. Create
> create table tblname (colname, coltype);

eg:
```
> create table user(id Integer auto_increment, name varchar(30), primary key (id));
```

### 6.1.2. Alter
- Show Create Table Statement
> show create table tblname;

eg:
```
> show create table user;
```
- Rename Table
> rename table tblname to newtblname;

eg:
```
> rename table user to student;
```

- Drop Column
>  alter table tblname drop column colname;

eg:
```
> alter table user drop column name;
```

- Add Column
> alter table tblname add column colname coltype;

eg:
```
> alter table user add column name varchar(30);
```

- Modify Column
> alter table tblname modify column colname coltype;

eg:
```
> alter table user modify column name varchar(30) not null;
```

- Drop Primary Key

- Add Primary Key

- Add Unique

- Add Index

- Drop Index

- Move Table To Other DB
> rename table currentDB.user to otherDB.user;

eg:
```
> rename table mydb.user to testdb.user;
```

### 6.1.3. Read
> desc tblname;
> 
> show columns from tblname;

eg:
```
> desc user;
> show columns from user;
```

### 6.1.4. Drop
> drop table tblname;

eg:
```
> drop table user;
```

## 6.2. PostgreSQL
### 6.2.1. Create


### 6.2.2. Update
### 6.2.3. Read
### 6.2.4. Delete


# 6. Data(CURD)
## 6.1. Msql
### Insert
> insert into tblname [(field, [field, ...])] values(value,[value, ...]);

eg:
```
> insert into user(name) values("tom");
> insert into user values(2,"nancy");
```

### 6.1.2. Update
> update tblname set field=newvalue, [field=newvalue, ...] [where clause];

eg:
```
> update user set name="joe" where id=1;
```

### 6.1.3. Select
> select * from tblname;
> 
> select colname, [colname, ...] from tblname;

eg:
```
> select * from user;
> select id, name from user;
```

### 6.1.4. Delete
> drop table tblname;

eg:
```
> drop table user;
```

## 6.2. PostgreSQL
### 6.2.1. Create


### 6.2.2. Update
### 6.2.3. Query
### 6.2.4. Delete