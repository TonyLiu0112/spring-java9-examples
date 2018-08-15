package com.tony666.examples.spring.java9.state.constant.payment;

public enum TradeAccountType {

    PHONE(1, "手机号"),
    ACCOUNT(2, "资金账号");

    private final int flag;
    private final String desc;

    TradeAccountType(int flag, String desc) {
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
