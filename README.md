
#### 一、介绍

基于java技术实现的小型区块链网络系统，包含基本的区块链模型结构、PoW共识机制以及完整的点对点网络，多个节点间实时通信，共同实现系统中区块链数据的完整性。

与本开源项目代码配套的详细教程地址：https://blog.csdn.net/victory_long/article/details/106604338

本开源项目希望能够成为java区块链技术学习入门的经典教程，帮助更多的区块链技术爱好者顺利入门，后续我会根据网友的反馈实现其他区块链系统模块，并提交到该项目中。

喜欢的可以给个star



#### 二、软件架构

基于springboot框架开发，目前系统已经对数据层、网络层和共识层进行了简单的实现。感兴趣的同学，还可以在此基础上继续开发，来实现例如持久层、消息的加密解密、系统账户模型、预言机、侧链技术以及智能合约等区块链系统功能。
![区块链技术架构图.jpg](https://imgconvert.csdnimg.cn/aHR0cHM6Ly9jZG4ubmxhcmsuY29tL3l1cXVlLzAvMjAyMC9qcGVnLzY0NTU0Mi8xNTgwNjUzOTIxNDQ2LTJhNWIyNTcxLThkZDMtNDg1NS04Y2QxLWI1NTUzMmQyMjM2YS5qcGVn?x-oss-process=image/format,png#align=left&display=inline&height=577&name=区块链技术架构图.jpg&originHeight=577&originWidth=911&size=123208&status=done&style=none&width=911)


#### 三、安装教程

1. 导入dce-blockchain工程到IDE中，目录结构如下：

     ![工程目录结构.jpg](https://cdn.nlark.com/yuque/0/2020/jpeg/645542/1581988673079-004eaa90-51d7-42db-88be-ddde7210a0d3.jpeg#align=left&display=inline&height=335&name=%E5%B7%A5%E7%A8%8B%E7%9B%AE%E5%BD%95%E7%BB%93%E6%9E%84.jpg&originHeight=335&originWidth=202&size=23333&status=done&style=none&width=202)

2. 配置maven环境，下载依赖包，可以通过阿里巴巴maven库下载，速度比较快。
3. 运行系统（具体打包运行方式，详见博客教程）。

#### 四、使用说明

系统启动后，可通过Postman进行操作，返回json格式的数据。

1. 查看区块链数据

[http://localhost:8090/scan](http://localhost:8080/scan)


2. 创建创世区块

[http://localhost:8090/create](http://localhost:8080/create)


3. 挖矿生成新区块

[http://localhost:8090/mine](http://localhost:8080/mine)


4. 查看区块链中存储的业务数据


[http://localhost:8090/data](http://localhost:8080/data)

#### 五、Java区块链技术交流QQ群

群文件中有大量区块链技术资料，欢迎进群交流学习：
![在这里插入图片描述](https://img-blog.csdnimg.cn/20200607175638946.jpg?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3ZpY3RvcnlfbG9uZw==,size_16,color_FFFFFF,t_70)
