# MongoDB Redis <!--Memcached-->


## 安装与连接
- 安装

| Nosql   | Windows | Ubuntu                               | Centos |
|---------|---------|--------------------------------------|--------|
| MongoDB |         | $ sudo apt install -y mongodb-server |        |
| Redis   |         | $ sudo apt install -y redis-server   |        |

<!--| Memcached |         | $ sudo apt install -y  memcached     |        |-->

- 连接

| Nosql   | Command     | Example |
|---------|-------------|---------|
| MongoDB | $ redis-cli |         |
| Redis   | $ mongo     |         |

<!--| Memcached |         |         |-->

## 常用命令

## Database
- MongoDB
1. Show Databases
```
> show dbs
```
2. Show Current Database
```
> db
```
3. Create Database
> use dbname

eg:
```
> use test
```

<!--**用show dbs查看所有数据库时刚创建的数据库并不在数据库列表中，需向数据库插入数据才会在列表中显示**-->
4. Delete Database
```
> db.dropDatabase()
```
- Redis
1. Show Databases
```
> info keyspace
```
2. Keys
- Show Keys
> keys pattern

eg:
```
> keys *
```
- Rename Key
> rename key newkey

```
> rename a aa
```

- Type Key
> type key

```
> type a
```

- Delete Key
> del key [key ...]

eg:
```
> del a
> del b c
```
- Expire Key & TTL Key
> expire key seconds
>
> ttl key

eg:
```
> expire a 15
> ttl a

```

- Move Key to DB & Select DB(default db is 0)
> move key db
>
> select dbindex


```
> move a 1
> select 1
```



## Data Types
- Redis
1. String
- Set
> set key value
>
> mset key value [key value ...]

eg:
```
> set str1 "hello"
> mset a aa b bb c cc
```

- Get
> get key
>
> mget key [key ...]

eg:
```
> get str1
> mget str1 a b c
```

- Get Substring
> getrange key start end

```
> getrange str1 1 4
```

- Set Expired Key
> setex key seconds value

```
> setex count 30 100
```

- Get length
> strlen key

```
> strlen str1
```

- Value Increment
> incr key
>
> incrby key increment

```
> incr count
> incrby count 5
```

- Value Decrement
> decr key
>
> decrby key decrement

```
> decr count
> decrby count 2
```

- Append Value
> append key value

```
> append str1 world!
```

2. Hash
- Set
> hset key field value
> 
> hmset key field value [field value ...]

```
> hset user name nancy
> hmset person name nancy sex female age 18
```

- Get
> hget key field
>
> hgetall key

eg:
```
> hget person name
> hgetall person
```
- Delete
> hdel key field [field ...]

```
> hdel person sex age
```

- Get Keys
> hkeys key

```
> hkeys person
```

- Get Values
> hvals key

```
> hvals person
```

- Get length
> hlen key

```
> hlen person
```


3. List
- Push
> lpush key value [value ...]

```
> lpush numbers 1 2 3 4
```

- Range
> lrange key start stop

eg:
```
> lrange numbers 0 -1

```
4. Set
> sadd key member [member ...]
> smembers key

eg:
```
> sadd animals cat dog pig
> smembers animals
```

5. ZSet(Sorted Set)
> zadd key score member [score member ...]
>
> zrange key start stop [withscores]
eg:
```
> zadd student 80 nancy 70 tom 99 Jim
> zrange student 0 -1
> zrange student 0 -1 withscores

```

## Table

## CURD
- Create
- Update
- Query
- Delete

##