package com.tony666.examples.spring.java9.state.constant.payment;

/**
 * 支付渠道
 *
 * @author Tony
 */
public enum PaymentChannelType {

    NONE(-1, "未知类型"),
    INTEGRAL(1, "积分方式支付"),
    BOND(2, "保证金方式支付");

    private final int flag;

    private final String desc;

    PaymentChannelType(int flag, String desc) {
        this.flag = flag;
        this.desc = desc;
    }

    public int getFlag() {
        return flag;
    }

    public String getDesc() {
        return desc;
    }
}
