module refund.integration {
    requires trade.basic;
    requires trade.specification;
    requires spring.context;
    requires jf.service;

    opens com.tony666.examples.spring.java9.refund.integration.facade;
    opens com.tony666.examples.spring.java9.refund.integration.config;
}