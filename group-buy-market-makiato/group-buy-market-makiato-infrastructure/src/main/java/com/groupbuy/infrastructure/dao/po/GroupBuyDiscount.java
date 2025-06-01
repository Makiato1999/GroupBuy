package com.groupbuy.infrastructure.dao.po;

import lombok.Data;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * 拼单折扣实体类，对应表 group_buy_discount
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GroupBuyDiscount {

    /** 自增ID */
    private Long id;

    /** 折扣ID */
    private String discountId;

    /** 折扣标题 */
    private String discountName;

    /** 折扣描述 */
    private String discountDesc;

    /** 折扣类型（0:base、1:tag） */
    private Integer discountType;

    /** 营销优惠计划（ZJ:直减、MJ:满减、N元购） */
    private String marketPlan;

    /** 营销优惠表达式 */
    private String marketExpr;

    /** 人群标签，特定优惠限定 */
    private String tagId;

    /** 创建时间 */
    private Date createTime;

    /** 更新时间 */
    private Date updateTime;
}
