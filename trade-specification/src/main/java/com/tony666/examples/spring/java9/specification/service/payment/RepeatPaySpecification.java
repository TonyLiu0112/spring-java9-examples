package com.tony666.examples.spring.java9.specification.service.payment;

import com.tony666.examples.spring.java9.specification.facade.Specification;
import com.tony666.examples.spring.java9.state.constant.payment.PaymentState;

import java.util.Random;

/**
 * 重复支付规格
 *
 * @author Tony
 */
public class RepeatPaySpecification implements Specification<PaymentState> {

    @Override
    public boolean isSatisfied(Object candidate) {
        Random random = new Random();
        return random.nextInt(100) > 50;
    }

    @Override
    public PaymentState getResult() {
        return PaymentState.REPEATED_PAYMENT;
    }

}
