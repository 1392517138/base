package com.wenjing.mybatis.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author Aaron
 * @description
 * @date 2021/5/10 下午5:34
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {
    Integer id;
    String name;
    Integer age;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}
