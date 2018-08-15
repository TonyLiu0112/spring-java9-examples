package com.tony666.examples.spring.java9.third.party.jf.service;

import com.tony666.examples.spring.java9.third.party.jf.facade.JfPaymentService;
import com.tony666.examples.spring.java9.third.party.jf.facade.vo.JfPaymentReq;
import com.tony666.examples.spring.java9.third.party.jf.facade.vo.JfPaymentRes;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class JfPaymentServiceImpl implements JfPaymentService {
    @Override
    public Optional<JfPaymentRes> payment(JfPaymentReq jfPaymentReq) {
        // always success.
        return Optional.of(new JfPaymentRes());
    }
}
