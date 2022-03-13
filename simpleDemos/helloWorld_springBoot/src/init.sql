CREATE TABLE `mybatisPlusdatabase`.`user`
(
    `id`    BIGINT(20) NOT NULL COMMENT '主键id',
    `name`  VARCHAR(30) COMMENT '姓名',
    `age`   INT(11) COMMENT '年龄',
    `sex`   INT(2) COMMENT '性别 0 男 1 女',
    `email` VARCHAR(50) COMMENT '邮箱',
    PRIMARY KEY (`id`)
);

INSERT INTO USER (id, NAME, age, sex,email)
VALUES (1, 'Jone', 18, 0,'12345@qq.com'),
       (2, 'Jack', 20, 0,'12345@qq.com'),
       (3, 'Tom', 28, 0,'12345@qq.com'),
       (4, 'Sandy', 21, 0,'12345@qq.com'),
       (5, 'Billie', 24, 0,'12345@qq.com');
#支持逻辑删除
CREATE TABLE `user_logic`
(
    `id`         BIGINT,
    `name`       VARCHAR(20),
    `age`        INT,
    `email`      VARCHAR(20),
    `is_deleted` INT
);
insert into `user_logic` (`id`, `name`, `age`, `email`, `is_deleted`)
values ('1', 'Jone', '18', '12345@qq.com', '0');
insert into `user_logic` (`id`, `name`, `age`, `email`, `is_deleted`)
values ('2', 'Jack', '20', '12345@qq.com', '0');
insert into `user_logic` (`id`, `name`, `age`, `email`, `is_deleted`)
values ('3', 'Tom', '28', '12345@qq.com', '0');
insert into `user_logic` (`id`, `name`, `age`, `email`, `is_deleted`)
values ('5', 'Billie', '24', '12345@qq.com', '0');

create table `t_product`
(
    `id`      bigint,
    `name`    varchar,
    `price`   int,
    `version` int default 0
);
insert into `t_product` (`id`, `name`, `price`, `version`)
values ('11', 'product1', '100', 0);