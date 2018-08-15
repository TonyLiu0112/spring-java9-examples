module payment.integration {
    // self.
    requires transitive trade.basic;
    requires trade.specification;
    requires jf.service;

    // about spring.
    requires spring.beans;
    requires spring.context;

    opens com.tony666.examples.spring.java9.payment.integration.facade;
    opens com.tony666.examples.spring.java9.payment.integration.config;
}