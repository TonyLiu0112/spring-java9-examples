package com.tony666.examples.spring.java9.third.party.jf.service;

import com.tony666.examples.spring.java9.third.party.jf.facade.JfRefundService;
import com.tony666.examples.spring.java9.third.party.jf.facade.vo.JfRefundReq;
import com.tony666.examples.spring.java9.third.party.jf.facade.vo.JfRefundRes;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class JfRefundServiceImpl implements JfRefundService {

    @Override
    public Optional<JfRefundRes> refund(JfRefundReq jfRefundReq) {
        // always success.
        return Optional.of(new JfRefundRes());
    }
}
