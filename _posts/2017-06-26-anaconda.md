# 安装Anaconda

## Linux
1. 去Anaconda官网下载Linux系统下的安装包，[下载链接示例](https://repo.continuum.io/archive/Anaconda3-4.3.1-Linux-x86_64.sh)
1. sh /**path to**/Anaconda，例如：
```bash
bash Downloads/Anaconda3-4.3.1-Linux-x86_64.sh
```
1. 关闭并重新打开terminal
```bash
conda --version
```

## windows
1. TODO

## 使用实例
```
conda create -n demo1 python=2.7
conda create -n demo2 python=3.6
source activate demo1
python --version
source activate demo2
python --version
source deactivate
```
