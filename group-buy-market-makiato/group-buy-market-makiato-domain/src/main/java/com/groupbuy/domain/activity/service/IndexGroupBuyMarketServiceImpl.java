package com.groupbuy.domain.activity.service;

import com.groupbuy.domain.activity.model.entity.MarketProductEntity;
import com.groupbuy.domain.activity.model.entity.TrialBalanceEntity;
import com.groupbuy.domain.activity.service.trial.factory.DefaultActivityStrategyFactory;
import com.groupbuy.types.design.framework.tree.StrategyHandler;

import javax.annotation.Resource;

public class IndexGroupBuyMarketServiceImpl implements IIndexGroupBuyMarketService {

    @Resource
    private DefaultActivityStrategyFactory defaultActivityStrategyFactory;

    @Override
    public TrialBalanceEntity indexMarketTrial(MarketProductEntity marketProductEntity) throws Exception {
        StrategyHandler<MarketProductEntity, DefaultActivityStrategyFactory.DynamicContext, TrialBalanceEntity> strategyHandler = defaultActivityStrategyFactory.strategyHandler();

        TrialBalanceEntity trialBalanceEntity = strategyHandler.apply(marketProductEntity, new DefaultActivityStrategyFactory.DynamicContext());

        return trialBalanceEntity;
    }
}
