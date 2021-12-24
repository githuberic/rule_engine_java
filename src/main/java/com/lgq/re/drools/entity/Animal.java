package com.lgq.re.drools.entity;

import lombok.Data;

import java.util.List;

/**
 * @author lgq
 */
@Data
public class Animal {

    private Integer level;

    private List<People> peoples;

}
