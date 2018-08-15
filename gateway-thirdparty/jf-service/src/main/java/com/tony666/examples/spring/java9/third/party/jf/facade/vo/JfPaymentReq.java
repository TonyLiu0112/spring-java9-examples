package com.tony666.examples.spring.java9.third.party.jf.facade.vo;

public class JfPaymentReq {

    /**
     * 理财账号: 资金账号
     */
    private String LCZH;

    /**
     * 结算账号
     */
    private String JSZH;

    /**
     * 服务渠道: 64 手机交易
     */
    private String FWQD;

    /**
     * 产品代码
     */
    private String CPDM;

    /**
     * 产品类型
     * 1506 在线投顾观点
     * 1507 在线投顾直播间
     * 1508 在线投顾问股
     */
    private Integer CPLX;

    /**
     * 外部流水号
     * <p>
     * 外部订单流水号，维度是订单流水
     * 编码规则是：
     * 2位供应商编码+8位日期时间字符串+10位供应商订单序号
     */
    private String WBLSH;

    /**
     * 外部ID: crm的观点、问股ID、直播间ID
     */
    private Long WBID;

    /**
     * 支付方式
     * TODO: 23/03/2018 待定
     */
    private Integer ZFFS;

    /**
     * 业务代码: 2000
     */
    private String YWDM;

    /**
     * 委托价格: 原价
     */
    private Double WTJG;

    /**
     * 委托金额: 折后价
     */
    private Double WTJE;

    /**
     * 定价编码
     */
    private String DJBM;

    /**
     * 签约标志: 0
     */
    private Integer QYBZ;

    public String getLCZH() {
        return LCZH;
    }

    public void setLCZH(String LCZH) {
        this.LCZH = LCZH;
    }

    public String getJSZH() {
        return JSZH;
    }

    public void setJSZH(String JSZH) {
        this.JSZH = JSZH;
    }

    public String getFWQD() {
        return FWQD;
    }

    public void setFWQD(String FWQD) {
        this.FWQD = FWQD;
    }

    public String getCPDM() {
        return CPDM;
    }

    public void setCPDM(String CPDM) {
        this.CPDM = CPDM;
    }

    public Integer getCPLX() {
        return CPLX;
    }

    public void setCPLX(Integer CPLX) {
        this.CPLX = CPLX;
    }

    public String getWBLSH() {
        return WBLSH;
    }

    public void setWBLSH(String WBLSH) {
        this.WBLSH = WBLSH;
    }

    public Long getWBID() {
        return WBID;
    }

    public void setWBID(Long WBID) {
        this.WBID = WBID;
    }

    public Integer getZFFS() {
        return ZFFS;
    }

    public void setZFFS(Integer ZFFS) {
        this.ZFFS = ZFFS;
    }

    public String getYWDM() {
        return YWDM;
    }

    public void setYWDM(String YWDM) {
        this.YWDM = YWDM;
    }

    public Double getWTJG() {
        return WTJG;
    }

    public void setWTJG(Double WTJG) {
        this.WTJG = WTJG;
    }

    public Double getWTJE() {
        return WTJE;
    }

    public void setWTJE(Double WTJE) {
        this.WTJE = WTJE;
    }

    public String getDJBM() {
        return DJBM;
    }

    public void setDJBM(String DJBM) {
        this.DJBM = DJBM;
    }

    public Integer getQYBZ() {
        return QYBZ;
    }

    public void setQYBZ(Integer QYBZ) {
        this.QYBZ = QYBZ;
    }
}
