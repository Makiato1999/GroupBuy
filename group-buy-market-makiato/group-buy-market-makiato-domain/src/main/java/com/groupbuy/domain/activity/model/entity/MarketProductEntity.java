package com.groupbuy.domain.activity.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MarketProductEntity {

    private String userId;
    private String goodsId;
    /**
     * 来源
     */
    private String source;
    /**
     * 渠道
     */
    private String channel;
}
