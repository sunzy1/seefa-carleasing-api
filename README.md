
项目描述: **seefa-demo demo工程**



```
项目根目录
├── seefa-demo-api -- 业务接口(entity,dto,constant,feign接口等定义)
├── seefa-demo-biz -- 业务实现[默认服务端口 : 8200] 
```

_0.本地hosts配置_
    192.168.88.189 seefa
    192.168.88.189 seefa-gateway
    192.168.88.189 seefa-redis
    192.168.88.189 seefa-mysql
    192.168.88.189 seefa-sentinel
    MySql数据库：db: seefa_demo   user/pwd: root/root
    Nacos控制台：http://seefa:8848/nacos/   user/pwd: nacos/nacos
    seefa-sentinel控制台：http://seefa-sentinel:5020/  user/pwd: sentinel/sentinel
    MinIo Browser：http://192.168.88.189:9000/   AccessKey/SecretKey:seefa/seefa@8888

__1.基础框架：_
    spring boot、MyBatisPlus
    
_2. 统一异常处理模块_
    1.1 业务异常码定义：messages_zh_CN.properties
    1.2 各业务模块错误码常量类：MessageCodes
    1.3 构建并抛出业务异常，使用 throw BizExceptionBuilder.build()

_3.消息中间件集成_
    使用Spring Cloud Stream通用编程模型集成MQ，目前使用rocketMq。
     cn.seehoo.seefa.car.message包下面定义message channel 
     以及message发送及监听服务
     通过@EnableBinding启用
     
_4.邮件发送_     
    基于java mail，CommonMailServiceImpl 类提供邮件发送服务

_5.文件存储_
    使用Minio做分布式存储，
    使用MinioTemplate，进行文件相关操作，只需在service中依赖注入即可
    
_6.HTTP客户端_
    调用第三方接口，非微服务内进程通信，可以使用common-httpclient 组件下的SimpleClient

_7.spring-data-redis_ 作为redis客户端
    依赖注入RedisTemplate即可，目前有2种类型：RedisTemplate<String, String> redisTemplate、
    RedisTemplate<String, Object>  redisTemplate

_8.使用统一的响应报文格式_
 Controller方法返回值统一为R<>类型，即将Service层返回值用R包装
