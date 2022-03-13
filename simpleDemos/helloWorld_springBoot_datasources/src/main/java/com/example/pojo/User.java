package com.example.pojo;

import lombok.Data;

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
public class User {
    private Long id;
    private String name;
    private Integer age;
    private Integer sex;
    private String email;
}
