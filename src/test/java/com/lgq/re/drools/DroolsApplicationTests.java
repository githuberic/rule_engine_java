package com.lgq.re.drools;

import com.lgq.re.drools.entity.Animal;
import com.lgq.re.drools.entity.Cat;
import com.lgq.re.drools.entity.People;
import com.lgq.re.drools.entity.Sensor;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.kie.api.runtime.KieSession;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.ArrayList;

@SpringBootTest
@RunWith(SpringRunner.class)
class DroolsApplicationTests {

    @Resource
    private KieSession session;

    @Test
    public void people() {
        People people = new People();
        people.setName("lgq");
        people.setSex(1);
        people.setDrlType("people");
        session.insert(people);
        session.fireAllRules();
    }

    @Test
    public void cat() {
        Cat cat = new Cat();
        cat.setName("金");
        cat.setSex(1);
        session.insert(cat);
        session.fireAllRules();
    }

    @Test
    public void from() {
        People p1 = new People(1, "达", "from");
        People p2 = new People(0, "秋", "from");
        People p3 = new People(3, "金", "from");
        Animal animal = new Animal();
        animal.setPeoples(new ArrayList<>());
        animal.getPeoples().add(p1);
        animal.getPeoples().add(p2);
        animal.getPeoples().add(p3);
        session.insert(animal);
        session.fireAllRules();
    }

    @Test
    public void collect() {
        session.insert(new People(1, "达", "collect"));
        session.insert(new People(0, "秋", "collect"));
        session.insert(new People(0, "春", "collect"));
        session.insert(new People(1, "夏", "collect"));
        session.insert(new People(0, "冬", "collect"));
        session.insert(new People(3, "金", "collect"));

        session.fireAllRules();//执行规则
    }

    @Test
    public void accumulate() {
        session.insert(new Sensor("达", 8.26));
        session.insert(new Sensor("秋", 7.12));
        session.insert(new Sensor("春", 3.24));
        session.insert(new Sensor("夏", 6.32));
        session.insert(new Sensor("冬", 12.23));
        session.insert(new Sensor("金", 10.8));

        session.fireAllRules();//执行规则
    }

    @Test
    public void diyaccumulate() {
        session.insert(new People(1, "达", 26, "diyaccumulate"));
        session.insert(new People(0, "秋", 18, "diyaccumulate"));
        session.insert(new People(0, "春", 38, "diyaccumulate"));
        session.insert(new People(1, "夏", 90, "diyaccumulate"));
        session.insert(new People(0, "冬", 55, "diyaccumulate"));
        session.insert(new People(3, "金", 12, "diyaccumulate"));

        session.fireAllRules();//执行规则
    }

    @AfterEach
    public void runDispose() {
        session.dispose();//释放资源
    }
}
