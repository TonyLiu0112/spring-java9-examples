package com.tony666.examples.spring.java9.payment.integration.config;

import com.tony666.examples.spring.java9.specification.facade.Specification;
import com.tony666.examples.spring.java9.specification.service.payment.BalanceSpecification;
import com.tony666.examples.spring.java9.specification.service.payment.RepeatPaySpecification;
import com.tony666.examples.spring.java9.state.constant.payment.PaymentState;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PaySpecificationConfig {

    @Bean
    public Specification<PaymentState> balanceSpecification() {
        return new BalanceSpecification();
    }

    @Bean
    public Specification<PaymentState> repeatPaySpecification() {
        return new RepeatPaySpecification();
    }

}
