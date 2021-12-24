package com.lgq.re.drools.entity;

import lombok.Data;

/**
 * @author lgq
 */
@Data
public class People {
    private int sex;

    private String name;

    private Integer age;

    private String drlType;

    public People(int sex, String name, Integer age, String drlType) {
        this.sex = sex;
        this.name = name;
        this.age = age;
        this.drlType = drlType;
    }

    public People(int sex, String name, String drlType) {
        this.sex = sex;
        this.name = name;
        this.drlType = drlType;
    }

    public People() {
    }
}
