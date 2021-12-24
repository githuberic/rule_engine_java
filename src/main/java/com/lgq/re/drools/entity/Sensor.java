package com.lgq.re.drools.entity;

import lombok.Data;

/**
 * @author lgq
 */
@Data
public class Sensor {

    private String description;

    private Double temp;

    public Sensor() {
    }

    public Sensor(String description, Double temp) {
        this.description = description;
        this.temp = temp;
    }
}
