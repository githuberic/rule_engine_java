package com.lgq.re.drools.service;

import com.lgq.re.drools.entity.People;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lgq
 */
@Service
public class InitService {
    public static List<People> getPeoples() {
        List<People> peoples = new ArrayList<>();
        peoples.add(new People(1, "春", "global"));
        peoples.add(new People(2, "夏", "global"));
        peoples.add(new People(3, "秋", "global"));
        peoples.add(new People(4, "冬", "global"));
        peoples.add(new People(5, "达", "global"));
        return peoples;
    }
}
