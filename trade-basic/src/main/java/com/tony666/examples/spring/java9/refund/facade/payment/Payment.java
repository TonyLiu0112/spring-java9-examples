package com.tony666.examples.spring.java9.refund.facade.payment;

import com.tony666.examples.spring.java9.refund.facade.payment.vo.PaymentReq;
import com.tony666.examples.spring.java9.refund.facade.payment.vo.PaymentRes;

import java.util.Optional;

/**
 * 支付
 *
 * @author Tony
 */
public interface Payment {

    /**
     * 支付
     */
    Optional<PaymentRes> payment(PaymentReq paymentReq);

}