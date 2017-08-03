<h1>Java</h1>
<!-- TOC -->

- [1. 基本数据类型](#1-基本数据类型)
- [2. 变量类型](#2-变量类型)
- [3. 类和对象](#3-类和对象)
- [4. 修饰符、运算符](#4-修饰符运算符)
- [5. 分支与循环语句](#5-分支与循环语句)
- [6. 常用类](#6-常用类)
- [7. 数组](#7-数组)
- [8. 时间日期](#8-时间日期)
- [9. Stream、Ｆile、IO](#9-streamｆileio)
    - [9.1. Ｆile](#91-ｆile)
    - [9.2. IO](#92-io)
        - [9.2.1. 字节流](#921-字节流)
        - [9.2.2. 字符流](#922-字符流)
        - [9.2.3. 内存操作流](#923-内存操作流)
        - [9.2.4. 管道流](#924-管道流)
        - [9.2.5. 打印流](#925-打印流)
        - [9.2.6. 流之间的转换](#926-流之间的转换)
            - [9.2.6.1. 字节流转字符流](#9261-字节流转字符流)
- [10. 异常处理](#10-异常处理)
- [11. 集合框架](#11-集合框架)
- [12. 泛型](#12-泛型)
- [13. 反射机制](#13-反射机制)
- [14. Socket编程](#14-socket编程)
- [15. 多线程](#15-多线程)
- [16. Ｓwing](#16-ｓwing)
- [17. Ａpplet](#17-ａpplet)
- [18. 序列化](#18-序列化)
- [19. Lambda](#19-lambda)

<!-- /TOC -->
# 1. 基本数据类型
| 基本类型 | 字节 |
|---------|-----|
| byte    | 1   |
| short   | 2   |
| int     | 4   |
| long    | 8   |
| float   | 4   |
| double  | 8   |
| boolean | 1   |
| char    | 2   |

# 2. 变量类型

# 3. 类和对象

# 4. 修饰符、运算符

# 5. 分支与循环语句

# 6. 常用类

# 7. 数组

# 8. 时间日期

# 9. Stream、Ｆile、IO
## 9.1. Ｆile
```
public class FileDemo {
    public static void main(String[] args) {
        File dir = new File("temp");
        dir.mkdir();

        File file = new File("temp/test.tet");
        if (file.exists()) {
            file.delete();
        } else {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
```
## 9.2. IO
### 9.2.1. 字节流
```
public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("temp/test2.txt");

        OutputStream outputStream = new FileOutputStream(file);
        String str = "Hello World!";
        byte[] b = str.getBytes();

        outputStream.write(b);
        outputStream.close();


        //InputStream inputStream = new FileInputStream(file);
        InputStream inputStream = new FileInputStream("temp/test2.txt");
        byte bytes[] = new byte[(int) file.length()];
        inputStream.read(b);

        System.out.println(new String(bytes));
        inputStream.close();
    }
}
```

### 9.2.2. 字符流
```
public class WriterDemo {

    public static void main(String[] args) throws IOException {
        File file = new File("temp/test3.txt");
        Writer out = new FileWriter(file);

        String str = "hello world";
        out.write(str);
        out.close();

        Reader reader = new FileReader(file);
        //Reader reader = new FileReader("temp/test3.txt");
        char[] bytes = new char[(int) file.length()];
        int len = reader.read(bytes);

        System.out.println(new String(bytes, 0, len));
    }
}
```

### 9.2.3. 内存操作流
```
public class ByteArrayDemo {
    public static void main(String[] arg) throws IOException {
        String str = "hello world";
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(str.getBytes());
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

        int temp = 0;

        while ((temp = byteArrayInputStream.read()) != -1) {
            char c = (char) temp;
            byteArrayOutputStream.write(Character.toUpperCase(c));
        }

        byteArrayInputStream.close();
        byteArrayOutputStream.close();

        System.out.println(byteArrayOutputStream.toString());
    }
}
```

### 9.2.4. 管道流
```

```

### 9.2.5. 打印流
### 9.2.6. 流之间的转换
#### 9.2.6.1. 字节流转字符流
```
public class OutputStreamToWriter {
    public static void main(String[] args) throws IOException {
        File file = new File("temp/test4.txt");

        Writer out = new OutputStreamWriter(new FileOutputStream(file));

        out.write("hello world");

        out.close();
    }
}
```



# 10. 异常处理

# 11. 集合框架

# 12. 泛型

# 13. 反射机制

# 14. Socket编程

# 15. 多线程

# 16. Ｓwing

# 17. Ａpplet

# 18. 序列化

# 19. Lambda