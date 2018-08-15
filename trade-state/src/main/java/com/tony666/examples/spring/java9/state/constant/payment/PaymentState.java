package com.tony666.examples.spring.java9.state.constant.payment;

import java.util.Arrays;

/**
 * 支付接口响应状态
 *
 * @author Tony
 */
public enum PaymentState {
    WAIT(1, "待支付"),
    PAYING(2, "支付中"),
    SUCCESS(3, "支付成功"),
    FAILED(4, "支付失败"),
    // specification state.
    PRICE_UN_MATCH(5, "价格不匹配(打赏除外)"),
    INTEGRAL_INSUFFICIENT(6, "您的账户积分余额不足，您可以参与活动赚积分"),
    UNKNOW_PRODUCT_TYPE(7, "未知的产品类型"),
    REPEATED_PAYMENT(8, "订单重复支付"),
    UN_BIND_ACCOUNT(9, "未绑定资金账号!"),
    LOGIN_ACCOUNT_UN_MATCH(10, "登录的资金账号和绑定的资金账号不一致!"),
    OUT_OF_TRADE_PERIOD(11, "受保证金支付时间限制，请于交易日交易时间（09:00~15:00）发起支付");

    private final int flag;
    private final String desc;

    PaymentState(int flag, String desc) {
        this.flag = flag;
        this.desc = desc;
    }

    public int getFlag() {
        return flag;
    }

    public String getDesc() {
        return desc;
    }

    public static PaymentState getState(int flag) {
        return Arrays.stream(PaymentState.values()).filter(state -> state.getFlag() == flag).findFirst().orElse(null);
    }

    public static void main(String[] args) {
        System.out.println(PaymentState.getState(0));
        System.out.println(PaymentState.getState(1));
    }
}
