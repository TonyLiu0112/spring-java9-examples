import com.tony666.examples.spring.java9.specification.facade.Specification;

module trade.specification {
    uses Specification;

    requires trade.state;
    requires spring.context;

    exports com.tony666.examples.spring.java9.specification.facade;
    exports com.tony666.examples.spring.java9.specification.service.refund;
    exports com.tony666.examples.spring.java9.specification.service.payment;
    exports com.tony666.examples.spring.java9.specification.helper;

    opens com.tony666.examples.spring.java9.specification.service.payment;
    opens com.tony666.examples.spring.java9.specification.service.refund;
}