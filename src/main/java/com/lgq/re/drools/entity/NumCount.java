package com.lgq.re.drools.entity;

import lombok.Data;

/**
 * @author lgq
 */
@Data
public class NumCount {

    private int count;

    public void plus() {
        count = count + 1;
    }
}
