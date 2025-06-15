package com.groupbuy.domain.activity.service.trial;

import com.groupbuy.types.design.framework.tree.AbstractMultiThreadStrategyRouter;
import com.groupbuy.types.design.framework.tree.AbstractStrategyRouter;

public abstract class AbstractGroupBuyMarketSupport<MarketProductEntity, DynamicContext, TrialBalanceEntity> extends AbstractMultiThreadStrategyRouter<MarketProductEntity, DynamicContext, TrialBalanceEntity> {
    @Override
    protected void multiThread(MarketProductEntity requestParameter, DynamicContext dynamicContext) {

    }
}
