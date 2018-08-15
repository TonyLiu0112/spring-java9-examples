package com.tony666.examples.spring.java9.state.constant.refund;

import java.util.Arrays;

public enum RefundState {
    WAIT(1, "待退款"),
    REFUNDING(2, "退款中"),
    SUCCESS(3, "退款成功"),
    FAILED(4, "退款失败"),
    REPEATED_REFUND(5, "您已申请过退款!");

    private final int flag;
    private final String desc;

    RefundState(int flag, String desc) {
        this.flag = flag;
        this.desc = desc;
    }

    public int getFlag() {
        return flag;
    }

    public String getDesc() {
        return desc;
    }

    public static RefundState getState(int flag) {
        return Arrays.stream(RefundState.values()).filter(state -> state.getFlag() == flag).findFirst().orElse(null);
    }
}
