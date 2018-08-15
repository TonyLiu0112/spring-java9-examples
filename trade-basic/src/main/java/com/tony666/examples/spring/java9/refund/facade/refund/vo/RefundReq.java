package com.tony666.examples.spring.java9.refund.facade.refund.vo;

public class RefundReq {

    /**
     * 订单号
     */
    private String orderNo;

    /**
     * 退款回调方法
     */
    private String refundRespMethod;

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getRefundRespMethod() {
        return refundRespMethod;
    }

    public void setRefundRespMethod(String refundRespMethod) {
        this.refundRespMethod = refundRespMethod;
    }
}
