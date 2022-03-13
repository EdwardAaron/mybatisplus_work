CREATE TABLE `mybatisPlusdatabase`.`user`
(
    `id`    BIGINT(20) NOT NULL COMMENT '主键id',
    `name`  VARCHAR(30) COMMENT '姓名',
    `age`   INT(11) COMMENT '年龄',
    `sex`   INT(2) COMMENT '性别 0 男 1 女',
    `email` VARCHAR(50) COMMENT '邮箱',
    PRIMARY KEY (`id`)
);
CREATE TABLE `mybatisPlusdatabase_slave1`.`user`
(
    `id`    BIGINT(20) NOT NULL COMMENT '主键id',
    `name`  VARCHAR(30) COMMENT '姓名',
    `age`   INT(11) COMMENT '年龄',
    `sex`   INT(2) COMMENT '性别 0 男 1 女',
    `email` VARCHAR(50) COMMENT '邮箱',
    PRIMARY KEY (`id`)
);
INSERT INTO `mybatisPlusdatabase`.USER (id, NAME, age, sex,email)
VALUES (1, 'JoneIn_mybatisPlusdatabase', 18, 0,'12345@qq.com');
INSERT INTO `mybatisPlusdatabase_slave1`.USER (id, NAME, age, sex,email)
VALUES (1, 'JoneIn_mybatisPlusdatabase_slave1', 18, 0,'12345@qq.com');