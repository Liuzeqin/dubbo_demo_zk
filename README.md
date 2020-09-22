#### 使用ZK作为注册中心的dubbo样例
##### 1.下载到本地
```bash
git clone https://github.com/Liuzeqin/dubbo_demo.git
```
##### 2.安装zk
[windows下zookeeper安装教程](https://blog.csdn.net/qq_33316784/article/details/88563482)
 ##### 3. 验证
 下载完依赖后分别运行provider和consumer，然后打开浏览器访问 http://localhost:8997/sayHello?name=${name}, 可以看到返回的字符串，查看zk的/dubbo根节点可以看到对应的信息