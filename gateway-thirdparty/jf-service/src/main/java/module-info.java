module jf.service {
    exports com.tony666.examples.spring.java9.third.party.jf.facade;
    exports com.tony666.examples.spring.java9.third.party.jf.facade.vo;

    requires spring.context;

    opens com.tony666.examples.spring.java9.third.party.jf.service;
    opens com.tony666.examples.spring.java9.third.party.jf.facade;
}