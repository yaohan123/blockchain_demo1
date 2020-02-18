区块链开源平台
介绍
基于java技术实现的小型区块链网络系统，包含基本的区块链模型结构、PoW共识机制以及完整的点对点网络，多个节点间实时通信，共同实现系统中区块链数据的完整性。
软件架构
基于springboot框架开发，目前系统已经对数据层、网络层和共识层进行了简单的实现。
安装教程
1. 导入dce-blockchain工程到IDE中，目录结构如下：
     
2. 配置maven环境，下载依赖包，可以通过阿里巴巴maven库下载，速度比较快。
3. 运行系统。
使用说明
系统启动后，可通过Postman进行操作，返回json格式的数据。
1. 查看区块链数据
http://localhost:8080/scan
2. 创建创世区块
http://localhost:8080/create
3. 挖矿生成新区块
http://localhost:8080/mine
4. 查看区块链中存储的业务数据
http://localhost:8080/data