package com.tony666.examples.spring.java9.refund.integration.facade;

import com.tony666.examples.spring.java9.refund.facade.refund.AbstractRefund;
import com.tony666.examples.spring.java9.refund.facade.refund.vo.RefundReq;
import com.tony666.examples.spring.java9.refund.facade.refund.vo.RefundRes;
import com.tony666.examples.spring.java9.specification.facade.Specification;
import com.tony666.examples.spring.java9.state.constant.refund.RefundState;
import com.tony666.examples.spring.java9.third.party.jf.facade.JfRefundService;
import com.tony666.examples.spring.java9.third.party.jf.facade.vo.JfRefundReq;
import com.tony666.examples.spring.java9.third.party.jf.facade.vo.JfRefundRes;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IntegrationRefund extends AbstractRefund {

    private final JfRefundService jfRefundService;

    public IntegrationRefund(JfRefundService jfRefundService, List<Specification<RefundState>> specifications) {
        super(specifications);
        this.jfRefundService = jfRefundService;
    }

    @Override
    public Optional<RefundRes> doPayment(RefundReq refundReq) {
        // mock invoke.
        Optional<JfRefundRes> refund = jfRefundService.refund(new JfRefundReq());
        if (refund.isPresent())
            return Optional.of(new RefundRes(RefundState.SUCCESS));
        return Optional.empty();
    }
}
