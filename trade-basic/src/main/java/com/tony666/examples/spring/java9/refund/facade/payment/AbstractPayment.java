package com.tony666.examples.spring.java9.refund.facade.payment;

import com.tony666.examples.spring.java9.refund.facade.payment.vo.PaymentReq;
import com.tony666.examples.spring.java9.refund.facade.payment.vo.PaymentRes;
import com.tony666.examples.spring.java9.specification.facade.Specification;
import com.tony666.examples.spring.java9.specification.helper.SpecificationCollector;
import com.tony666.examples.spring.java9.state.constant.payment.PaymentState;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public abstract class AbstractPayment implements Payment {

    private List<Specification<PaymentState>> paymentSpecification = new ArrayList<>();

    public AbstractPayment() {
    }

    @SuppressWarnings("ClassEscapesDefinedScope")
    public AbstractPayment(List<Specification<PaymentState>> paymentSpecification) {
        this.paymentSpecification = paymentSpecification;
    }

    @Override
    public Optional<PaymentRes> payment(PaymentReq paymentReq) {
        Optional<PaymentRes> paymentRes = doCheck(paymentReq);
        if (paymentRes.isPresent())
            return paymentRes;
        return doPayment(paymentReq);
    }

    private Optional<PaymentRes> doCheck(PaymentReq paymentReq) {
        PaymentState checkRes = paymentSpecification.stream().collect(new SpecificationCollector<>(paymentReq));
        return checkRes == null ? Optional.empty() : Optional.of(new PaymentRes(checkRes));
    }

    public abstract Optional<PaymentRes> doPayment(PaymentReq paymentReq);

}
