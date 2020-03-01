
#### 介绍

基于java技术实现的小型区块链网络系统，包含基本的区块链模型结构、PoW共识机制以及完整的点对点网络，多个节点间实时通信，共同实现系统中区块链数据的完整性。

#### 软件架构

基于springboot框架开发，目前系统已经对数据层、网络层和共识层进行了简单的实现。感兴趣的同学，还可以在此基础上继续开发，来实现例如持久层、消息的加密解密、系统账户模型、预言机、侧链技术以及智能合约等区块链系统功能。
![区块链架构.jpg](https://cdn.nlark.com/yuque/0/2020/jpeg/645542/1581988429511-52e10849-7ad5-4b5f-ac72-9e9ac1855c68.jpeg#align=left&display=inline&height=577&name=%E5%8C%BA%E5%9D%97%E9%93%BE%E6%9E%B6%E6%9E%84.jpg&originHeight=577&originWidth=911&size=123208&status=done&style=none&width=911)

#### 安装教程

1. 导入dce-blockchain工程到IDE中，目录结构如下：

     ![工程目录结构.jpg](https://cdn.nlark.com/yuque/0/2020/jpeg/645542/1581988673079-004eaa90-51d7-42db-88be-ddde7210a0d3.jpeg#align=left&display=inline&height=335&name=%E5%B7%A5%E7%A8%8B%E7%9B%AE%E5%BD%95%E7%BB%93%E6%9E%84.jpg&originHeight=335&originWidth=202&size=23333&status=done&style=none&width=202)

2. 配置maven环境，下载依赖包，可以通过阿里巴巴maven库下载，速度比较快。
2. 运行系统。

#### 使用说明

系统启动后，可通过Postman进行操作，返回json格式的数据。

1. 查看区块链数据

[http://localhost:8090/scan](http://localhost:8080/scan)


2. 创建创世区块

[http://localhost:8090/create](http://localhost:8080/create)


3. 挖矿生成新区块

[http://localhost:8090/mine](http://localhost:8080/mine)


4. 查看区块链中存储的业务数据


[http://localhost:8090/data](http://localhost:8080/data)

