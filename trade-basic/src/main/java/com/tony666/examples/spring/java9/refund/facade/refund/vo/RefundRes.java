package com.tony666.examples.spring.java9.refund.facade.refund.vo;


import com.tony666.examples.spring.java9.state.constant.refund.RefundState;

/**
 * 退款响应
 *
 * @author Tony
 */
public class RefundRes {

    /**
     * 退款状态
     */
    private RefundState refundState;

    /**
     * 订单号
     */
    private String orderNo;

    /**
     * 订单流水号，外部支付接口使用
     */
    private String orderSerialNo;

    /**
     * 业务元数据
     */
    private String businessMetadata;

    public RefundRes() {
    }

    public RefundRes(RefundState refundState) {
        this.refundState = refundState;
    }

    public RefundRes(RefundState refundState, String orderNo, String businessMetadata) {
        this.refundState = refundState;
        this.orderNo = orderNo;
        this.businessMetadata = businessMetadata;
    }

    public RefundState getRefundState() {
        return refundState;
    }

    public void setRefundState(RefundState refundState) {
        this.refundState = refundState;
    }

    public String getBusinessMetadata() {
        return businessMetadata;
    }

    public void setBusinessMetadata(String businessMetadata) {
        this.businessMetadata = businessMetadata;
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
}
