package com.groupbuy.domain.activity.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TrialBalanceEntity {

    private String goodsId;
    private String goodsName;
    private BigDecimal originalPrice;
    /**
     * 折扣价格
     */
    private BigDecimal deductionPrice;
    private Integer targetCount;
    private Date startTime;
    private Date endTime;
    /**
     * 是否可见拼团
     */
    private Boolean isVisible;
    /**
     * 是否可以参与拼团
     */
    private Boolean isEnable;
}
