package com.example.awaysuse.model;

import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * Person
 *
 * @author fxbin
 * @version v1.0
 * @since 2019/9/15 23:04
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@ToString
public class Person implements Serializable {

    private static final long serialVersionUID = 8510634155374943623L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 名字
     */
    private String name;

    /**
     * 国家
     */
    private String country;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 生日
     */
    private Date birthday;

    /**
     * 介绍
     */
    private String remark;

}
