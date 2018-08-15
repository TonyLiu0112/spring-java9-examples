package com.tony666.examples.spring.java9.specification.service.refund;

import com.tony666.examples.spring.java9.specification.facade.Specification;
import com.tony666.examples.spring.java9.state.constant.refund.RefundState;

import java.util.Random;

/**
 * 重复支付规格
 *
 * @author Tony
 */
public class RepeatRefundSpecification implements Specification<RefundState> {

    @Override
    public boolean isSatisfied(Object candidate) {
        Random random = new Random();
        return random.nextInt(100) > 50;
    }

    @Override
    public RefundState getResult() {
        return RefundState.REPEATED_REFUND;
    }

}
