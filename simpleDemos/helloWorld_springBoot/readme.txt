1 BaseMapper UpdateWrapper QueryMapper LambdaQueryWrapper简单测试
2 自定义mapper
3 @TableName @TableId @TableField
4
    @TableLogic 逻辑删除，需要在表中添加 is_deleted int 0,实体类添加Integer isDeleted属性
    LogicDeleteTest.java
5 分页查询
    MyBatisConf.java MybatisPlusTest.java
4 自定义分页查询
    UserMapper.java selectPageByAge
    UserMapperTest.java selectPageByAge
5 乐观锁
    ProductMapper Product  MyBatisConf
    ProductMapperTests
6 事务
    UserServiceImpl
    UserServiceImplTests
7 枚举
    Sex
    User.sex
    UserMapper
    MybatisPlusEnumTest
    application.properties
