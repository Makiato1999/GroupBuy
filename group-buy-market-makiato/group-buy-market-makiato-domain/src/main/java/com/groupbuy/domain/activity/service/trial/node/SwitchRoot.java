package com.groupbuy.domain.activity.service.trial.node;

import com.groupbuy.domain.activity.model.entity.MarketProductEntity;
import com.groupbuy.domain.activity.model.entity.TrialBalanceEntity;
import com.groupbuy.domain.activity.service.trial.AbstractGroupBuyMarketSupport;
import com.groupbuy.domain.activity.service.trial.factory.DefaultActivityStrategyFactory;
import com.groupbuy.types.design.framework.tree.StrategyHandler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Slf4j
@Service
public class SwitchRoot extends AbstractGroupBuyMarketSupport<MarketProductEntity, DefaultActivityStrategyFactory.DynamicContext, TrialBalanceEntity> {
    @Resource
    private MarketNode marketNode;

    @Override
    public TrialBalanceEntity apply(MarketProductEntity requestParameter, DefaultActivityStrategyFactory.DynamicContext dynamicContext) throws Exception {
        return router(requestParameter, dynamicContext);
    }

    @Override
    public StrategyHandler<MarketProductEntity, DefaultActivityStrategyFactory.DynamicContext, TrialBalanceEntity> get(MarketProductEntity requestParameter, DefaultActivityStrategyFactory.DynamicContext dynamicContext) {
        return marketNode;
    }
}
