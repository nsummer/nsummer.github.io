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
- [5. DDL](#5-ddl)
    - [5.1. Msql](#51-msql)
        - [5.1.1. Create](#511-create)
        - [5.1.2. Alter](#512-alter)
        - [5.1.3. Read](#513-read)
        - [5.1.4. Drop](#514-drop)
    - [5.2. PostgreSQL](#52-postgresql)
        - [5.2.1. Create](#521-create)
        - [5.2.2. Alter](#522-alter)
        - [5.2.3. Read](#523-read)
        - [5.2.4. Drop](#524-drop)
- [6. Data Types](#6-data-types)
    - [6.1. Msql](#61-msql)
    - [6.2. PostgreSQL](#62-postgresql)
- [7. Operators](#7-operators)
- [8. SQL(DDL,DML,DCL,TCL)](#8-sqlddldmldcltcl)
    - [8.1. DML](#81-dml)
        - [8.1.1. Insert](#811-insert)
        - [8.1.2. Update](#812-update)
        - [8.1.3. Select](#813-select)
        - [8.1.4. Delete](#814-delete)
    - [8.2. Auto Increment](#82-auto-increment)
    - [8.3. Data Type](#83-data-type)
    - [8.4. Function](#84-function)
        - [8.4.1. AVG, SUM](#841-avg-sum)
        - [8.4.2. COUNT, LEN](#842-count-len)
        - [8.4.3. MAX, MIN](#843-max-min)
        - [8.4.4. NOW](#844-now)
        - [8.4.5. ROUND](#845-round)
        - [8.4.6. UCASE, LCASE](#846-ucase-lcase)
        - [8.4.7. MID](#847-mid)
        - [8.4.8. FIRST, LAST](#848-first-last)
        - [8.4.9. FORMAT](#849-format)
    - [8.5. Index](#85-index)
    - [8.6. Constraints](#86-constraints)
        - [8.6.1. Not Null](#861-not-null)
        - [8.6.2. Unique](#862-unique)
        - [8.6.3. Primary Key](#863-primary-key)
        - [8.6.4. Foreign Key](#864-foreign-key)
        - [8.6.5. Check](#865-check)
        - [8.6.6. Default](#866-default)
    - [8.7. Advanced Query](#87-advanced-query)
        - [8.7.1. Where](#871-where)
            - [8.7.1.1. >, <, <>, =, >=, <=](#8711------)
            - [8.7.1.2. and, or](#8712-and-or)
            - [8.7.1.3. between](#8713-between)
            - [8.7.1.4. in](#8714-in)
            - [8.7.1.5. like](#8715-like)
            - [8.7.1.6. is null, is not null](#8716-is-null-is-not-null)
        - [8.7.2. Group By, Having](#872-group-by-having)
        - [8.7.3. Order By](#873-order-by)
        - [8.7.4. Top](#874-top)
        - [8.7.5. As](#875-as)
        - [8.7.6. Join](#876-join)
            - [8.7.6.1. inner join](#8761-inner-join)
            - [8.7.6.2. left join](#8762-left-join)
            - [8.7.6.3. right join](#8763-right-join)
            - [8.7.6.4. full join](#8764-full-join)
        - [8.7.7. Union](#877-union)
        - [8.7.8. Select Into](#878-select-into)
    - [8.8. View](#88-view)
- [9. TCL](#9-tcl)
- [10. Storage Engine ?](#10-storage-engine-)

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


# 5. DDL
## 5.1. Msql
### 5.1.1. Create
> create table tblname (colname coltype [, colname coltype ...]);

eg:
```
> create table student(id Integer auto_increment, name varchar(30), primary key (id));
```

### 5.1.2. Alter
- Show Create Table Statement
> show create table tblname;

eg:
```
> show create table student;
```
- Rename Table
> rename table tblname to newtblname;

eg:
```
> rename table student to user;
```

- Drop Column
>  alter table tblname drop column colname;

eg:
```
> alter table student drop column name;
```

- Add Column
> alter table tblname add column colname coltype;

eg:
```
> alter table student add column name varchar(30);
```

- Modify Column
> alter table tblname modify column colname coltype;

eg:
```
> alter table student modify column name varchar(30) not null;
```

- Drop Primary Key

- Add Primary Key

- Add Unique

- Add Index

- Drop Index

- Move Table To Other DB
> rename table currentDB.student to otherDB.student;

eg:
```
> rename table mydb.student to testdb.student;
```

### 5.1.3. Read
> desc tblname;
> 
> show columns from tblname;

eg:
```
> desc student;
> show columns from student;
```

### 5.1.4. Drop
> drop table tblname;

eg:
```
> drop table student;
```

## 5.2. PostgreSQL
### 5.2.1. Create
> create table tblname (colname coltype [,   colname coltype ...] primary key(colname));
> 
> create table tblname (colname coltype primary key [, colname coltype ...]);

eg:
```
=> create table student (id serial, name varchar(30), primary key(id));
=> create table student (id serial primary key, name varchar(30));
```

### 5.2.2. Alter
- Add

- Drop

- Alter Colum

- Modify

- Drop Primary Key

- Add Primary Key

- Add Unique Constraint

- Drop Constraint



### 5.2.3. Read
> \d tblname

eg:
```
=> \d student;
```

### 5.2.4. Drop
> drop table tblname;

eg:
```
=> drop table student;
```

# 6. Data Types
## 6.1. Msql
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

## 6.2. PostgreSQL

# 7. Operators

# 8. SQL(DDL,DML,DCL,TCL)

## 8.1. DML
### 8.1.1. Insert
> insert into tblname [(field [, field ...])] values(value[, value ...]);

eg:
```
> insert into student(name) values('tom');
> insert into student values(2,'nancy');
```

### 8.1.2. Update
> update tblname set field=newvalue [, field=newvalue ...] [where clause];

eg:
```
> update student set name="joe" where id=1;
> update student set name="joe";
```

### 8.1.3. Select
> select * from tblname;
> 
> select colname [, colname, ...] from tblname;

eg:
```
> select * from student;
> select id, name from student;
```

### 8.1.4. Delete
> delete from tblname [where colname=value];

eg:
```
> delete from student where id=2;
> delete from student;
```

## 8.2. Auto Increment

## 8.3. Data Type

## 8.4. Function
### 8.4.1. AVG, SUM

### 8.4.2. COUNT, LEN

### 8.4.3. MAX, MIN

### 8.4.4. NOW

### 8.4.5. ROUND

### 8.4.6. UCASE, LCASE

### 8.4.7. MID

### 8.4.8. FIRST, LAST

### 8.4.9. FORMAT

## 8.5. Index

## 8.6. Constraints
### 8.6.1. Not Null

### 8.6.2. Unique

### 8.6.3. Primary Key

### 8.6.4. Foreign Key

### 8.6.5. Check

### 8.6.6. Default

## 8.7. Advanced Query
### 8.7.1. Where
#### 8.7.1.1. >, <, <>, =, >=, <=

#### 8.7.1.2. and, or

#### 8.7.1.3. between

#### 8.7.1.4. in

#### 8.7.1.5. like

#### 8.7.1.6. is null, is not null

### 8.7.2. Group By, Having

### 8.7.3. Order By

### 8.7.4. Top

### 8.7.5. As

### 8.7.6. Join
#### 8.7.6.1. inner join

#### 8.7.6.2. left join

#### 8.7.6.3. right join

#### 8.7.6.4. full join

### 8.7.7. Union

### 8.7.8. Select Into

## 8.8. View



# 9. TCL

# 10. Storage Engine ?
