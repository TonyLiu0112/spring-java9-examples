package com.tony666.examples.spring.java9.payment.integration.facade;

import com.tony666.examples.spring.java9.refund.facade.payment.AbstractPayment;
import com.tony666.examples.spring.java9.refund.facade.payment.vo.PaymentReq;
import com.tony666.examples.spring.java9.refund.facade.payment.vo.PaymentRes;
import com.tony666.examples.spring.java9.specification.facade.Specification;
import com.tony666.examples.spring.java9.state.constant.payment.PaymentState;
import com.tony666.examples.spring.java9.third.party.jf.facade.JfPaymentService;
import com.tony666.examples.spring.java9.third.party.jf.facade.vo.JfPaymentReq;
import com.tony666.examples.spring.java9.third.party.jf.facade.vo.JfPaymentRes;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IntegrationPayment extends AbstractPayment {

    private final JfPaymentService jfPaymentService;

    public IntegrationPayment(JfPaymentService jfPaymentService, List<Specification<PaymentState>> paymentSpecifications) {
        super(paymentSpecifications);
        this.jfPaymentService = jfPaymentService;
    }

    @Override
    public Optional<PaymentRes> doPayment(PaymentReq paymentReq) {
        JfPaymentReq jfPaymentReq = new JfPaymentReq();
        BeanUtils.copyProperties(paymentReq, jfPaymentReq);
        Optional<JfPaymentRes> payment = jfPaymentService.payment(jfPaymentReq);
        if (payment.isPresent()) {
            JfPaymentRes jfPaymentRes = payment.get();
            PaymentRes res = new PaymentRes();
            BeanUtils.copyProperties(jfPaymentRes, res);
            res.setPaymentState(PaymentState.SUCCESS);
            return Optional.of(res);
        }
        return Optional.empty();
    }
}
