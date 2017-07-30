<h1>数据结构(Java)</h1>

<!-- TOC -->

- [1. 线性表](#1-线性表)
- [2. 栈， 队列](#2-栈-队列)
- [3. 串， 数组](#3-串-数组)
- [4. 哈希(散列)](#4-哈希散列)
- [5. 树](#5-树)
    - [5.1. 二叉树](#51-二叉树)
        - [5.1.1. 遍历](#511-遍历)
            - [5.1.1.1. 先序遍历](#5111-先序遍历)
            - [5.1.1.2. 中序遍历](#5112-中序遍历)
            - [5.1.1.3. 后序遍历](#5113-后序遍历)
        - [5.1.2. 查找](#512-查找)
        - [5.1.3. 树的深度](#513-树的深度)
        - [5.1.4. 根据给定序列求树的结构](#514-根据给定序列求树的结构)
    - [5.2. 树、森林和二叉树的转换](#52-树森林和二叉树的转换)
    - [5.3. B-和B+树](#53-b-和b树)
- [6. 图](#6-图)
- [7. 查找， 排序](#7-查找-排序)
    - [7.1. 查找](#71-查找)
        - [7.1.1. 静态表查找](#711-静态表查找)
        - [7.1.2. 动态表查找](#712-动态表查找)
        - [7.1.3. 哈希表查找](#713-哈希表查找)
    - [7.2. 排序](#72-排序)
        - [7.2.1. 插入排序](#721-插入排序)
        - [7.2.2. 选择排序](#722-选择排序)
        - [7.2.3. 冒泡排序](#723-冒泡排序)
        - [7.2.4. 快速排序](#724-快速排序)
        - [7.2.5. 归并排序](#725-归并排序)
        - [7.2.6. 基数排序](#726-基数排序)
        - [7.2.7. 堆排序](#727-堆排序)
        - [7.2.8. 树形排序](#728-树形排序)

<!-- /TOC -->

# 1. 线性表

# 2. 栈， 队列

# 3. 串， 数组

# 4. 哈希(散列)

# 5. 树
## 5.1. 二叉树
### 5.1.1. 遍历
#### 5.1.1.1. 先序遍历
- 非递归
```
public void preOrder(BinaryTree root) {
        if (root != null) {
            Stack<BinaryTree> stack = new Stack<BinaryTree>();
            stack.push(root);
            while (stack.size() > 0) {
                root = stack.pop();
                System.out.print(root.data + "---");
                if (root.right != null) {
                    stack.push(root.right);
                }
                if (root.left != null) {
                    stack.push(root.left);
                }
            }
        }
    }
```

- 递归
```
public void preOrder(BinaryTree root) {
        if (root != null) {
            System.out.print(root.data + "---");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
```

#### 5.1.1.2. 中序遍历
- 非递归
```
public void medOrder(BinaryTree root) {
        if (root != null) {
            Stack<BinaryTree> stack = new Stack<BinaryTree>();
            stack.push(root);
            while (stack.size() > 0) {
                while (stack.peek() != null) {
                    stack.push(stack.peek().left);
                }
                stack.pop();
                if (stack.size() > 0) {
                    root = stack.pop();
                    System.out.print(root.data + "---");
                    stack.push(root.right);
                }
            }
        }
    }
```

- 递归
```
public void medOrder(BinaryTree root) {
        if (root != null) {
            medOrder(root.left);
            System.out.print(root.data + "---");
            medOrder(root.right);
        }
    }
```

#### 5.1.1.3. 后序遍历
- 非递归
```
public void postOrder(BinaryTree root) {
        if (root != null) {
            Stack<BinaryTree> stack = new Stack<BinaryTree>();
            stack.push(root);
            Boolean flag;
            BinaryTree binaryTree = null;
            while (stack.size() > 0) {
                while (stack.peek() != null) {
                    stack.push(stack.peek().left);
                }
                stack.pop();
                while (stack.size() > 0) {
                    root = stack.peek();
                    if (root.right == null || root.right == binaryTree) {
                        System.out.print(root.data + "---");
                        stack.pop();
                        binaryTree = root;
                        flag = true;
                    } else {
                        stack.push(root.right);
                        flag = false;
                    }
                    if (!flag)
                        break;
                }
            }
        }
```

- 递归
```
public void postOrder(BinaryTree root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + "---");
        }
    }
```

### 5.1.2. 查找
### 5.1.3. 树的深度
### 5.1.4. 根据给定序列求树的结构

## 5.2. 树、森林和二叉树的转换

## 5.3. B-和B+树

# 6. 图

# 7. 查找， 排序
## 7.1. 查找
### 7.1.1. 静态表查找
### 7.1.2. 动态表查找
### 7.1.3. 哈希表查找

## 7.2. 排序
### 7.2.1. 插入排序
### 7.2.2. 选择排序
### 7.2.3. 冒泡排序
### 7.2.4. 快速排序
### 7.2.5. 归并排序
### 7.2.6. 基数排序
### 7.2.7. 堆排序
### 7.2.8. 树形排序