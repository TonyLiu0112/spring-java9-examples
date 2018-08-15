module trade.basic {

    // pay
    exports com.tony666.examples.spring.java9.refund.facade.payment;
    exports com.tony666.examples.spring.java9.refund.facade.payment.vo;
    // refund
    exports com.tony666.examples.spring.java9.refund.facade.refund;
    exports com.tony666.examples.spring.java9.refund.facade.refund.vo;

    requires trade.specification;
    requires transitive trade.state;
}