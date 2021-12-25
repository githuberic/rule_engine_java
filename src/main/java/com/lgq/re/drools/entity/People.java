package com.lgq.re.drools.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author lgq
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class People {
    private int sex;

    private String name;

    private Integer age;

    private String drlType;

    public People(int sex, String name, String drlType) {
        this.sex = sex;
        this.name = name;
        this.drlType = drlType;
    }
}
