package com.tony666.examples.spring.java9.third.party.jf.facade;

import com.tony666.examples.spring.java9.third.party.jf.facade.vo.JfPaymentReq;
import com.tony666.examples.spring.java9.third.party.jf.facade.vo.JfPaymentRes;

import java.util.Optional;

public interface JfPaymentService {

    Optional<JfPaymentRes> payment(JfPaymentReq jfPaymentReq);

}
