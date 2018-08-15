package com.tony666.examples.spring.java9.third.party.jf.facade;

import com.tony666.examples.spring.java9.third.party.jf.facade.vo.JfRefundReq;
import com.tony666.examples.spring.java9.third.party.jf.facade.vo.JfRefundRes;

import java.util.Optional;

public interface JfRefundService {

    Optional<JfRefundRes> refund(JfRefundReq jfRefundReq);

}
