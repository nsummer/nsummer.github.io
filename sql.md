<h1>Mysql .VS. PostgreSQL</h1>

<!-- TOC -->

- [1. Install & Connect](#1-install--connect)
    - [1.1. Install](#11-install)
    - [1.2. Connection](#12-connection)
- [2. CLI Commands](#2-cli-commands)
- [3. Database](#3-database)
    - [3.1. Mysql](#31-mysql)
        - [3.1.1. Create](#311-create)
        - [3.1.2. Select](#312-select)
        - [3.1.3. Drop](#313-drop)
    - [3.2. PostgreSQL](#32-postgresql)
        - [3.2.1. Create](#321-create)
        - [3.2.2. Select](#322-select)
        - [3.2.3. Drop](#323-drop)
- [4. User Management & DCL](#4-user-management--dcl)
- [5. Data Types](#5-data-types)
    - [5.1. Msql](#51-msql)
    - [5.2. PostgreSQL](#52-postgresql)
- [6. DDL](#6-ddl)
    - [6.1. Msql](#61-msql)
        - [6.1.1. Create](#611-create)
        - [6.1.2. Alter](#612-alter)
        - [6.1.3. Read](#613-read)
        - [6.1.4. Drop](#614-drop)
    - [6.2. PostgreSQL](#62-postgresql)
        - [6.2.1. Create](#621-create)
        - [6.2.2. Alter](#622-alter)
        - [6.2.3. Read](#623-read)
        - [6.2.4. Drop](#624-drop)
- [7. DML](#7-dml)
    - [7.1. Msql](#71-msql)
        - [7.1.1. Insert](#711-insert)
        - [7.1.2. Update](#712-update)
        - [7.1.3. Select](#713-select)
        - [7.1.4. Delete](#714-delete)
    - [7.2. PostgreSQL](#72-postgresql)
        - [7.2.1. Insert](#721-insert)
        - [7.2.2. Update](#722-update)
        - [7.2.3. Select](#723-select)
        - [7.2.4. Delete](#724-delete)
- [8. SQL(DDL,DML,DCL,TCL)](#8-sqlddldmldcltcl)
    - [8.1. Data Type](#81-data-type)
    - [8.2. DML](#82-dml)
    - [8.4. Advanced Query](#84-advanced-query)
    - [8.5. Function](#85-function)
- [TCL](#tcl)
- [Storage Engine ?](#storage-engine-)

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

# 3. Database
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

# 4. User Management & DCL

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


# 6. DDL
## 6.1. Msql
### 6.1.1. Create
> create table tblname (colname coltype [, colname coltype ...]);

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
> create table tblname (colname coltype [,   colname coltype ...] primary key(colname));
> 
> create table tblname (colname coltype primary key [, colname coltype ...]);

eg:
```
=> create table stu (id serial, name varchar(30), primary key(id));
=> create table student (id serial primary key, name varchar(30));
```

### 6.2.2. Alter
- Add

- Drop

- Alter Colum

- Modify

- Drop Primary Key

- Add Primary Key

- Add Unique Constraint

- Drop Constraint



### 6.2.3. Read
> \d tblname

eg:
```
=> \d student;
```

### 6.2.4. Drop
> drop table tblname;

eg:
```
=> drop table student;
```


# 7. DML
## 7.1. Msql
### 7.1.1. Insert
> insert into tblname [(field [, field ...])] values(value[, value ...]);

eg:
```
> insert into user(name) values("tom");
> insert into user values(2,"nancy");
```

### 7.1.2. Update
> update tblname set field=newvalue [, field=newvalue ...] [where clause];

eg:
```
> update user set name="joe" where id=1;
> update user set name="joe";
```

### 7.1.3. Select
> select * from tblname;
> 
> select colname [, colname, ...] from tblname;

eg:
```
> select * from user;
> select id, name from user;
```

### 7.1.4. Delete
> delete from tblname [where colname=value];

eg:
```
> delete from user where id=2;
> delete from user;
```

## 7.2. PostgreSQL
### 7.2.1. Insert
> insert into tblname(colname [, colname ...]) values (value [, value ...]);

eg:
```
=> insert into student(name) values ('nancy');
```

### 7.2.2. Update
> update tblname set colname=value [, colname=value ...] [where colname=value];

eg:
```
=> update student set name='joe' where id=1;
=> update student set name='joe';
```

### 7.2.3. Select
> select * from tblname;
> 
> select colname [, colname] from tblname;

eg:
```
=> select id, name from student;
```

### 7.2.4. Delete
> delete from tblname [where colname=value];

eg:
```
=> delete from student where id=2;
=> delete from student;
```

# 8. SQL(DDL,DML,DCL,TCL)
## 8.1. Data Type

## 8.2. DML

## 8.4. Advanced Query

## 8.5. Function


# TCL

# Storage Engine ?
