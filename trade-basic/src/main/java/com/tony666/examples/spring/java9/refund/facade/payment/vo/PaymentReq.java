package com.tony666.examples.spring.java9.refund.facade.payment.vo;


import com.tony666.examples.spring.java9.state.constant.payment.AdvisorProductTypeEnum;
import com.tony666.examples.spring.java9.state.constant.payment.PaymentChannelType;
import com.tony666.examples.spring.java9.state.constant.payment.TradeAccountType;

/**
 * 支付请求
 *
 * @author Tony
 */
public class PaymentReq {

    /**
     * 用户Id
     */
    private Long userId;

    /**
     * 用户资金号
     */
    private String accountId;

    /**
     * 交易账号类型(可不传)，默认资金账号
     */
    private TradeAccountType tradeAccountType;

    /**
     * 业务Id:问股Id 观点Id 直播主题Id 组合Id 打赏Id
     */
    private Long businessId;

    /**
     * 业务外部ID
     */
    private String businessOutId;

    /**
     * 投顾ID
     */
    private Long adviserId;

    /**
     * 业务类型: 1问股 2观点 3直播 4组合 5打赏 6偷看
     */
    private AdvisorProductTypeEnum advisorProductTypeEnum;

    /**
     * 摘要
     */
    private String summary;

    /**
     * 产品代码
     */
    private String productCode;

    /**
     * 原价格
     */
    private Long price;

    /**
     * 订单金额
     */
    private Long orderAmount;

    /**
     * 定价编码
     */
    private String priceCode;

    /**
     * 支付回调类名
     */
    private String payRespMethod;

    /**
     * 支付渠道类型
     */
    private PaymentChannelType paymentChannelType;

    /**
     * 业务元数据
     */
    private String businessMetadata;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public TradeAccountType getTradeAccountType() {
        return tradeAccountType;
    }

    public void setTradeAccountType(TradeAccountType tradeAccountType) {
        this.tradeAccountType = tradeAccountType;
    }

    public Long getBusinessId() {
        return businessId;
    }

    public void setBusinessId(Long businessId) {
        this.businessId = businessId;
    }

    public String getBusinessOutId() {
        return businessOutId;
    }

    public void setBusinessOutId(String businessOutId) {
        this.businessOutId = businessOutId;
    }

    public Long getAdviserId() {
        return adviserId;
    }

    public void setAdviserId(Long adviserId) {
        this.adviserId = adviserId;
    }

    public AdvisorProductTypeEnum getAdvisorProductTypeEnum() {
        return advisorProductTypeEnum;
    }

    public void setAdvisorProductTypeEnum(AdvisorProductTypeEnum advisorProductTypeEnum) {
        this.advisorProductTypeEnum = advisorProductTypeEnum;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Long getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(Long orderAmount) {
        this.orderAmount = orderAmount;
    }

    public String getPriceCode() {
        return priceCode;
    }

    public void setPriceCode(String priceCode) {
        this.priceCode = priceCode;
    }

    public String getPayRespMethod() {
        return payRespMethod;
    }

    public void setPayRespMethod(String payRespMethod) {
        this.payRespMethod = payRespMethod;
    }

    public PaymentChannelType getPaymentChannelType() {
        return paymentChannelType;
    }

    public void setPaymentChannelType(PaymentChannelType paymentChannelType) {
        this.paymentChannelType = paymentChannelType;
    }

    public String getBusinessMetadata() {
        return businessMetadata;
    }

    public void setBusinessMetadata(String businessMetadata) {
        this.businessMetadata = businessMetadata;
    }

}
