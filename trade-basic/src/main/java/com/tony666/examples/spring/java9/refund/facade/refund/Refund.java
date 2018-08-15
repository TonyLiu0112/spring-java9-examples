package com.tony666.examples.spring.java9.refund.facade.refund;


import com.tony666.examples.spring.java9.refund.facade.refund.vo.RefundReq;
import com.tony666.examples.spring.java9.refund.facade.refund.vo.RefundRes;

import java.util.Optional;

/**
 * 退款
 *
 * @author Tony
 */
public interface Refund {

    /**
     * 退款
     */
    Optional<RefundRes> refund(RefundReq refundReq);

}
