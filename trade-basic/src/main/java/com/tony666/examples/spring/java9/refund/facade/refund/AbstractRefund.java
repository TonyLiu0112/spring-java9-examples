package com.tony666.examples.spring.java9.refund.facade.refund;

import com.tony666.examples.spring.java9.refund.facade.refund.vo.RefundReq;
import com.tony666.examples.spring.java9.refund.facade.refund.vo.RefundRes;
import com.tony666.examples.spring.java9.specification.facade.Specification;
import com.tony666.examples.spring.java9.specification.helper.SpecificationCollector;
import com.tony666.examples.spring.java9.state.constant.refund.RefundState;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public abstract class AbstractRefund implements Refund {

    private List<Specification<RefundState>> refundSpecification = new ArrayList<>();

    public AbstractRefund() {
    }

    @SuppressWarnings("ClassEscapesDefinedScope")
    public AbstractRefund(List<Specification<RefundState>> refundSpecification) {
        this.refundSpecification = refundSpecification;
    }

    @Override
    public Optional<RefundRes> refund(RefundReq refundReq) {
        Optional<RefundRes> paymentRes = doCheck(refundReq);
        if (paymentRes.isPresent())
            return paymentRes;
        return doPayment(refundReq);
    }

    private Optional<RefundRes> doCheck(RefundReq refundReq) {
        RefundState checkRes = refundSpecification.stream().collect(new SpecificationCollector<>(refundReq));
        return checkRes == null ? Optional.empty() : Optional.of(new RefundRes(checkRes));
    }

    public abstract Optional<RefundRes> doPayment(RefundReq paymentReq);

}
