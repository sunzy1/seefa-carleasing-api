一.tsys_administrative_region区域表(例子：DemoRest)

1.根据area_code查询区域信息

2.根据area_code查询所有下属机构

3.根据area_level进行分页查询

4.对tsys_administrative_region进行动态查询

5.使用MybatisPlus的Wrapper进行实现1,2任务

6.批量插入(tinfo_subject_info)表数据

7.查询学生信息和所修的课程及分数(多表查询)

8.对7查询出来的数据进行字段翻译(将数据库中查出的0,1翻译成男女)


二.熟悉常用工具类(hutool工具包)

StrUtil 字符串有关工具类

CollectionUtil 集合工具类

ArrayUtil 数组工具类

DateUtil 日期工具类

SimpleClient http请求

1.获得当前时间并转换为（yyyyMMdd）

2.判断字符为空，数组为空,List为空

3.判断集合是否包含该数据

三.参数校验(DemoRest verification方法)

对输入参数进行基本的参数校验(例如非空校验)

对参数进行自定义校验(例 身份证校验,民族校验)

1.自定义一个注解

2.自定义一个校验

四.自定义业务异常

在MessageCodes中定义

在messages_zh_CN.properties定义

使用throw BizExceptionBuilder.build()抛出异常

1.自定义一个异常

五.日志的打印与规范
类使用@Slf4j注解

异常使用log.error();打印规范log.error("sys execute exception:", biz);

使用占位符打印日志
例：log.info("LinkFin数据同步任务处理：uid={},oderNo={},taskFlag={}", msg.getUid(), msg.getAssetOrderNo(), msg.getTaskFlag());

无须重复打印日志。

不要使用 System.out.println();

1.对自己写的方法进行日志的打印


六.编程规范

1.方法命名使用驼峰命名首字母小写，类命名时驼峰命名;

2.每一个方法,属性和类上需要加上注释

3.常量命名使用大写字母和下划线分割  例 CACHE_MODULE_PROVINCE

4.变量禁止使用单字母命名。

5.逻辑尽量不要写在controller层。

6.mapper层也需要添加注释,sql语句查询禁止使用(select *) 

7.编码需要使用阿里编码规约扫描为没有警告

8.进行数据库操作时需要使用事务(例@Transactional(rollbackFor = Exception.class))

9.在测试类中进行测试,不要修改业务类逻辑