package com.example.pojo;

import com.example.pojo.enmus.Sex;
import lombok.*;

/**
 * created by dfk
 * 3/12/2022
 */

//@NoConstructor
//@AllArgsConstructor//所有参数构造
//@Getter
//@Setter
//@EqualsAndHashCode

/**
 * 相当于 @NoConstructor+@Getter+@Setter+@EqualsAndHashCode
 */
@Data
//@TableName("user")//不适用的时候，默认是类名
public class User {
    //    @TableId 该属性为主键，如果属性的名字id则可以省略该注解
    //    @TableId("id") 对应的表列名字为 id
    private Long id;
    //    @TableField("name") 对应的列名
    private String name;
    private Integer age;
    private Sex sex;
    private String email;
}
