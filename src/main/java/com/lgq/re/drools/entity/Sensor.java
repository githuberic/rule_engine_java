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
public class Sensor {
    private String description;
    private Double temp;
}
