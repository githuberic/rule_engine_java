package com.lgq.re.drools.action;

import com.lgq.re.drools.entity.Person;
import org.drools.core.definitions.rule.impl.RuleImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author lgq
 */
public class PersonRuleAction {
    private static Logger LOG = LoggerFactory.getLogger(PersonRuleAction.class);

    // 目前只实现记录日志功能
    public static void doParse(Person person, RuleImpl rule) {
        LOG.debug("{} is matched Rule[{}]!", person, rule.getName());
    }
}
