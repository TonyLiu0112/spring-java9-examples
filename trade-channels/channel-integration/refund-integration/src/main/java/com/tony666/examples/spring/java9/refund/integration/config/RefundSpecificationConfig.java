package com.tony666.examples.spring.java9.refund.integration.config;

import com.tony666.examples.spring.java9.specification.facade.Specification;
import com.tony666.examples.spring.java9.specification.service.refund.RepeatRefundSpecification;
import com.tony666.examples.spring.java9.state.constant.refund.RefundState;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RefundSpecificationConfig {

    @Bean
    public Specification<RefundState> repeatRefundSpecification() {
        return new RepeatRefundSpecification();
    }

}
