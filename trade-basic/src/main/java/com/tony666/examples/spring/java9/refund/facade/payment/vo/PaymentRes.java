package com.tony666.examples.spring.java9.refund.facade.payment.vo;


import com.tony666.examples.spring.java9.state.constant.payment.PaymentState;

import java.util.Date;

/**
 * 支付结果
 *
 * @author Tony
 */
public class PaymentRes {

    /**
     * 支付状态
     */
    private PaymentState paymentState;

    /**
     * 订单号
     */
    private String orderNo;

    /**
     * 订单流水号，外部支付接口使用
     */
    private String orderSerialNo;

    /**
     * 支付完成时间
     */
    private Date payEndTime;

    /**
     * 业务元数据
     */
    private String businessMetadata;

    public PaymentRes() {
    }

    public PaymentRes(PaymentState paymentState, String orderNo, Date payEndTime, String businessMetadata) {
        this.paymentState = paymentState;
        this.orderNo = orderNo;
        this.payEndTime = payEndTime;
        this.businessMetadata = businessMetadata;
    }

    public PaymentRes(PaymentState paymentState) {
        this.paymentState = paymentState;
    }

    public PaymentState getPaymentState() {
        return paymentState;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getOrderSerialNo() {
        return orderSerialNo;
    }

    public void setOrderSerialNo(String orderSerialNo) {
        this.orderSerialNo = orderSerialNo;
    }

    public void setPaymentState(PaymentState paymentState) {
        this.paymentState = paymentState;
    }

    public Date getPayEndTime() {
        return payEndTime;
    }

    public void setPayEndTime(Date payEndTime) {
        this.payEndTime = payEndTime;
    }

    public String getBusinessMetadata() {
        return businessMetadata;
    }

    public void setBusinessMetadata(String businessMetadata) {
        this.businessMetadata = businessMetadata;
    }
}
