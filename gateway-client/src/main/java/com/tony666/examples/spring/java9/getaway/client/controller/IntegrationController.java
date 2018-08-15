package com.tony666.examples.spring.java9.getaway.client.controller;

import com.tony666.examples.spring.java9.refund.facade.payment.Payment;
import com.tony666.examples.spring.java9.refund.facade.payment.vo.PaymentReq;
import com.tony666.examples.spring.java9.refund.facade.payment.vo.PaymentRes;
import com.tony666.examples.spring.java9.refund.facade.refund.Refund;
import com.tony666.examples.spring.java9.refund.facade.refund.vo.RefundReq;
import com.tony666.examples.spring.java9.refund.facade.refund.vo.RefundRes;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("trade")
public class IntegrationController {

    private final Payment payment;
    private final Refund refund;

    public IntegrationController(Payment payment, Refund refund) {
        this.payment = payment;
        this.refund = refund;
    }

    @GetMapping("pay")
    public ResponseEntity<Object> pay() {
        Optional<PaymentRes> paymentRes = payment.payment(new PaymentReq());
        return new ResponseEntity<>(paymentRes, HttpStatus.OK);
    }

    @GetMapping("refund")
    public ResponseEntity<Object> refund() {
        Optional<RefundRes> refundRes = refund.refund(new RefundReq());
        return new ResponseEntity<>(refundRes, HttpStatus.OK);
    }

}
