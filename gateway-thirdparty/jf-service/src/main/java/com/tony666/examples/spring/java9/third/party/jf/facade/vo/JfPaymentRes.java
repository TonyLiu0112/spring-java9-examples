package com.tony666.examples.spring.java9.third.party.jf.facade.vo;

import com.tony666.examples.spring.java9.third.party.jf.constant.JfPaymentState;

public class JfPaymentRes {

    private JfPaymentState paymentState;

    private Long ID;

    private String CODE;

    private String NOTE;

    /**
     * 结算金额
     */
    private String JSJE;

    private String WTH;

    private String SXRQ;

    private String YXRQ;

    public JfPaymentRes() {
    }

    public JfPaymentRes(String CODE, String NOTE) {
        this.CODE = CODE;
        this.NOTE = NOTE;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public JfPaymentState getPaymentState() {
        return paymentState;
    }

    public void setPaymentState(JfPaymentState paymentState) {
        this.paymentState = paymentState;
    }

    public String getCODE() {
        return CODE;
    }

    public void setCODE(String CODE) {
        this.CODE = CODE;
    }

    public String getNOTE() {
        return NOTE;
    }

    public void setNOTE(String NOTE) {
        this.NOTE = NOTE;
    }

    public String getJSJE() {
        return JSJE;
    }

    public void setJSJE(String JSJE) {
        this.JSJE = JSJE;
    }

    public String getWTH() {
        return WTH;
    }

    public void setWTH(String WTH) {
        this.WTH = WTH;
    }

    public String getSXRQ() {
        return SXRQ;
    }

    public void setSXRQ(String SXRQ) {
        this.SXRQ = SXRQ;
    }

    public String getYXRQ() {
        return YXRQ;
    }

    public void setYXRQ(String YXRQ) {
        this.YXRQ = YXRQ;
    }
}
