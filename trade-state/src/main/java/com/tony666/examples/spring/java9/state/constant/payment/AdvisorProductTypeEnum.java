package com.tony666.examples.spring.java9.state.constant.payment;

/**
 * 投顾业务类型
 * @author zhuzhengjie
 *
 */
public enum AdvisorProductTypeEnum {
	TYPE_ASK_STOCK(1, "问股"),
	TYPE_ADVISOR_THEME(2, "观点"),
	TYPE_LIVE_THEME(3, "图文直播"),
	TYPE_INVESTMENT_PORTFOLIO(4, "组合"),
	TYPE_REWARD(5, "打赏"),
	TYPE_ASK_PEEK(6, "问股偷看"),
	TYPE_MULTIMEDIA(7,"音视频"),
	TYPE_COMMENT(8,"评论");
	private int type;

	private String desc;

	AdvisorProductTypeEnum(int type, String desc) {
		this.type = type;
		this.desc = desc;
	}

	public int getType() {
		return type;
	}

	public String getDesc() {
		return desc;
	}

	public static AdvisorProductTypeEnum getEnum(int type) {
		AdvisorProductTypeEnum[] values = AdvisorProductTypeEnum.values();
		for (AdvisorProductTypeEnum enums : values) {
			if (enums.type == type) {
				return enums;
			}
		}
		return null;
	}
}
